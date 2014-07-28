
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
object execution extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template4[List[String],List[String],User,String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User)(outputs: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.77*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
"""),_display_(Seq[Any](/*4.2*/dashboard(user))),format.raw/*4.17*/("""
"""),_display_(Seq[Any](/*5.2*/executionForm(messages)/*5.25*/(errors)/*5.33*/(outputs))),format.raw/*5.42*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String],user:User,outputs:String): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)(outputs)
    
    def f:((List[String]) => (List[String]) => (User) => (String) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => (outputs) => apply(messages)(errors)(user)(outputs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 12:03:43 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/execution.scala.html
                    HASH: 29bf85f4016108699e12616b215916eb2c16c1ac
                    MATRIX: 591->1|760->76|797->79|840->114|879->116|915->118|951->133|987->135|1018->158|1034->166|1064->175
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5|26->5
                    -- GENERATED --
                */
            