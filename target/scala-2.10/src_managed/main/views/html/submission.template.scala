
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
object submission extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
"""),_display_(Seq[Any](/*4.2*/dashboard(user))),format.raw/*4.17*/("""
"""),_display_(Seq[Any](/*5.2*/submissionForm(messages)/*5.26*/(errors))),format.raw/*5.34*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)
    
    def f:((List[String]) => (List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => apply(messages)(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Aug 15 16:45:12 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/submission.scala.html
                    HASH: 99d30b2c3841c4417730f5020573980f5d49237a
                    MATRIX: 585->1|737->59|774->62|817->97|856->99|892->101|928->116|964->118|996->142|1025->150
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5
                    -- GENERATED --
                */
            