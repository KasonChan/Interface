
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
object footer extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<div id="footer">
  <div id="container">
    """),_display_(Seq[Any](/*3.6*/(new java.util.Date().format("E MMM d, yyyy hh:mm:ss a zzz")))),format.raw/*3.67*/(""" <br>
    """),_display_(Seq[Any](/*4.6*/(System.getProperty("os.name")))),format.raw/*4.37*/("""
    """),_display_(Seq[Any](/*5.6*/(System.getProperty("os.version")))),format.raw/*5.40*/("""
    """),_display_(Seq[Any](/*6.6*/(System.getProperty("os.arch")))),format.raw/*6.37*/(""" <br>
    <strong>"""),_display_(Seq[Any](/*7.14*/Messages("application.name"))),format.raw/*7.42*/(""" © 2014</strong>
  </div>
</div>
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 05 15:08:10 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/footer.scala.html
                    HASH: d1bbff756adf8b173bd90e01d18c734013b7fd7d
                    MATRIX: 638->0|718->46|800->107|845->118|897->149|937->155|992->189|1032->195|1084->226|1138->245|1187->273
                    LINES: 22->1|24->3|24->3|25->4|25->4|26->5|26->5|27->6|27->6|28->7|28->7
                    -- GENERATED --
                */
            