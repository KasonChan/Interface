
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
<!-- Hide dashboard if there is no error -->
"""),_display_(Seq[Any](/*5.2*/if(errors == List(""))/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
"""),_display_(Seq[Any](/*6.2*/dashboard(user))),format.raw/*6.17*/("""
""")))})),format.raw/*7.2*/("""
"""),_display_(Seq[Any](/*8.2*/signinForm(errors)/*8.20*/(user))),format.raw/*8.26*/("""
""")))})))}
    }
    
    def render(errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(errors)(user)
    
    def f:((List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (errors) => (user) => apply(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jul 13 01:34:41 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/index.scala.html
                    HASH: 1b3065f6398906d699a69512f804ee89707df7e0
                    MATRIX: 567->1|695->35|732->38|775->73|814->75|895->122|925->144|964->146|1000->148|1036->163|1068->165|1104->167|1130->185|1157->191
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|27->6|27->6|28->7|29->8|29->8|29->8
                    -- GENERATED --
                */
            