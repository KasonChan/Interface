
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
    """),_display_(Seq[Any](/*3.6*/(new java.util.Date().format("yyyy-MM-dd HH:mm")))),format.raw/*3.55*/(""" <br>
    <strong>© """),_display_(Seq[Any](/*4.16*/Messages("application.name"))),format.raw/*4.44*/(""" 2014</strong>
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
                    DATE: Wed Jul 02 14:28:12 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/footer.scala.html
                    HASH: c3dfb3d07c12e7caf2cd67decdb0a85144fc44a7
                    MATRIX: 638->0|718->46|788->95|844->116|893->144
                    LINES: 22->1|24->3|24->3|25->4|25->4
                    -- GENERATED --
                */
            