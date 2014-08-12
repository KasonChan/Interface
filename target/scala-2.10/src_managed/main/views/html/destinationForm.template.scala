
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
object destinationForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],Destination,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(destination: Destination):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.74*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("destination.title.add"))),format.raw/*6.55*/("""</div>
  </div>
</div>

<!-- Section messages -->
<!-- Hide section messages if the list is empty -->
"""),_display_(Seq[Any](/*12.2*/if(messages != List(""))/*12.26*/ {_display_(Seq[Any](format.raw/*12.28*/(""" 
<div id="section">
  <div id="container">
    <div id="messages">
      """),_display_(Seq[Any](/*16.8*/for(message <- messages) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
      """),_display_(Seq[Any](/*17.8*/message)),format.raw/*17.15*/("""<br>
    """)))})),format.raw/*18.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*22.2*/("""

<!-- Section errors -->
<!-- Hide section errors if the list is empty -->
"""),_display_(Seq[Any](/*26.2*/if(errors != List(""))/*26.24*/ {_display_(Seq[Any](format.raw/*26.26*/(""" 
<div id="section">
  <div id="container">
    <div id="errors">
      """),_display_(Seq[Any](/*30.8*/for(error <- errors) yield /*30.28*/ {_display_(Seq[Any](format.raw/*30.30*/("""
      """),_display_(Seq[Any](/*31.8*/error)),format.raw/*31.13*/("""<br>
    """)))})),format.raw/*32.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*36.2*/("""

<!-- Section content -->
<div id="section">
  <div id="container">
    <form method="post" id="destination" action=""""),_display_(Seq[Any](/*41.51*/routes/*41.57*/.Destinations.create)),format.raw/*41.77*/("""">
      <!-- User -->
      <!-- Username -->
      <!-- Hidden -->
      <input type="text" name="username" id="username" 
      placeholder=""""),_display_(Seq[Any](/*46.21*/Messages("destination.label.username"))),format.raw/*46.59*/("""" 
      value=""""),_display_(Seq[Any](/*47.15*/destination/*47.26*/.username)),format.raw/*47.35*/("""" maxlength="35" required readonly hidden>

      <!-- Destination -->
      <label for="destination">"""),_display_(Seq[Any](/*50.33*/Messages("submission.label.destination"))),format.raw/*50.73*/("""</label>
      <!-- Username -->
      <input type="text" name="destinationUsername" id="destinationUsername" 
      placeholder=""""),_display_(Seq[Any](/*53.21*/Messages("destination.label.username"))),format.raw/*53.59*/("""" 
      value=""""),_display_(Seq[Any](/*54.15*/destination/*54.26*/.destinationUsername)),format.raw/*54.46*/("""" maxlength="35" required>
      
      <!-- Hostname -->
      <input type="text" name="destinationHostname" id="destinationHostname" 
      placeholder=""""),_display_(Seq[Any](/*58.21*/Messages("destination.label.hostname"))),format.raw/*58.59*/("""" 
      value=""""),_display_(Seq[Any](/*59.15*/destination/*59.26*/.destinationHostname)),format.raw/*59.46*/("""" maxlength="50" required>
      
      <!-- Password -->
      <input type="password" name="destinationPassword" id="destinationPassword" 
      placeholder=""""),_display_(Seq[Any](/*63.21*/Messages("destination.label.password"))),format.raw/*63.59*/("""" 
      value=""""),_display_(Seq[Any](/*64.15*/destination/*64.26*/.destinationPassword)),format.raw/*64.46*/("""" maxlength="35" required>
      
      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*67.36*/Messages("destination.label.submit"))),format.raw/*67.72*/("""">
    </form>
  </div>
</div>

"""))}
    }
    
    def render(messages:List[String],errors:List[String],destination:Destination): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(destination)
    
    def f:((List[String]) => (List[String]) => (Destination) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (destination) => apply(messages)(errors)(destination)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Aug 12 11:18:32 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/destinationForm.scala.html
                    HASH: b02daa2c82ddc024ef2664657115fd6d37196517
                    MATRIX: 597->1|763->73|886->161|940->194|1078->297|1111->321|1151->323|1261->398|1301->422|1341->424|1384->432|1413->439|1454->449|1510->474|1622->551|1653->573|1693->575|1801->648|1837->668|1877->670|1920->678|1947->683|1988->693|2044->718|2199->837|2214->843|2256->863|2437->1008|2497->1046|2550->1063|2570->1074|2601->1083|2740->1186|2802->1226|2969->1357|3029->1395|3082->1412|3102->1423|3144->1443|3336->1599|3396->1637|3449->1654|3469->1665|3511->1685|3707->1845|3767->1883|3820->1900|3840->1911|3882->1931|4009->2022|4067->2058
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|67->46|67->46|68->47|68->47|68->47|71->50|71->50|74->53|74->53|75->54|75->54|75->54|79->58|79->58|80->59|80->59|80->59|84->63|84->63|85->64|85->64|85->64|88->67|88->67
                    -- GENERATED --
                */
            