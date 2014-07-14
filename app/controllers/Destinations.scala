package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Flash
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.User
import models.Destination

object Destinations extends Controller {
  // Empty list of messages
  val emptyMessages = List("")

  def create = Action { request =>
    request.session.get("connected").map { username =>
      // Get destination information from the form
      def destinationUsername =
        request.body.asFormUrlEncoded.get("destinationUsername")(0)
      def destinationHostname =
        request.body.asFormUrlEncoded.get("destinationHostname")(0)
      def destinationPassword =
        request.body.asFormUrlEncoded.get("destinationPassword")(0)

      val user = User.get(username)
      var errors = List("")

      // // Check if user not existed in user table
      // if (user == User("", "", "", "")) {
      //   errors = List(Messages("destination.error.user.existed"))
      // }

      val destination = Destination.find(username, destinationUsername,
        destinationHostname)

      // Check if the destination is existed with the username
      if (!destination.isEmpty) {
        errors = List(Messages("destination.error.destination.user.existed"))
      }

      // If there is no errors
      if (errors == List("")) {
        val newDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)

        Destination.insert(newDestination)
        // Display destinations
        Redirect(routes.Application.submission)
      } else {
        val invalidDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)

        // Return to the form with error messages
        Ok(views.html.destination(emptyMessages)(errors)(user)(invalidDestination))
      }
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  def list = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get the list of destinations
      val destinations = Destination.getAll

      // Show the list of destinations information
      Ok(views.html.listDest(destinations))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  def listDest(username: String) = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get destination information of the user from database
      val destinations = Destination.get(username)

      var errors = List("")
      val user = User.get(username)

      // Attach error message if the list of destination is empty
      if (destinations.isEmpty) {
        errors = List(Messages("destination.empty"))
      }

      // Show the destination information
      Ok(views.html.updateDest(emptyMessages)(errors)(user)(destinations))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  def edit(username: String, action: String) = Action {
    implicit request =>
      request.session.get("connected").map { username =>
        // Get destination information from the form
        def destinationUsername =
          request.body.asFormUrlEncoded.get("destinationUsername")(0)
        def destinationHostname =
          request.body.asFormUrlEncoded.get("destinationHostname")(0)
        def destinationPassword =
          request.body.asFormUrlEncoded.get("destinationPassword")(0)

        var errors = List("")
        var messages = List("")

        val user = User.get(username)

        var editDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)

        if (action == "updated") {
          // Update destination into the database
          Destination.update(editDestination)

          messages = List(Messages("update.destination.success"))
        } else if (action == "deleted") {
          // Delete destination from the database
          Destination.delete(editDestination)

          messages = List(Messages("update.destination.success.deleted"))
        }

        // Get the list of destinations of the user from database
        val destinations = Destination.get(username)

        // Attach error message if the list of destination is empty
        if (destinations.isEmpty) {
          errors = List(Messages("destination.empty"))
        }

        // Redirect the page to show updated destination information
        Ok(views.html.updateDest(messages)(errors)(user)(destinations))
      }.getOrElse {
        Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
      }
  }

  // def update(username: String) = Action { implicit request =>
  //   request.session.get("connected").map { username =>
  //     // Get destination information from the form
  //     def destinationUsername =
  //       request.body.asFormUrlEncoded.get("destinationUsername")(0)
  //     def destinationHostname =
  //       request.body.asFormUrlEncoded.get("destinationHostname")(0)
  //     def destinationPassword =
  //       request.body.asFormUrlEncoded.get("destinationPassword")(0)

  //     // Update destination into the database
  //     val updateDestination = Destination(username, destinationUsername,
  //       destinationHostname, destinationPassword)
  //     Destination.update(updateDestination)

  //     // Redirect the page to show updated destination information
  //     Redirect(routes.Destinations.listDest(username))
  //   }.getOrElse {
  //     Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
  //   }
  // }

  // def delete(username: String) = Action { implicit request =>
  //   request.session.get("connected").map { username =>
  //     // Get destination information from the form
  //     def destinationUsername =
  //       request.body.asFormUrlEncoded.get("destinationUsername")(0)
  //     def destinationHostname =
  //       request.body.asFormUrlEncoded.get("destinationHostname")(0)
  //     def destinationPassword =
  //       request.body.asFormUrlEncoded.get("destinationPassword")(0)

  //     // Delete destination from the database
  //     val deleteDestination = Destination(username, destinationUsername,
  //       destinationHostname, destinationPassword)
  //     Destination.delete(deleteDestination)

  //     // Redirect the page to show updated destination information
  //     Redirect(routes.Destinations.listDest(username))
  //   }.getOrElse {
  //     Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
  //   }
  // }
}