
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
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- Fonts -->
  <link href="//fonts.googleapis.com/css?family=Nunito:700,400,300,&subset=latin" rel="stylesheet">
  <!-- Style -->
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.48*/routes/*12.54*/.Assets.at("stylesheets/frame.css"))),format.raw/*12.89*/("""">
  <!-- Favicon -->
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*14.53*/routes/*14.59*/.Assets.at("images/favicon.png"))),format.raw/*14.91*/("""">
  <script src=""""),_display_(Seq[Any](/*15.17*/routes/*15.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*15.68*/("""" type="text/javascript"></script>
</head>
<body>
  <!-- Reactive ribbon -->
  <a href="http://www.reactivemanifesto.org/"> <img style="border: 0; position: fixed; right: 0; top:0; z-index: 9000" src="//d379ifj7s9wntv.cloudfront.net/reactivemanifesto/images/ribbons/we-are-reactive-blue-right.png"> </a>
  <div class="application_wrapper">
    <!-- Header -->
    <div id="header">
      <div class="container">
        <h1>
          <a href=""""),_display_(Seq[Any](/*25.21*/routes/*25.27*/.Application.index)),format.raw/*25.45*/("""">"""),_display_(Seq[Any](/*25.48*/title)),format.raw/*25.53*/("""</a>
        </h1>
      </div>
    </div>
    <!-- Output page content block -->
    """),_display_(Seq[Any](/*30.6*/content)),format.raw/*30.13*/("""
    <!-- Footer -->
    """),_display_(Seq[Any](/*32.6*/footer())),format.raw/*32.14*/("""
  </div>
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
                    DATE: Mon Jul 07 19:41:55 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: 60e9e4519a6fa64629c104593f544cb00d8c01bf
                    MATRIX: 561->1|685->31|763->74|789->79|1088->342|1103->348|1160->383|1270->457|1285->463|1339->495|1394->514|1409->520|1476->565|1957->1010|1972->1016|2012->1034|2051->1037|2078->1042|2200->1129|2229->1136|2290->1162|2320->1170
                    LINES: 19->1|22->1|28->7|28->7|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|36->15|46->25|46->25|46->25|46->25|46->25|51->30|51->30|53->32|53->32
                    -- GENERATED --
                */
            