
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
object guest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),_display_(Seq[Any](/*4.4*/submissionForm())),format.raw/*4.20*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 04 18:07:44 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/guest.scala.html
                    HASH: 3c4a797f0423d46c3e49a696258b771c3c2caef4
                    MATRIX: 549->1|644->3|681->6|724->41|763->43|801->47|838->63
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4
                    -- GENERATED --
                */
            