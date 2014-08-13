
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
object updateDest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[String],List[String],User,List[Destination],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User)(destinations: List[Destination]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.93*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
"""),_display_(Seq[Any](/*4.2*/dashboard(user))),format.raw/*4.17*/("""
"""),_display_(Seq[Any](/*5.2*/updateDestForm(messages)/*5.26*/(errors)/*5.34*/(destinations))),format.raw/*5.48*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String],user:User,destinations:List[Destination]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)(destinations)
    
    def f:((List[String]) => (List[String]) => (User) => (List[Destination]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => (destinations) => apply(messages)(errors)(user)(destinations)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 13 15:30:56 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/updateDest.scala.html
                    HASH: 00948a56199e271c7b1574ded38e19c06f8260ee
                    MATRIX: 603->1|788->92|825->95|868->130|907->132|943->134|979->149|1015->151|1047->175|1063->183|1098->197
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5|26->5
                    -- GENERATED --
                */
            