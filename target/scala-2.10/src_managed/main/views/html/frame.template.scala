
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
  <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.48*/routes/*9.54*/.Assets.at("stylesheets/frame.css"))),format.raw/*9.89*/("""">
  <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.53*/routes/*10.59*/.Assets.at("images/favicon.png"))),format.raw/*10.91*/("""">
  <link href="//fonts.googleapis.com/css?family=Roboto:400,300,200,100&subset=latin,cyrillic" rel="stylesheet">
  <script src=""""),_display_(Seq[Any](/*12.17*/routes/*12.23*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*12.68*/("""" type="text/javascript"></script>
</head>
<body>
  <div id="header">
    <div id="container">
      <h1>"""),_display_(Seq[Any](/*17.12*/title)),format.raw/*17.17*/("""</h1>
    </div>
  </div>
  """),_display_(Seq[Any](/*20.4*/content)),format.raw/*20.11*/("""
  """),_display_(Seq[Any](/*21.4*/footer())),format.raw/*21.12*/("""
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
                    DATE: Tue Jul 01 13:57:40 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/frame.scala.html
                    HASH: 80371cffcbce31bae5782956447bb6c89f2e22ef
                    MATRIX: 561->1|685->31|763->74|789->79|953->208|967->214|1023->249|1114->304|1129->310|1183->342|1350->473|1365->479|1432->524|1574->630|1601->635|1665->664|1694->671|1733->675|1763->683
                    LINES: 19->1|22->1|28->7|28->7|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|33->12|38->17|38->17|41->20|41->20|42->21|42->21
                    -- GENERATED --
                */
            