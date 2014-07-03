// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:1ece62c31ef3200c9fd4998a4345cf1c2339447c
// @DATE:Thu Jul 03 11:20:11 CDT 2014


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
        

// @LINE:9
private[this] lazy val controllers_Application_signup1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:12
private[this] lazy val controllers_Application_guest2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:14
private[this] lazy val controllers_Files_upload3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("guest"))))
        

// @LINE:17
private[this] lazy val controllers_Application_test4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:19
private[this] lazy val controllers_Files_upload5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("test"))))
        

// @LINE:22
private[this] lazy val controllers_Assets_at6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Application.guest"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """guest""","""controllers.Files.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Application.test"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """test""","""controllers.Files.upload"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
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
        

// @LINE:9
case controllers_Application_signup1(params) => {
   call { 
        invokeHandler(controllers.Application.signup, HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """ Signup page""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:12
case controllers_Application_guest2(params) => {
   call { 
        invokeHandler(controllers.Application.guest, HandlerDef(this, "controllers.Application", "guest", Nil,"GET", """ Guest page""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:14
case controllers_Files_upload3(params) => {
   call { 
        invokeHandler(controllers.Files.upload, HandlerDef(this, "controllers.Files", "upload", Nil,"POST", """""", Routes.prefix + """guest"""))
   }
}
        

// @LINE:17
case controllers_Application_test4(params) => {
   call { 
        invokeHandler(controllers.Application.test, HandlerDef(this, "controllers.Application", "test", Nil,"GET", """ Test page""", Routes.prefix + """test"""))
   }
}
        

// @LINE:19
case controllers_Files_upload5(params) => {
   call { 
        invokeHandler(controllers.Files.upload, HandlerDef(this, "controllers.Files", "upload", Nil,"POST", """""", Routes.prefix + """test"""))
   }
}
        

// @LINE:22
case controllers_Assets_at6(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     