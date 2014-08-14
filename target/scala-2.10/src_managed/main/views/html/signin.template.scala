
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
object signin extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<!-- Hide dashboard if there is no error -->
"""),_display_(Seq[Any](/*5.2*/if(errors == List(""))/*5.24*/ {_display_(Seq[Any](format.raw/*5.26*/("""
"""),_display_(Seq[Any](/*6.2*/dashboard(user))),format.raw/*6.17*/("""
""")))})),format.raw/*7.2*/("""
"""),_display_(Seq[Any](/*8.2*/signinForm(messages)/*8.22*/(errors)/*8.30*/(user))),format.raw/*8.36*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)
    
    def f:((List[String]) => (List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => apply(messages)(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 14 11:32:20 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/signin.scala.html
                    HASH: d532732785c9647b0e4f2596d2fd99011a5c5b10
                    MATRIX: 581->1|733->59|770->62|813->97|852->99|933->146|963->168|1002->170|1038->172|1074->187|1106->189|1142->191|1170->211|1186->219|1213->225
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|27->6|27->6|28->7|29->8|29->8|29->8|29->8
                    -- GENERATED --
                */
            