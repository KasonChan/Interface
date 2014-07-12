
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
  """),_display_(Seq[Any](/*4.4*/if(errors == List(""))/*4.26*/ {_display_(Seq[Any](format.raw/*4.28*/("""
    """),_display_(Seq[Any](/*5.6*/dashboard(user.username))),format.raw/*5.30*/("""
  """)))})),format.raw/*6.4*/("""
  """),_display_(Seq[Any](/*7.4*/signinForm(errors)/*7.22*/(user))),format.raw/*7.28*/("""
""")))})))}
    }
    
    def render(errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(errors)(user)
    
    def f:((List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (errors) => (user) => apply(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 12 01:25:44 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/index.scala.html
                    HASH: 2a2cbf0e114b34626388ec5021104375d2d0a9c6
                    MATRIX: 567->1|695->35|732->38|775->73|814->75|852->79|882->101|921->103|961->109|1006->133|1040->137|1078->141|1104->159|1131->165
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|26->5|26->5|27->6|28->7|28->7|28->7
                    -- GENERATED --
                */
            