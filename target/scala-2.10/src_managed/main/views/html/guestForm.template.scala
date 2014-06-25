
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
    <form action=""""),_display_(Seq[Any](/*3.20*/routes/*3.26*/.Application.index)),format.raw/*3.44*/("""" method="post" id="guestForm">
      Source 
      <input type="file" name="files[]" id="source" multiple directory webkitdirectory required>
      Destination Grid
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
                    DATE: Tue Jun 24 11:53:32 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/guestForm.scala.html
                    HASH: 78783de97d8b2d00c7fc8142cc65fc3184b5fb5c
                    MATRIX: 641->0|738->62|752->68|791->86
                    LINES: 22->1|24->3|24->3|24->3
                    -- GENERATED --
                */
            