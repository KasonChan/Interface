
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
object errors extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Throwable,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(throwableMsg: Throwable):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.27*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<div id="section">
  <div id="container">
    <div id="errors">
      <strong>Internal server error: """),_display_(Seq[Any](/*7.39*/throwableMsg)),format.raw/*7.51*/("""</strong>
    </div>
  </div>
</div>
""")))})))}
    }
    
    def render(throwableMsg:Throwable): play.api.templates.HtmlFormat.Appendable = apply(throwableMsg)
    
    def f:((Throwable) => play.api.templates.HtmlFormat.Appendable) = (throwableMsg) => apply(throwableMsg)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 13 15:30:56 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/errors.scala.html
                    HASH: 576df9dd11c3e68f232d982df86d1ed0235841e8
                    MATRIX: 560->1|679->26|716->29|759->64|798->66|936->169|969->181
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7
                    -- GENERATED --
                */
            