
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
object signinForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("signin.title"))),format.raw/*6.46*/("""</div>
  </div>
</div>

<!-- Section messages -->
"""),_display_(Seq[Any](/*11.2*/if(messages != List(""))/*11.26*/ {_display_(Seq[Any](format.raw/*11.28*/(""" 
<div id="section">
  <div id="container">
    <div id="messages">
      """),_display_(Seq[Any](/*15.8*/for(message <- messages) yield /*15.32*/ {_display_(Seq[Any](format.raw/*15.34*/("""
      """),_display_(Seq[Any](/*16.8*/message)),format.raw/*16.15*/("""<br>
    """)))})),format.raw/*17.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*21.2*/("""

<!-- Section errors -->
"""),_display_(Seq[Any](/*24.2*/if(errors != List(""))/*24.24*/ {_display_(Seq[Any](format.raw/*24.26*/(""" 
<div id="section">
  <div id="container">
    <div id="errors">
      """),_display_(Seq[Any](/*28.8*/for(error <- errors) yield /*28.28*/ {_display_(Seq[Any](format.raw/*28.30*/("""
      """),_display_(Seq[Any](/*29.8*/error)),format.raw/*29.13*/("""<br>
    """)))})),format.raw/*30.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*34.2*/("""

<!-- Section content -->
<div id="section">
  <div id="container">
    <form method="post" id="signin" action=""""),_display_(Seq[Any](/*39.46*/routes/*39.52*/.Users.signin)),format.raw/*39.65*/("""">
      <!-- Username -->
      <input type="text" name="username" id="username" 
      placeholder=""""),_display_(Seq[Any](/*42.21*/Messages("signin.label.username"))),format.raw/*42.54*/("""" 
      value=""""),_display_(Seq[Any](/*43.15*/user/*43.19*/.username)),format.raw/*43.28*/("""" maxlength="35" required>
      
      <!-- Password -->
      <input type="password" name="password" id="password" 
      placeholder=""""),_display_(Seq[Any](/*47.21*/Messages("signin.label.password"))),format.raw/*47.54*/("""" maxlength="35" required>
      
      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*50.36*/Messages("signin.label.submit"))),format.raw/*50.67*/("""">
    </form>
  </div>
</div>
<div id="section">
  <div id="container">
    <div id="link">
      <!-- Create an account -->
      <a href=""""),_display_(Seq[Any](/*58.17*/routes/*58.23*/.Users.create)),format.raw/*58.36*/("""">"""),_display_(Seq[Any](/*58.39*/Messages("signin.link.signup"))),format.raw/*58.69*/("""</a>
    </div>
  </div>
</div>
"""))}
    }
    
    def render(messages:List[String],errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)
    
    def f:((List[String]) => (List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => apply(messages)(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 28 10:53:50 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/signinForm.scala.html
                    HASH: 2c28bb3837deb34b6e5f6844d69b7d5ea843d20f
                    MATRIX: 585->1|737->59|860->147|905->171|991->222|1024->246|1064->248|1174->323|1214->347|1254->349|1297->357|1326->364|1367->374|1423->399|1485->426|1516->448|1556->450|1664->523|1700->543|1740->545|1783->553|1810->558|1851->568|1907->593|2057->707|2072->713|2107->726|2246->829|2301->862|2354->879|2367->883|2398->892|2572->1030|2627->1063|2754->1154|2807->1185|2985->1327|3000->1333|3035->1346|3074->1349|3126->1379
                    LINES: 19->1|22->1|27->6|27->6|32->11|32->11|32->11|36->15|36->15|36->15|37->16|37->16|38->17|42->21|45->24|45->24|45->24|49->28|49->28|49->28|50->29|50->29|51->30|55->34|60->39|60->39|60->39|63->42|63->42|64->43|64->43|64->43|68->47|68->47|71->50|71->50|79->58|79->58|79->58|79->58|79->58
                    -- GENERATED --
                */
            