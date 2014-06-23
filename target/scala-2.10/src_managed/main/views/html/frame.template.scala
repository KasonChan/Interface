
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
object frame extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
<head>
  <title>"""),_display_(Seq[Any](/*7.11*/title)),format.raw/*7.16*/("""</title>
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.48*/routes/*8.54*/.Assets.at("stylesheets/frame.css"))),format.raw/*8.89*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.53*/routes/*9.59*/.Assets.at("images/favicon.png"))),format.raw/*9.91*/("""">
  <script src=""""),_display_(Seq[Any](/*10.17*/routes/*10.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*10.68*/("""" type="text/javascript"></script>
</head>
<body>
  <div id="header">
    <div id="container">
      <h1>"""),_display_(Seq[Any](/*15.12*/title)),format.raw/*15.17*/("""</h1>
    </div>
  </div>
  """),_display_(Seq[Any](/*18.4*/content)),format.raw/*18.11*/("""
  """),_display_(Seq[Any](/*19.4*/footer())),format.raw/*19.12*/("""
</body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jun 23 17:19:57 CDT 2014
                    SOURCE: /home/ka-son/Documents/GridInterface/app/views/frame.scala.html
                    HASH: 147e6478afcf9cf6573f5703a23a6c7a9c8418af
                    MATRIX: 561->1|685->31|763->74|789->79|880->135|894->141|950->176|1040->231|1054->237|1107->269|1162->288|1177->294|1244->339|1386->445|1413->450|1477->479|1506->486|1545->490|1575->498
                    LINES: 19->1|22->1|28->7|28->7|29->8|29->8|29->8|30->9|30->9|30->9|31->10|31->10|31->10|36->15|36->15|39->18|39->18|40->19|40->19
                    -- GENERATED --
                */
            