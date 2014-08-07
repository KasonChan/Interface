
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
        _display_ {import models.OS


Seq[Any](format.raw/*2.1*/("""
<div id="footer">
  <div id="container">
    <!-- Display current date and time -->
    """),_display_(Seq[Any](/*6.6*/(new java.util.Date().format("E MMM d, yyyy hh:mm:ss a zzz")))),format.raw/*6.67*/(""" <br>
    
    <!-- Display OS name, version and arch -->
    """),_display_(Seq[Any](/*9.6*/(OS.getName))),format.raw/*9.18*/("""
    """),_display_(Seq[Any](/*10.6*/(OS.getVersion))),format.raw/*10.21*/("""
    """),_display_(Seq[Any](/*11.6*/(OS.getArch))),format.raw/*11.18*/("""<br>
    
    <!-- Display browser name -->
    <strong id="browserName">Browser Name</strong><br>

    <!-- Copyright -->
    <strong>"""),_display_(Seq[Any](/*17.14*/Messages("application.name"))),format.raw/*17.42*/(""" © 2014</strong>
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
                    DATE: Thu Aug 07 16:14:11 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/footer.scala.html
                    HASH: 02df67657585f9dce49ce19d78e6d2f0a803ea94
                    MATRIX: 655->18|779->108|861->169|958->232|991->244|1032->250|1069->265|1110->271|1144->283|1316->419|1366->447
                    LINES: 23->2|27->6|27->6|30->9|30->9|31->10|31->10|32->11|32->11|38->17|38->17
                    -- GENERATED --
                */
            