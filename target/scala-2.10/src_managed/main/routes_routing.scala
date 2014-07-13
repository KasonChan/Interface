// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:7007d5cd508d61c2b875122a862b20cf05261e8b
// @DATE:Sun Jul 13 15:04:26 CDT 2014


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
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:8
private[this] lazy val controllers_Users_signin1 = Route("POST", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:11
private[this] lazy val controllers_Users_logout2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_Application_guest3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:16
private[this] lazy val controllers_Files_upload4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:19
private[this] lazy val controllers_Application_test5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:22
private[this] lazy val controllers_Application_signup6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:24
private[this] lazy val controllers_Users_create7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:27
private[this] lazy val controllers_Users_listUser8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Users_edit9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Destinations_listDest10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateDest/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:34
private[this] lazy val controllers_Destinations_edit11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("updateDest/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:37
private[this] lazy val controllers_Application_destination12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:39
private[this] lazy val controllers_Destinations_create13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:42
private[this] lazy val controllers_Submissions_submit14 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submission"))))
        

// @LINE:44
private[this] lazy val controllers_Files_upload15 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("submission"))))
        

// @LINE:47
private[this] lazy val controllers_Users_list16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:50
private[this] lazy val controllers_Destinations_list17 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destinations"))))
        

// @LINE:53
private[this] lazy val controllers_Assets_at18 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix,"""controllers.Users.signin"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Users.logout"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Application.guest"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Files.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.test"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Users.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>""","""controllers.Users.listUser(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>""","""controllers.Users.edit(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateDest/$username<[^/]+>""","""controllers.Destinations.listDest(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """updateDest/$username<[^/]+>""","""controllers.Destinations.edit(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Application.destination"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Destinations.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submission""","""controllers.Submissions.submit"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """submission""","""controllers.Files.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destinations""","""controllers.Destinations.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index, HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
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
case controllers_Application_guest3(params) => {
   call { 
        invokeHandler(controllers.Application.guest, HandlerDef(this, "controllers.Application", "guest", Nil,"GET", """ Guest page""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:16
case controllers_Files_upload4(params) => {
   call { 
        invokeHandler(controllers.Files.upload, HandlerDef(this, "controllers.Files", "upload", Nil,"POST", """""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:19
case controllers_Application_test5(params) => {
   call { 
        invokeHandler(controllers.Application.test, HandlerDef(this, "controllers.Application", "test", Nil,"GET", """ Test page""", Routes.prefix + """test"""))
   }
}
        

// @LINE:22
case controllers_Application_signup6(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """ Signup page""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:24
case controllers_Users_create7(params) => {
   call { 
        invokeHandler(controllers.Users.create, HandlerDef(this, "controllers.Users", "create", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:27
case controllers_Users_listUser8(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]),"GET", """ Update account page""", Routes.prefix + """update/$username<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Users_edit9(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Users.edit(username), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[String]),"POST", """""", Routes.prefix + """update/$username<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Destinations_listDest10(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Destinations.listDest(username), HandlerDef(this, "controllers.Destinations", "listDest", Seq(classOf[String]),"GET", """ Update destination page""", Routes.prefix + """updateDest/$username<[^/]+>"""))
   }
}
        

// @LINE:34
case controllers_Destinations_edit11(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Destinations.edit(username), HandlerDef(this, "controllers.Destinations", "edit", Seq(classOf[String]),"POST", """""", Routes.prefix + """updateDest/$username<[^/]+>"""))
   }
}
        

// @LINE:37
case controllers_Application_destination12(params) => {
   call { 
        invokeHandler(controllers.Application.destination, HandlerDef(this, "controllers.Application", "destination", Nil,"GET", """ Destination page""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:39
case controllers_Destinations_create13(params) => {
   call { 
        invokeHandler(controllers.Destinations.create, HandlerDef(this, "controllers.Destinations", "create", Nil,"POST", """""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:42
case controllers_Submissions_submit14(params) => {
   call { 
        invokeHandler(controllers.Submissions.submit, HandlerDef(this, "controllers.Submissions", "submit", Nil,"GET", """ Submission page""", Routes.prefix + """submission"""))
   }
}
        

// @LINE:44
case controllers_Files_upload15(params) => {
   call { 
        invokeHandler(controllers.Files.upload, HandlerDef(this, "controllers.Files", "upload", Nil,"POST", """""", Routes.prefix + """submission"""))
   }
}
        

// @LINE:47
case controllers_Users_list16(params) => {
   call { 
        invokeHandler(controllers.Users.list, HandlerDef(this, "controllers.Users", "list", Nil,"GET", """ Users page""", Routes.prefix + """users"""))
   }
}
        

// @LINE:50
case controllers_Destinations_list17(params) => {
   call { 
        invokeHandler(controllers.Destinations.list, HandlerDef(this, "controllers.Destinations", "list", Nil,"GET", """ Destinations page""", Routes.prefix + """destinations"""))
   }
}
        

// @LINE:53
case controllers_Assets_at18(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     