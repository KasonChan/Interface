
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
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.48*/routes/*14.54*/.Assets.at("stylesheets/frame.css"))),format.raw/*14.89*/("""">
  
  <!-- Favicon -->
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.53*/routes/*17.59*/.Assets.at("images/favicon.png"))),format.raw/*17.91*/("""">
  
  <!-- Script -->
  <script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.68*/("""" type="text/javascript"></script>
  <script src=""""),_display_(Seq[Any](/*21.17*/routes/*21.23*/.Assets.at("javascripts/interface.js"))),format.raw/*21.61*/("""" type="text/javascript"></script>
</head>
<body>
  <!-- Reactive ribbon -->
  <a href="http://www.reactivemanifesto.org/"> <img style="border: 0; position: fixed; right: 0; top:0; z-index: 9000" src="//d379ifj7s9wntv.cloudfront.net/reactivemanifesto/images/ribbons/we-are-reactive-blue-right.png"> </a>
  
  <div class="application_wrapper">
    
    <!-- Header -->
    <div id="header">
      <div class="container">
        <h1>
          <a href=""""),_display_(Seq[Any](/*33.21*/routes/*33.27*/.Application.index)),format.raw/*33.45*/("""">"""),_display_(Seq[Any](/*33.48*/title)),format.raw/*33.53*/("""</a>
        </h1>
      </div>
    </div>
    
    <!-- Output page content block -->
    """),_display_(Seq[Any](/*39.6*/content)),format.raw/*39.13*/("""
    
    <!-- Footer -->
    """),_display_(Seq[Any](/*42.6*/footer())),format.raw/*42.14*/("""
  
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
                    DATE: Fri Jul 11 00:54:20 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: b5e9a4b569ec0a069a8d247010078165c781bf7b
                    MATRIX: 561->1|685->31|763->74|789->79|1094->348|1109->354|1166->389|1279->466|1294->472|1348->504|1424->544|1439->550|1506->595|1593->646|1608->652|1668->690|2157->1143|2172->1149|2212->1167|2251->1170|2278->1175|2405->1267|2434->1274|2500->1305|2530->1313
                    LINES: 19->1|22->1|28->7|28->7|35->14|35->14|35->14|38->17|38->17|38->17|41->20|41->20|41->20|42->21|42->21|42->21|54->33|54->33|54->33|54->33|54->33|60->39|60->39|63->42|63->42
                    -- GENERATED --
                */
            