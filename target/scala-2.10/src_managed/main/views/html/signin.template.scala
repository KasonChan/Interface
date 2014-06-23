
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
      <input type="text" name="password" id="password" placeholder="Password" required>
      <input type="submit" value="Sign in">
    </form>
  </div>
</div>
<div id="section2">
  <div id="container">
    <a href="#">Create an account</a><br>
    <a href="#">Guest session</a>
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
                    DATE: Mon Jun 23 17:42:30 CDT 2014
                    SOURCE: /home/ka-son/Documents/GridInterface/app/views/signin.scala.html
                    HASH: b296da69fe59abd53299488762420c31bc00c9d3
                    MATRIX: 638->0
                    LINES: 22->1
                    -- GENERATED --
                */
            