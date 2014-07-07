
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
  <!-- Header -->
  <div id="header">
    <div class="container">
      <h1>
        <a href=""""),_display_(Seq[Any](/*24.19*/routes/*24.25*/.Application.index)),format.raw/*24.43*/("""">"""),_display_(Seq[Any](/*24.46*/title)),format.raw/*24.51*/("""</a>
      </h1>
    </div>
  </div>
  <!-- Output page content block -->
  <div class="content">
    """),_display_(Seq[Any](/*30.6*/content)),format.raw/*30.13*/("""
  </div>
  <!-- Footer -->
  """),_display_(Seq[Any](/*33.4*/footer())),format.raw/*33.12*/("""
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
                    DATE: Mon Jul 07 15:22:02 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: e567a9a9d7b24a0b14cef19823a93bc3877c7443
                    MATRIX: 561->1|685->31|763->74|789->79|1088->342|1103->348|1160->383|1270->457|1285->463|1339->495|1394->514|1409->520|1476->565|1911->964|1926->970|1966->988|2005->991|2032->996|2170->1099|2199->1106|2265->1137|2295->1145
                    LINES: 19->1|22->1|28->7|28->7|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|36->15|45->24|45->24|45->24|45->24|45->24|51->30|51->30|54->33|54->33
                    -- GENERATED --
                */
            