// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:50b0310913ff5ca9459663cfbab9c47fa8947f42
// @DATE:Sat Jul 05 12:15:59 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:26
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers {

// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "guest")
}
                                                
    
}
                          

// @LINE:23
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:19
def signup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:23
def update(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                
    
}
                          

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def guest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "guest")
}
                                                

// @LINE:17
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:14
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                
    
}
                          
}
                  


// @LINE:26
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Files.upload",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        
    
}
              

// @LINE:23
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:19
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.signup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:23
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        
    
}
              

// @LINE:26
class ReverseAssets {
    

// @LINE:26
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
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def guest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.guest",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
   """
)
                        

// @LINE:17
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
                        

// @LINE:14
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
        


// @LINE:26
// @LINE:23
// @LINE:21
// @LINE:19
// @LINE:17
// @LINE:14
// @LINE:11
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:11
class ReverseFiles {
    

// @LINE:11
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Files.upload(), HandlerDef(this, "controllers.Files", "upload", Seq(), "POST", """""", _prefix + """guest""")
)
                      
    
}
                          

// @LINE:23
// @LINE:21
// @LINE:19
class ReverseUsers {
    

// @LINE:21
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """""", _prefix + """users""")
)
                      

// @LINE:19
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.signup(), HandlerDef(this, "controllers.Users", "signup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:23
def update(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(username), HandlerDef(this, "controllers.Users", "update", Seq(classOf[String]), "GET", """""", _prefix + """update/$username<[^/]+>""")
)
                      
    
}
                          

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:17
// @LINE:14
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:9
def guest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.guest(), HandlerDef(this, "controllers.Application", "guest", Seq(), "GET", """ Guest page""", _prefix + """guest""")
)
                      

// @LINE:17
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """ Signup page""", _prefix + """signup""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """ Test page""", _prefix + """test""")
)
                      
    
}
                          
}
        
    