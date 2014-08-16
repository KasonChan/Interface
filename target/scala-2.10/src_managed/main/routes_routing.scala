// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:963b453b3941ad35a2b6b570403c107991ff20fd
// @DATE:Fri Aug 15 16:45:05 CDT 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_signin0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Users_signin1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_Users_logout2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_Application_signup3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:16
private[this] lazy val controllers_Users_create4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:19
private[this] lazy val controllers_Users_listUser5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:21
private[this] lazy val controllers_Users_edit6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true),StaticPart("/"),DynamicPart("action", """[^/]+""",true))))
        

// @LINE:24
private[this] lazy val controllers_Destinations_listDest7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateDest/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:26
private[this] lazy val controllers_Destinations_edit8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateDest/"),DynamicPart("username", """[^/]+""",true),StaticPart("/"),DynamicPart("actionTaken", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Application_destination9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:31
private[this] lazy val controllers_Destinations_create10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:34
private[this] lazy val controllers_Application_submission11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submission"))))
        

// @LINE:36
private[this] lazy val controllers_Submissions_submission12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submission"))))
        

// @LINE:39
private[this] lazy val controllers_Users_list13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:42
private[this] lazy val controllers_Destinations_list14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destinations"))))
        

// @LINE:45
private[this] lazy val controllers_Assets_at15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.signin"""),("""POST""", prefix,"""controllers.Users.signin"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Users.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Users.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>""","""controllers.Users.listUser(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>/$action<[^/]+>""","""controllers.Users.edit(username:String, action:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateDest/$username<[^/]+>""","""controllers.Destinations.listDest(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateDest/$username<[^/]+>/$actionTaken<[^/]+>""","""controllers.Destinations.edit(username:String, actionTaken:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Application.destination"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Destinations.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submission""","""controllers.Application.submission"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submission""","""controllers.Submissions.submission"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destinations""","""controllers.Destinations.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_signin0(params) => {
   call { 
        invokeHandler(controllers.Application.signin, HandlerDef(this, "controllers.Application", "signin", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:8
case controllers_Users_signin1(params) => {
   call { 
        invokeHandler(controllers.Users.signin, HandlerDef(this, "controllers.Users", "signin", Nil,"POST", """""", Routes.prefix + """"""))
   }
}
        

// @LINE:11
case controllers_Users_logout2(params) => {
   call { 
        invokeHandler(controllers.Users.logout, HandlerDef(this, "controllers.Users", "logout", Nil,"POST", """ Logout""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_Application_signup3(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """ Signup page""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:16
case controllers_Users_create4(params) => {
   call { 
        invokeHandler(controllers.Users.create, HandlerDef(this, "controllers.Users", "create", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:19
case controllers_Users_listUser5(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]),"GET", """ Update account page""", Routes.prefix + """update/$username<[^/]+>"""))
   }
}
        

// @LINE:21
case controllers_Users_edit6(params) => {
   call(params.fromPath[String]("username", None), params.fromPath[String]("action", None)) { (username, action) =>
        invokeHandler(controllers.Users.edit(username, action), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """update/$username<[^/]+>/$action<[^/]+>"""))
   }
}
        

// @LINE:24
case controllers_Destinations_listDest7(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Destinations.listDest(username), HandlerDef(this, "controllers.Destinations", "listDest", Seq(classOf[String]),"POST", """ Update destination page""", Routes.prefix + """updateDest/$username<[^/]+>"""))
   }
}
        

// @LINE:26
case controllers_Destinations_edit8(params) => {
   call(params.fromPath[String]("username", None), params.fromPath[String]("actionTaken", None)) { (username, actionTaken) =>
        invokeHandler(controllers.Destinations.edit(username, actionTaken), HandlerDef(this, "controllers.Destinations", "edit", Seq(classOf[String], classOf[String]),"POST", """""", Routes.prefix + """updateDest/$username<[^/]+>/$actionTaken<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Application_destination9(params) => {
   call { 
        invokeHandler(controllers.Application.destination, HandlerDef(this, "controllers.Application", "destination", Nil,"GET", """ Destination page""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:31
case controllers_Destinations_create10(params) => {
   call { 
        invokeHandler(controllers.Destinations.create, HandlerDef(this, "controllers.Destinations", "create", Nil,"POST", """""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:34
case controllers_Application_submission11(params) => {
   call { 
        invokeHandler(controllers.Application.submission, HandlerDef(this, "controllers.Application", "submission", Nil,"GET", """ Submission page""", Routes.prefix + """submission"""))
   }
}
        

// @LINE:36
case controllers_Submissions_submission12(params) => {
   call { 
        invokeHandler(controllers.Submissions.submission, HandlerDef(this, "controllers.Submissions", "submission", Nil,"POST", """""", Routes.prefix + """submission"""))
   }
}
        

// @LINE:39
case controllers_Users_list13(params) => {
   call { 
        invokeHandler(controllers.Users.list, HandlerDef(this, "controllers.Users", "list", Nil,"GET", """ Users page""", Routes.prefix + """users"""))
   }
}
        

// @LINE:42
case controllers_Destinations_list14(params) => {
   call { 
        invokeHandler(controllers.Destinations.list, HandlerDef(this, "controllers.Destinations", "list", Nil,"GET", """ Destinations page""", Routes.prefix + """destinations"""))
   }
}
        

// @LINE:45
case controllers_Assets_at15(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     