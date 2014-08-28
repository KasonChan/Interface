
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
object destination extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[String],List[String],User,Destination,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User)(destination: Destination):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.86*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),_display_(Seq[Any](/*4.4*/dashboard(user))),format.raw/*4.19*/("""
  """),_display_(Seq[Any](/*5.4*/destinationForm(messages)/*5.29*/(errors)/*5.37*/(destination))),format.raw/*5.50*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String],user:User,destination:Destination): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)(destination)
    
    def f:((List[String]) => (List[String]) => (User) => (Destination) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => (destination) => apply(messages)(errors)(user)(destination)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 28 10:53:49 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/destination.scala.html
                    HASH: 191c6111acf7301c31c5f39341e91ee411282338
                    MATRIX: 598->1|776->85|813->88|856->123|895->125|933->129|969->144|1007->148|1040->173|1056->181|1090->194
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5|26->5
                    -- GENERATED --
                */
            