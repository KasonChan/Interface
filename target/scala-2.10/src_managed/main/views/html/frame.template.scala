
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
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.53*/routes/*17.59*/.Assets.at("images/favicon.ico"))),format.raw/*17.91*/("""">

  <!-- Script -->
  <script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*20.68*/("""" type="text/javascript"></script>
  <script src=""""),_display_(Seq[Any](/*21.17*/routes/*21.23*/.Assets.at("javascripts/interface.js"))),format.raw/*21.61*/("""" type="text/javascript"></script>
</head>
<body>
  <!-- Reactive ribbon -->
  <a href="http://www.reactivemanifesto.org/"> <img style="border: 0; position: fixed; right: 0; top:0; z-index: 9000" src="//d379ifj7s9wntv.cloudfront.net/reactivemanifesto/images/ribbons/we-are-reactive-blue-right.png"></a>

  <!-- Application wrapper -->
  <div class="application_wrapper">

    <!-- Header -->
    <div id="header">
      <div class="container">
        <!-- Application name -->
        <h1>
          <a href=""""),_display_(Seq[Any](/*35.21*/routes/*35.27*/.Application.submission)),format.raw/*35.50*/("""">"""),_display_(Seq[Any](/*35.53*/title)),format.raw/*35.58*/("""</a>
        </h1>
      </div>
    </div>

    <!-- Content block -->
    """),_display_(Seq[Any](/*41.6*/content)),format.raw/*41.13*/("""

    <!-- Footer -->
    """),_display_(Seq[Any](/*44.6*/footer())),format.raw/*44.14*/("""
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
                    DATE: Wed Jul 23 12:24:56 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: d92b7b399984bc790bc7fd2e513edaece985b1f6
                    MATRIX: 561->1|685->31|763->74|789->79|1090->344|1105->350|1162->385|1273->460|1288->466|1342->498|1416->536|1431->542|1498->587|1585->638|1600->644|1660->682|2207->1193|2222->1199|2267->1222|2306->1225|2333->1230|2444->1306|2473->1313|2535->1340|2565->1348
                    LINES: 19->1|22->1|28->7|28->7|35->14|35->14|35->14|38->17|38->17|38->17|41->20|41->20|41->20|42->21|42->21|42->21|56->35|56->35|56->35|56->35|56->35|62->41|62->41|65->44|65->44
                    -- GENERATED --
                */
            