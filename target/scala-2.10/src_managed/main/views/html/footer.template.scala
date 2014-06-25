
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
    © """),_display_(Seq[Any](/*4.8*/Messages("application.name"))),format.raw/*4.36*/(""" 2014
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
                    DATE: Tue Jun 24 10:46:15 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/footer.scala.html
                    HASH: 5a6890bb9ea7500c6fbabe1370c0815ecc98f3b6
                    MATRIX: 638->0|718->46|788->95|835->108|884->136
                    LINES: 22->1|24->3|24->3|25->4|25->4
                    -- GENERATED --
                */
            