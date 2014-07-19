
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
object updateUser extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
"""),_display_(Seq[Any](/*4.2*/dashboard(user))),format.raw/*4.17*/("""
"""),_display_(Seq[Any](/*5.2*/updateUserForm(messages)/*5.26*/(errors)/*5.34*/(user))),format.raw/*5.40*/("""
""")))})),format.raw/*6.2*/("""
"""))}
    }
    
    def render(messages:List[String],errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)
    
    def f:((List[String]) => (List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => apply(messages)(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 19 11:39:01 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/updateUser.scala.html
                    HASH: 39a18cd67441bf08bb633b27bd27a1fa77f8956e
                    MATRIX: 585->1|737->59|774->62|817->97|856->99|892->101|928->116|964->118|996->142|1012->150|1039->156|1071->158
                    LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|26->5|26->5|26->5|26->5|27->6
                    -- GENERATED --
                */
            