
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
  <div id="header">
    <div id="container">
      <h1>"""),_display_(Seq[Any](/*20.12*/title)),format.raw/*20.17*/("""</h1>
    </div>
  </div>
  <!-- Output page content block -->
  """),_display_(Seq[Any](/*24.4*/content)),format.raw/*24.11*/("""
  <!-- Footer -->
  """),_display_(Seq[Any](/*26.4*/footer())),format.raw/*26.12*/("""
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
                    DATE: Wed Jul 02 14:32:53 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: a78f2074e09eefd301525955c73ad8c36bdd740c
                    MATRIX: 561->1|685->31|763->74|789->79|1088->342|1103->348|1160->383|1270->457|1285->463|1339->495|1394->514|1409->520|1476->565|1618->671|1645->676|1746->742|1775->749|1832->771|1862->779
                    LINES: 19->1|22->1|28->7|28->7|33->12|33->12|33->12|35->14|35->14|35->14|36->15|36->15|36->15|41->20|41->20|45->24|45->24|47->26|47->26
                    -- GENERATED --
                */
            