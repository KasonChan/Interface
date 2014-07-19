
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
    <form action=""""),_display_(Seq[Any](/*41.20*/routes/*41.26*/.Submissions.submission)),format.raw/*41.49*/("""" 
    method="post" id="submissionForm" enctype="multipart/form-data">
      <!-- Sources -->
<!--       <label for="sources">"""),_display_(Seq[Any](/*44.34*/Messages("submission.label.sources"))),format.raw/*44.70*/("""</label>
      <input type="file" name="files[]" id="sources" multiple directory webkitdirectory disabled>
 -->      
      <!-- Compositions -->
      <label for="compositions">"""),_display_(Seq[Any](/*48.34*/Messages("submission.label.compositions"))),format.raw/*48.75*/("""</label>
      <input type="file" name="files[]" id="compositions" multiple directory required>

      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*52.36*/Messages("submission.label.submit"))),format.raw/*52.71*/("""">
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
                    DATE: Sat Jul 19 17:24:38 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/submissionForm.scala.html
                    HASH: 139ec7162887fc7a4974013a2b9adbc62c6ff6f6
                    MATRIX: 584->1|724->47|847->135|896->163|1034->266|1067->290|1107->292|1217->367|1257->391|1297->393|1340->401|1369->408|1410->418|1466->443|1578->520|1609->542|1649->544|1757->617|1793->637|1833->639|1876->647|1903->652|1944->662|2000->687|2124->775|2139->781|2184->804|2348->932|2406->968|2621->1147|2684->1188|2874->1342|2931->1377
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|65->44|65->44|69->48|69->48|73->52|73->52
                    -- GENERATED --
                */
            