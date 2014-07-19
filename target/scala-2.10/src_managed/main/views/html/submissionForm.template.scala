
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
object submissionForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("submission.title"))),format.raw/*6.50*/("""</div>
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
    <form action=""""),_display_(Seq[Any](/*41.20*/routes/*41.26*/.Files.uploadCompositions)),format.raw/*41.51*/("""" method="post" id="submissionForm" enctype="multipart/form-data">
      <!-- Sources -->
<!--       <label for="sources">"""),_display_(Seq[Any](/*43.34*/Messages("submission.label.sources"))),format.raw/*43.70*/("""</label>
      <input type="file" name="files[]" id="sources" multiple directory webkitdirectory disabled>
 -->      
      <!-- Compositions -->
      <label for="compositions">"""),_display_(Seq[Any](/*47.34*/Messages("submission.label.compositions"))),format.raw/*47.75*/("""</label>
      <input type="file" name="files[]" id="compositions" multiple directory required>

      <!-- Executables -->
<!--       <label for="executables">"""),_display_(Seq[Any](/*51.38*/Messages("submission.label.executables"))),format.raw/*51.78*/("""</label>
      <input type="file" name="files[]" id="executables">
 -->
      <!-- Destination information -->
      <!-- <label for="destination">"""),_display_(Seq[Any](/*55.38*/Messages("submission.label.destination"))),format.raw/*55.78*/("""</label>
      <input type="text" name="destinationUsername" id="destinationUsername" placeholder=""""),_display_(Seq[Any](/*56.92*/Messages("destination.label.username"))),format.raw/*56.130*/("""" required>
      <input type="text" name="destinationHostname" id="destinationHostname" placeholder=""""),_display_(Seq[Any](/*57.92*/Messages("destination.label.hostname"))),format.raw/*57.130*/("""" required>
      <input type="password" name="destinationPassword" id="destinationPassword" placeholder=""""),_display_(Seq[Any](/*58.96*/Messages("destination.label.password"))),format.raw/*58.134*/("""" required> -->

      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*61.36*/Messages("submission.label.submit"))),format.raw/*61.71*/("""">
    </form>
  </div>
</div>
"""))}
    }
    
    def render(messages:List[String],errors:List[String]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)
    
    def f:((List[String]) => (List[String]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => apply(messages)(errors)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Jul 19 11:39:01 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/submissionForm.scala.html
                    HASH: edaba413cbe63aa00e451b3adf0709f7d44f3393
                    MATRIX: 584->1|724->47|847->135|896->163|1034->266|1067->290|1107->292|1217->367|1257->391|1297->393|1340->401|1369->408|1410->418|1466->443|1578->520|1609->542|1649->544|1757->617|1793->637|1833->639|1876->647|1903->652|1944->662|2000->687|2124->775|2139->781|2186->806|2345->929|2403->965|2618->1144|2681->1185|2878->1346|2940->1386|3124->1534|3186->1574|3322->1674|3383->1712|3522->1815|3583->1853|3726->1960|3787->1998|3897->2072|3954->2107
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|64->43|64->43|68->47|68->47|72->51|72->51|76->55|76->55|77->56|77->56|78->57|78->57|79->58|79->58|82->61|82->61
                    -- GENERATED --
                */
            