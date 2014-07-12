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

      // Check if user not existed in user table
      if (user.isEmpty) {
        errors = List(Messages("destination.error.user.existed"))
      }

      val destination = Destination.find(username, destinationUsername,
        destinationHostname)

      // Check if the destination is existed with the username
      if (!destination.isEmpty) {
        errors =
          errors :+ Messages("destination.error.destination.user.existed")
      }

      // If there is no errors
      if (errors == List("")) {
        val newDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)

        Destination.insert(newDestination)
        // Display destinations
        Redirect(routes.Destinations.list)
      } else {
        val invalidDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)

        // Return to the form with error messages
        Ok(views.html.destination(errors)(user(0))(invalidDestination))
      }
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }

  def list = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get the list of destinations
      val destinations = Destination.getAll

      // Show the list of destinations information
      Ok(views.html.listDest(destinations))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }

  def listDest(username: String) = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get destination information of the user from database
      val destinations = Destination.get(username)

      var errors = List("")

      if (destinations.isEmpty) {
        errors = List(Messages("destination.empty"))
        // Show the destination information
        Ok(views.html.updateDest(errors)(destinations))
      }

      Ok(views.html.updateDest(errors)(destinations))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }

  def edit(action: String) = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get destination information from the form
      def destinationUsername =
        request.body.asFormUrlEncoded.get("destinationUsername")(0)
      def destinationHostname =
        request.body.asFormUrlEncoded.get("destinationHostname")(0)
      def destinationPassword =
        request.body.asFormUrlEncoded.get("destinationPassword")(0)

      if (action == "update") {
        // Update destination into the database
        val updateDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)
        Destination.update(updateDestination)
      } else if (action == "delete") {
        // Delete destination from the database
        val deleteDestination = Destination(username, destinationUsername,
          destinationHostname, destinationPassword)
        Destination.delete(deleteDestination)
      }

      // Redirect the page to show updated destination information
      Redirect(routes.Destinations.listDest(username))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
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
  //     Ok(views.html.badRequest(Messages("bad.request.not.connected")))
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
  //     Ok(views.html.badRequest(Messages("bad.request.not.connected")))
  //   }
  // }
}