
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
object test extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(msg: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.15*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/frame(Messages("application.name"))/*5.37*/ {_display_(Seq[Any](format.raw/*5.39*/("""
"""),_display_(Seq[Any](/*6.2*/helper/*6.8*/.form(action = routes.File.upload, 'id -> "guestForm", 'enctype -> "multipart/form-data")/*6.97*/ {_display_(Seq[Any](format.raw/*6.99*/("""
<p>
  """),_display_(Seq[Any](/*8.4*/msg)),format.raw/*8.7*/("""
</p>
<input type="file" name="files[]" id="files[]" webkitdirectory directory multiple>
<input type="submit">
""")))})),format.raw/*12.2*/("""
""")))})),format.raw/*13.2*/("""

"""))}
    }
    
    def render(msg:String): play.api.templates.HtmlFormat.Appendable = apply(msg)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (msg) => apply(msg)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jul 01 15:02:04 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/test.scala.html
                    HASH: 6821ca62ab46822ad5307131ebf8893b252c7b69
                    MATRIX: 555->1|678->14|706->33|742->35|785->70|824->72|860->74|873->80|970->169|1009->171|1051->179|1074->182|1217->294|1250->296
                    LINES: 19->1|23->1|25->4|26->5|26->5|26->5|27->6|27->6|27->6|27->6|29->8|29->8|33->12|34->13
                    -- GENERATED --
                */
            