
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
  """),_display_(Seq[Any](/*4.4*/signinForm(errors)/*4.22*/(user))),format.raw/*4.28*/("""
""")))})))}
    }
    
    def render(errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(errors)(user)
    
    def f:((List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (errors) => (user) => apply(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 09 23:46:45 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/index.scala.html
                    HASH: f7aa32e372dd154e10bb8689d9801a71c225a8b4
                    MATRIX: 567->1|695->35|732->38|775->73|814->75|852->79|878->97|905->103
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4
                    -- GENERATED --
                */
            