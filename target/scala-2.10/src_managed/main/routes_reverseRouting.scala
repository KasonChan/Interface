// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:088777a058534adc68771de458480404170f33ec
// @DATE:Fri Jul 11 17:24:34 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:40
// @LINE:37
// @LINE:35
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:24
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:11
def logout(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:8
def signin(): Call = {
   Call("POST", _prefix)
}
                                                

// @LINE:30
def listUser(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:27
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                

// @LINE:32
def update(username:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                
    
}
                          

// @LINE:48
class ReverseSubmissions {
    

// @LINE:48
def submit(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "submission")
}
                                                
    
}
                          

// @LINE:45
// @LINE:42
// @LINE:37
// @LINE:35
class ReverseDestinations {
    

// @LINE:45
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "destinations")
}
                                                

// @LINE:42
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "destination")
}
                                                

// @LINE:35
def listDest(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "updateDest/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:37
def update(username:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateDest/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                
    
}
                          

// @LINE:50
// @LINE:16
class ReverseFiles {
    

// @LINE:50
// @LINE:16
def upload(): Call = {
   () match {
// @LINE:16
case () if true => Call("POST", _prefix + { _defaultPrefix } + "guest")
                                                        
// @LINE:50
case () if true => Call("POST", _prefix + { _defaultPrefix } + "submission")
                                                        
   }
}
                                                
    
}
                          

// @LINE:40
// @LINE:22
// @LINE:19
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def destination(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "destination")
}
                                                

// @LINE:22
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:19
def test(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "test")
}
                                                

// @LINE:14
def guest(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "guest")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:40
// @LINE:37
// @LINE:35
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:24
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:11
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.logout",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:8
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.signin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:30
def listUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.listUser",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:27
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        

// @LINE:32
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.update",
   """
      function(username) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        
    
}
              

// @LINE:48
class ReverseSubmissions {
    

// @LINE:48
def submit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Submissions.submit",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submission"})
      }
   """
)
                        
    
}
              

// @LINE:45
// @LINE:42
// @LINE:37
// @LINE:35
class ReverseDestinations {
    

// @LINE:45
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destinations"})
      }
   """
)
                        

// @LINE:42
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
      }
   """
)
                        

// @LINE:35
def listDest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.listDest",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:37
def update : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.update",
   """
      function(username) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        
    
}
              

// @LINE:50
// @LINE:16
class ReverseFiles {
    

// @LINE:50
// @LINE:16
def upload : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Files.upload",
   """
      function() {
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "guest"})
      }
      if (true) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submission"})
      }
      }
   """
)
                        
    
}
              

// @LINE:40
// @LINE:22
// @LINE:19
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def destination : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.destination",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
      }
   """
)
                        

// @LINE:22
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:19
def test : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.test",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "test"})
      }
   """
)
                        

// @LINE:14
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
                        
    
}
              
}
        


// @LINE:53
// @LINE:50
// @LINE:48
// @LINE:45
// @LINE:42
// @LINE:40
// @LINE:37
// @LINE:35
// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:22
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:53
class ReverseAssets {
    

// @LINE:53
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:32
// @LINE:30
// @LINE:27
// @LINE:24
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:24
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.create(), HandlerDef(this, "controllers.Users", "create", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:11
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.logout(), HandlerDef(this, "controllers.Users", "logout", Seq(), "POST", """ Logout""", _prefix + """logout""")
)
                      

// @LINE:8
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.signin(), HandlerDef(this, "controllers.Users", "signin", Seq(), "POST", """""", _prefix + """""")
)
                      

// @LINE:30
def listUser(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]), "GET", """ Update page""", _prefix + """update/$username<[^/]+>""")
)
                      

// @LINE:27
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """ Users page""", _prefix + """users""")
)
                      

// @LINE:32
def update(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.update(username), HandlerDef(this, "controllers.Users", "update", Seq(classOf[String]), "POST", """""", _prefix + """update/$username<[^/]+>""")
)
                      
    
}
                          

// @LINE:48
class ReverseSubmissions {
    

// @LINE:48
def submit(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Submissions.submit(), HandlerDef(this, "controllers.Submissions", "submit", Seq(), "GET", """ Submission page""", _prefix + """submission""")
)
                      
    
}
                          

// @LINE:45
// @LINE:42
// @LINE:37
// @LINE:35
class ReverseDestinations {
    

// @LINE:45
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.list(), HandlerDef(this, "controllers.Destinations", "list", Seq(), "GET", """ Destinations page""", _prefix + """destinations""")
)
                      

// @LINE:42
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.create(), HandlerDef(this, "controllers.Destinations", "create", Seq(), "POST", """""", _prefix + """destination""")
)
                      

// @LINE:35
def listDest(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.listDest(username), HandlerDef(this, "controllers.Destinations", "listDest", Seq(classOf[String]), "GET", """ Update destination page""", _prefix + """updateDest/$username<[^/]+>""")
)
                      

// @LINE:37
def update(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.update(username), HandlerDef(this, "controllers.Destinations", "update", Seq(classOf[String]), "POST", """""", _prefix + """updateDest/$username<[^/]+>""")
)
                      
    
}
                          

// @LINE:50
// @LINE:16
class ReverseFiles {
    

// @LINE:16
def upload(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Files.upload(), HandlerDef(this, "controllers.Files", "upload", Seq(), "POST", """""", _prefix + """guest""")
)
                      
    
}
                          

// @LINE:40
// @LINE:22
// @LINE:19
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:40
def destination(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.destination(), HandlerDef(this, "controllers.Application", "destination", Seq(), "GET", """ Destination page""", _prefix + """destination""")
)
                      

// @LINE:22
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """ Signup page""", _prefix + """signup""")
)
                      

// @LINE:19
def test(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.test(), HandlerDef(this, "controllers.Application", "test", Seq(), "GET", """ Test page""", _prefix + """test""")
)
                      

// @LINE:14
def guest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.guest(), HandlerDef(this, "controllers.Application", "guest", Seq(), "GET", """ Guest page""", _prefix + """guest""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    