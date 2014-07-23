
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
object guest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),_display_(Seq[Any](/*4.4*/submissionForm(messages)/*4.28*/(errors))),format.raw/*4.36*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)
    
    def f:((List[String]) => (List[String]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => apply(messages)(errors)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 23 12:24:55 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/guest.scala.html
                    HASH: 3188822ad890cf9fe826b52a5f73e1c66e9da076
                    MATRIX: 575->1|715->47|752->50|795->85|834->87|872->91|904->115|933->123
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4
                    -- GENERATED --
                */
            