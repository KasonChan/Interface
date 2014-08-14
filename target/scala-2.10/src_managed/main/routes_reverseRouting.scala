// @SOURCE:/home/ka-son/Documents/Interface/conf/routes
// @HASH:963b453b3941ad35a2b6b570403c107991ff20fd
// @DATE:Thu Aug 14 14:43:46 CDT 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:34
// @LINE:31
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers {

// @LINE:45
class ReverseAssets {
    

// @LINE:45
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:39
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:16
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
                                                

// @LINE:19
def listUser(username:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                

// @LINE:21
def edit(username:String, action:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "update/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/" + implicitly[PathBindable[String]].unbind("action", dynamicString(action)))
}
                                                

// @LINE:39
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "users")
}
                                                
    
}
                          

// @LINE:36
class ReverseSubmissions {
    

// @LINE:36
def submission(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "submission")
}
                                                
    
}
                          

// @LINE:42
// @LINE:31
// @LINE:26
// @LINE:24
class ReverseDestinations {
    

// @LINE:26
def edit(username:String, actionTaken:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateDest/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)) + "/" + implicitly[PathBindable[String]].unbind("actionTaken", dynamicString(actionTaken)))
}
                                                

// @LINE:42
def list(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "destinations")
}
                                                

// @LINE:31
def create(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "destination")
}
                                                

// @LINE:24
def listDest(username:String): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "updateDest/" + implicitly[PathBindable[String]].unbind("username", dynamicString(username)))
}
                                                
    
}
                          

// @LINE:34
// @LINE:29
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signin(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:14
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:29
def destination(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "destination")
}
                                                

// @LINE:34
def submission(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "submission")
}
                                                
    
}
                          
}
                  


// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:34
// @LINE:31
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:45
class ReverseAssets {
    

// @LINE:45
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:39
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:16
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
                        

// @LINE:19
def listUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.listUser",
   """
      function(username) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        

// @LINE:21
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.edit",
   """
      function(username,action) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "update/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("action", encodeURIComponent(action))})
      }
   """
)
                        

// @LINE:39
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Users.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
      }
   """
)
                        
    
}
              

// @LINE:36
class ReverseSubmissions {
    

// @LINE:36
def submission : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Submissions.submission",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "submission"})
      }
   """
)
                        
    
}
              

// @LINE:42
// @LINE:31
// @LINE:26
// @LINE:24
class ReverseDestinations {
    

// @LINE:26
def edit : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.edit",
   """
      function(username,actionTaken) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("actionTaken", encodeURIComponent(actionTaken))})
      }
   """
)
                        

// @LINE:42
def list : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.list",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destinations"})
      }
   """
)
                        

// @LINE:31
def create : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.create",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
      }
   """
)
                        

// @LINE:24
def listDest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Destinations.listDest",
   """
      function(username) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "updateDest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("username", encodeURIComponent(username))})
      }
   """
)
                        
    
}
              

// @LINE:34
// @LINE:29
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signin",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:14
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:29
def destination : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.destination",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "destination"})
      }
   """
)
                        

// @LINE:34
def submission : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.submission",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "submission"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:45
// @LINE:42
// @LINE:39
// @LINE:36
// @LINE:34
// @LINE:31
// @LINE:29
// @LINE:26
// @LINE:24
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:14
// @LINE:11
// @LINE:8
// @LINE:6
package controllers.ref {


// @LINE:45
class ReverseAssets {
    

// @LINE:45
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:39
// @LINE:21
// @LINE:19
// @LINE:16
// @LINE:11
// @LINE:8
class ReverseUsers {
    

// @LINE:16
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
                      

// @LINE:19
def listUser(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.listUser(username), HandlerDef(this, "controllers.Users", "listUser", Seq(classOf[String]), "GET", """ Update account page""", _prefix + """update/$username<[^/]+>""")
)
                      

// @LINE:21
def edit(username:String, action:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.edit(username, action), HandlerDef(this, "controllers.Users", "edit", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """update/$username<[^/]+>/$action<[^/]+>""")
)
                      

// @LINE:39
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Users.list(), HandlerDef(this, "controllers.Users", "list", Seq(), "GET", """ Users page""", _prefix + """users""")
)
                      
    
}
                          

// @LINE:36
class ReverseSubmissions {
    

// @LINE:36
def submission(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Submissions.submission(), HandlerDef(this, "controllers.Submissions", "submission", Seq(), "POST", """""", _prefix + """submission""")
)
                      
    
}
                          

// @LINE:42
// @LINE:31
// @LINE:26
// @LINE:24
class ReverseDestinations {
    

// @LINE:26
def edit(username:String, actionTaken:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.edit(username, actionTaken), HandlerDef(this, "controllers.Destinations", "edit", Seq(classOf[String], classOf[String]), "POST", """""", _prefix + """updateDest/$username<[^/]+>/$actionTaken<[^/]+>""")
)
                      

// @LINE:42
def list(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.list(), HandlerDef(this, "controllers.Destinations", "list", Seq(), "GET", """ Destinations page""", _prefix + """destinations""")
)
                      

// @LINE:31
def create(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.create(), HandlerDef(this, "controllers.Destinations", "create", Seq(), "POST", """""", _prefix + """destination""")
)
                      

// @LINE:24
def listDest(username:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Destinations.listDest(username), HandlerDef(this, "controllers.Destinations", "listDest", Seq(classOf[String]), "POST", """ Update destination page""", _prefix + """updateDest/$username<[^/]+>""")
)
                      
    
}
                          

// @LINE:34
// @LINE:29
// @LINE:14
// @LINE:6
class ReverseApplication {
    

// @LINE:6
def signin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signin(), HandlerDef(this, "controllers.Application", "signin", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:14
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """ Signup page""", _prefix + """signup""")
)
                      

// @LINE:29
def destination(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.destination(), HandlerDef(this, "controllers.Application", "destination", Seq(), "GET", """ Destination page""", _prefix + """destination""")
)
                      

// @LINE:34
def submission(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.submission(), HandlerDef(this, "controllers.Application", "submission", Seq(), "GET", """ Submission page""", _prefix + """submission""")
)
                      
    
}
                          
}
        
    