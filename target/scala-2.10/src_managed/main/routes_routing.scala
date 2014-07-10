// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:9c4fc8c445f49263cedb3731412e1d686d8dd9b1
// @DATE:Wed Jul 09 23:46:42 CDT 2014


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
private[this] lazy val controllers_Application_guest2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:13
private[this] lazy val controllers_Files_upload3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:16
private[this] lazy val controllers_Application_test4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:19
private[this] lazy val controllers_Application_signup5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:21
private[this] lazy val controllers_Users_create6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:24
private[this] lazy val controllers_Users_list7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("users"))))
        

// @LINE:27
private[this] lazy val controllers_Users_listUser8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:29
private[this] lazy val controllers_Users_update9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("update/"),DynamicPart("username", """[^/]+""",true))))
        

// @LINE:32
private[this] lazy val controllers_Application_destination10 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:34
private[this] lazy val controllers_Destinations_create11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destination"))))
        

// @LINE:37
private[this] lazy val controllers_Destinations_list12 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("destinations"))))
        

// @LINE:40
private[this] lazy val controllers_Assets_at13 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""POST""", prefix,"""controllers.Users.signin"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Application.guest"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Files.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.test"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Users.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """users""","""controllers.Users.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>""","""controllers.Users.listUser(username:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """update/$username<[^/]+>""","""controllers.Users.update(username:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Application.destination"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destination""","""controllers.Destinations.create"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """destinations""","""controllers.Destinations.list"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
case controllers_Application_guest2(params) => {
   call { 
        invokeHandler(controllers.Application.guest, HandlerDef(this, "controllers.Application", "guest", Nil,"GET", """ Guest page""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:13
case controllers_Files_upload3(params) => {
   call { 
        invokeHandler(controllers.Files.upload, HandlerDef(this, "controllers.Files", "upload", Nil,"POST", """""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:16
case controllers_Application_test4(params) => {
   call { 
        invokeHandler(controllers.Application.test, HandlerDef(this, "controllers.Application", "test", Nil,"GET", """ Test page""", Routes.prefix + """test"""))
   }
}
        

// @LINE:19
case controllers_Application_signup5(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """ Signup page""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:21
case controllers_Users_create6(params) => {
   call { 
        invokeHandler(controllers.Users.create, HandlerDef(this, "controllers.Users", "create", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:24
case controllers_Users_list7(params) => {
   call { 
        invokeHandler(controllers.Users.list, HandlerDef(this, "controllers.Users", "list", Nil,"GET", """ Users page""", Routes.prefix + """users"""))
   }
}
        

// @LINE:27
case controllers_Users_listUser8(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]),"GET", """ Update page""", Routes.prefix + """update/$username<[^/]+>"""))
   }
}
        

// @LINE:29
case controllers_Users_update9(params) => {
   call(params.fromPath[String]("username", None)) { (username) =>
        invokeHandler(controllers.Users.update(username), HandlerDef(this, "controllers.Users", "update", Seq(classOf[String]),"POST", """""", Routes.prefix + """update/$username<[^/]+>"""))
   }
}
        

// @LINE:32
case controllers_Application_destination10(params) => {
   call { 
        invokeHandler(controllers.Application.destination, HandlerDef(this, "controllers.Application", "destination", Nil,"GET", """ Destination page""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:34
case controllers_Destinations_create11(params) => {
   call { 
        invokeHandler(controllers.Destinations.create, HandlerDef(this, "controllers.Destinations", "create", Nil,"POST", """""", Routes.prefix + """destination"""))
   }
}
        

// @LINE:37
case controllers_Destinations_list12(params) => {
   call { 
        invokeHandler(controllers.Destinations.list, HandlerDef(this, "controllers.Destinations", "list", Nil,"GET", """ Destinations page""", Routes.prefix + """destinations"""))
   }
}
        

// @LINE:40
case controllers_Assets_at13(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     