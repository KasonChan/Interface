// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:1ece62c31ef3200c9fd4998a4345cf1c2339447c
// @DATE:Wed Jul 02 13:32:44 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:19
// @LINE:14
class ReverseFiles {
    

// @LINE:19
// @LINE:14
def upload(): Call = {
   () match {
// @LINE:14
case () if true => Call("POST", _prefix + { _defaultPrefix } + "guest")
                                                        
// @LINE:19
case () if true => Call("POST", _prefix + { _defaultPrefix } + "test")
                                                        
   }
}
                                                
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def guest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "guest")
}
                                                

// @LINE:9
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:17
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          
}
                  


// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:19
// @LINE:14
class ReverseFiles {
    

// @LINE:19
// @LINE:14
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Files.upload",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
      }
   """
)
                        
    
}
              

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:17
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def guest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.guest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        

// @LINE:9
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
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
                        

// @LINE:17
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
        


// @LINE:22
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:19
// @LINE:14
class ReverseFiles {
    

// @LINE:14
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Files.upload(), HandlerDef(this, "controllers.Files", "upload", Seq(), "POST", """""", _prefix + """guest""")
)
                      
    
}
                          

// @LINE:22
class ReverseAssets {
    

// @LINE:22
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:12
def guest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.guest(), HandlerDef(this, "controllers.Application", "guest", Seq(), "GET", """ Guest page""", _prefix + """guest""")
)
                      

// @LINE:9
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """ Signup page""", _prefix + """signup""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:17
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """ Test page""", _prefix + """test""")
)
                      
    
}
                          
}
        
    