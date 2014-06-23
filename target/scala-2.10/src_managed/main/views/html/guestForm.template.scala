
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
object guestForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="section1">
  <div id="container">
    <form method="post" id="guestForm">
      <input type="text" name="source" id="source" placeholder="Source" required>

      <h1>Destination Grid</h1>
      <input type="text" name="gridUsername" id="gridUsername" placeholder="Username" required>
      <input type="text" name="gridHostname" id="gridHostname" placeholder="Hostname" required>
      <input type="password" name="password" id="gridPassword" placeholder="Password" required>
      <input type="submit" value="Submit">
    </form>
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
                    DATE: Mon Jun 23 17:42:29 CDT 2014
                    SOURCE: /home/ka-son/Documents/GridInterface/app/views/guestForm.scala.html
                    HASH: dfe5c4babbc8b52c9e3974d6bee2c38a50b35e04
                    MATRIX: 641->0
                    LINES: 22->1
                    -- GENERATED --
                */
            