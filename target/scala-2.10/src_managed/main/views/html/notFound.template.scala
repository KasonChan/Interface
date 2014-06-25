
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
object notFound extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(path: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.16*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<div id="section1">
  <div id="container">
    <strong>Page not found: """),_display_(Seq[Any](/*6.30*/path)),format.raw/*6.34*/("""</strong>
  </div>
</div>
""")))})))}
    }
    
    def render(path:String): play.api.templates.HtmlFormat.Appendable = apply(path)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (path) => apply(path)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jun 24 10:46:15 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/notFound.scala.html
                    HASH: 1b736049311509fb0f189b862d5c787acd0445ac
                    MATRIX: 559->1|667->15|704->18|747->53|786->55|894->128|919->132
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6
                    -- GENERATED --
                */
            