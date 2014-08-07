
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object dashboard extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

<!-- Dashboard -->
<!-- Hide dashboard if the user is empty -->
"""),_display_(Seq[Any](/*5.2*/if(user != User("", "", "", ""))/*5.34*/ {_display_(Seq[Any](format.raw/*5.36*/("""
<div class="dashboard_wrapper">
  <div id="dashboard">
    <div class="container">
      """),_display_(Seq[Any](/*9.8*/user/*9.12*/.username)),format.raw/*9.21*/("""
    </div>
  </div>
</div>
""")))})),format.raw/*13.2*/("""

<!-- Setting -->
<!-- Hide setting if the user is empty -->
"""),_display_(Seq[Any](/*17.2*/if(user != User("", "", "", ""))/*17.34*/ {_display_(Seq[Any](format.raw/*17.36*/("""
<div id="setting_wrapper">
  <div id="setting">
    <div class="container">
      <!-- Edit account information-->
      <!-- All fields of this form are hidden except the submit button -->
      <form method="post" id="editUser" action=""""),_display_(Seq[Any](/*23.50*/routes/*23.56*/.Users.edit(user.username, "update"))),format.raw/*23.92*/("""">
        <!-- Hidden form fields -->
        <!-- Name -->
        <input type="text" name="firstname" id="firstname" placeholder="First" 
        value=""""),_display_(Seq[Any](/*27.17*/user/*27.21*/.firstname)),format.raw/*27.31*/("""" required hidden>
        <input type="text" name="lastname" id="lastname" placeholder="Last" 
        value=""""),_display_(Seq[Any](/*29.17*/user/*29.21*/.lastname)),format.raw/*29.30*/("""" required hidden>

        <!-- Username -->
        <input type="text" name="username" id="username" value=""""),_display_(Seq[Any](/*32.66*/user/*32.70*/.username)),format.raw/*32.79*/("""" 
        required  hidden>

        <!-- Password -->
        <input type="password" name="password" id="password" 
        value=""""),_display_(Seq[Any](/*37.17*/user/*37.21*/.password)),format.raw/*37.30*/("""" required hidden>

        <!-- Submit -->
        <input type="submit" value=""""),_display_(Seq[Any](/*40.38*/Messages("dashboard.label.edit"))),format.raw/*40.70*/("""">
      </form>

      <!-- Add destination -->
      <form method="post" id="addDest" 
      action=""""),_display_(Seq[Any](/*45.16*/routes/*45.22*/.Destinations.listDest(user.username))),format.raw/*45.59*/("""">
      <input type="button" value=""""),_display_(Seq[Any](/*46.36*/Messages("dashboard.label.add.dest"))),format.raw/*46.72*/(""""
      onclick="addDest()">
      </form>

      <!-- Edit your destination information -->
      <form method="post" id="editDest" 
      action=""""),_display_(Seq[Any](/*52.16*/routes/*52.22*/.Destinations.listDest(user.username))),format.raw/*52.59*/("""">
      <input type="submit" value=""""),_display_(Seq[Any](/*53.36*/Messages("dashboard.label.edit.dest"))),format.raw/*53.73*/("""">
    </form>

    <!-- Logout -->
    <form method="post" id="logout" action=""""),_display_(Seq[Any](/*57.46*/routes/*57.52*/.Users.logout)),format.raw/*57.65*/("""">
      <input type="submit" value=""""),_display_(Seq[Any](/*58.36*/Messages("dashboard.label.logout"))),format.raw/*58.70*/("""">
    </form>
  </div>
</div>
</div>
""")))})))}
    }
    
    def render(user:User): play.api.templates.HtmlFormat.Appendable = apply(user)
    
    def f:((User) => play.api.templates.HtmlFormat.Appendable) = (user) => apply(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 07 16:14:11 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/dashboard.scala.html
                    HASH: f60f6ca6d642454f4d27ea9c6ec1390112329de1
                    MATRIX: 558->1|664->13|765->80|805->112|844->114|969->205|981->209|1011->218|1071->247|1169->310|1210->342|1250->344|1526->584|1541->590|1599->626|1792->783|1805->787|1837->797|1985->909|1998->913|2029->922|2176->1033|2189->1037|2220->1046|2390->1180|2403->1184|2434->1193|2551->1274|2605->1306|2745->1410|2760->1416|2819->1453|2893->1491|2951->1527|3136->1676|3151->1682|3210->1719|3284->1757|3343->1794|3460->1875|3475->1881|3510->1894|3584->1932|3640->1966
                    LINES: 19->1|22->1|26->5|26->5|26->5|30->9|30->9|30->9|34->13|38->17|38->17|38->17|44->23|44->23|44->23|48->27|48->27|48->27|50->29|50->29|50->29|53->32|53->32|53->32|58->37|58->37|58->37|61->40|61->40|66->45|66->45|66->45|67->46|67->46|73->52|73->52|73->52|74->53|74->53|78->57|78->57|78->57|79->58|79->58
                    -- GENERATED --
                */
            