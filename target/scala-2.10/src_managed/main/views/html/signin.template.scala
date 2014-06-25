
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
object signin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="section1">
  <div id="container">
    <form method="post" id="signin">
      <input type="text" name="username" id="username" placeholder="Username" required>
      <input type="password" name="password" id="password" placeholder="Password" required>
      <input type="submit" value="Sign in">
    </form>
  </div>
</div>
<div id="section2">
  <div id="container">
    <a href="#">Create an account</a><br>
    <a href=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Application.guest)),format.raw/*13.39*/("""">Guest session</a>
  </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 11:54:48 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/signin.scala.html
                    HASH: b2e191248ff74b9f30248daceaa79b045419a0bc
                    MATRIX: 638->0|1105->431|1120->437|1160->455
                    LINES: 22->1|34->13|34->13|34->13
                    -- GENERATED --
                */
            