
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/frame("Test")/*3.15*/ {_display_(Seq[Any](format.raw/*3.17*/("""
<div id="section">
  <div id="container">
    """),_display_(Seq[Any](/*6.6*/helper/*6.12*/.form(action = routes.Files.upload, 'id -> "submissionForm", 'enctype -> "multipart/form-data")/*6.107*/ {_display_(Seq[Any](format.raw/*6.109*/("""

    <label for="sources">"""),_display_(Seq[Any](/*8.27*/Messages("submission.label.sources"))),format.raw/*8.63*/("""</label>
    <input type="file" name="files[]" id="sources" multiple directory webkitdirectory disabled>

    <label for="compositions">"""),_display_(Seq[Any](/*11.32*/Messages("submission.label.compositions"))),format.raw/*11.73*/("""</label>
    <input type="file" name="files[]" id="compositions" multiple directory webkitdirectory required>

    <label for="executables">"""),_display_(Seq[Any](/*14.31*/Messages("submission.label.executables"))),format.raw/*14.71*/("""</label>
    <input type="file" name="files[]" id="executables">

    <input type="submit" value="Submit">
  """)))})),format.raw/*18.4*/("""
</div>
</div>
""")))})),format.raw/*21.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 09 23:46:45 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/test.scala.html
                    HASH: 667c3b0019b5eb848eb077ed3cff516671e5961e
                    MATRIX: 652->17|688->19|709->32|748->34|830->82|844->88|948->183|988->185|1051->213|1108->249|1281->386|1344->427|1521->568|1583->608|1724->718|1771->734
                    LINES: 23->2|24->3|24->3|24->3|27->6|27->6|27->6|27->6|29->8|29->8|32->11|32->11|35->14|35->14|39->18|42->21
                    -- GENERATED --
                */
            