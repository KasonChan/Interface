// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:7b6cd29dae2b21bc1106188ce74b7e15342a3f31
// @DATE:Tue Jun 24 16:11:44 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers {

// @LINE:12
class ReverseFile {
    

// @LINE:12
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def guest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "guest")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:12
class ReverseFile {
    

// @LINE:12
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.File.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        
    
}
              

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def guest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.guest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:10
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:12
class ReverseFile {
    

// @LINE:12
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.File.upload(), HandlerDef(this, "controllers.File", "upload", Seq(), "POST", """""", _prefix + """test""")
)
                      
    
}
                          

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:10
// @LINE:8
// @LINE:6
class ReverseApplication {
    

// @LINE:8
def guest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.guest(), HandlerDef(this, "controllers.Application", "guest", Seq(), "GET", """""", _prefix + """guest""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """""", _prefix + """test""")
)
                      
    
}
                          
}
        
    