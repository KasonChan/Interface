
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.36*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),_display_(Seq[Any](/*4.4*/dashboard(user.username))),format.raw/*4.28*/("""
  """),_display_(Seq[Any](/*5.4*/signinForm(errors)/*5.22*/(user))),format.raw/*5.28*/("""
""")))})))}
    }
    
    def render(errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(errors)(user)
    
    def f:((List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (errors) => (user) => apply(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jul 11 14:02:32 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/index.scala.html
                    HASH: f403cbeea3a785eb611031e8bed529062b0f1aee
                    MATRIX: 567->1|695->35|732->38|775->73|814->75|852->79|897->103|935->107|961->125|988->131
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5
                    -- GENERATED --
                */
            