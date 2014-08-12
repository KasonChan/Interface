
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

<progress id="progress"></progress>

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*8.22*/Messages("submission.title"))),format.raw/*8.50*/("""</div>
  </div>
</div>

<!-- Section messages -->
<!-- Hide section messages if the list is empty -->
"""),_display_(Seq[Any](/*14.2*/if(messages != List(""))/*14.26*/ {_display_(Seq[Any](format.raw/*14.28*/(""" 
<div id="section">
  <div id="container">
    <div id="messages">
      """),_display_(Seq[Any](/*18.8*/for(message <- messages) yield /*18.32*/ {_display_(Seq[Any](format.raw/*18.34*/("""
      """),_display_(Seq[Any](/*19.8*/message)),format.raw/*19.15*/("""<br>
    """)))})),format.raw/*20.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*24.2*/("""

<!-- Section errors -->
<!-- Hide section errors if the list is empty -->
"""),_display_(Seq[Any](/*28.2*/if(errors != List(""))/*28.24*/ {_display_(Seq[Any](format.raw/*28.26*/(""" 
<div id="section">
  <div id="container">
    <div id="errors">
      """),_display_(Seq[Any](/*32.8*/for(error <- errors) yield /*32.28*/ {_display_(Seq[Any](format.raw/*32.30*/("""
      """),_display_(Seq[Any](/*33.8*/error)),format.raw/*33.13*/("""<br>
    """)))})),format.raw/*34.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*38.2*/("""

<!-- Section content -->
<div id="section">
  <div id="container">
    <form action=""""),_display_(Seq[Any](/*43.20*/routes/*43.26*/.Submissions.submission)),format.raw/*43.49*/("""" 
    method="post" id="submissionForm" enctype="multipart/form-data">
      <!-- Sources -->
<!--       <label for="sources">"""),_display_(Seq[Any](/*46.34*/Messages("submission.label.sources"))),format.raw/*46.70*/("""</label>
      <input type="file" name="files[]" id="sources" multiple directory webkitdirectory disabled>
 -->      
      <!-- Compositions -->
      <label for="compositions">"""),_display_(Seq[Any](/*50.34*/Messages("submission.label.compositions"))),format.raw/*50.75*/("""</label>
      <input type="file" name="files[]" id="compositions" multiple directory required>

      <!-- Submit -->
      <input id="submissionSubmit" type="submit" value=""""),_display_(Seq[Any](/*54.58*/Messages("submission.label.submit"))),format.raw/*54.93*/("""">
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
                    DATE: Tue Aug 12 11:18:31 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/submissionForm.scala.html
                    HASH: c923cf17e7d013efbef32304468120686d77358b
                    MATRIX: 584->1|724->47|884->172|933->200|1071->303|1104->327|1144->329|1254->404|1294->428|1334->430|1377->438|1406->445|1447->455|1503->480|1615->557|1646->579|1686->581|1794->654|1830->674|1870->676|1913->684|1940->689|1981->699|2037->724|2161->812|2176->818|2221->841|2385->969|2443->1005|2658->1184|2721->1225|2933->1401|2990->1436
                    LINES: 19->1|22->1|29->8|29->8|35->14|35->14|35->14|39->18|39->18|39->18|40->19|40->19|41->20|45->24|49->28|49->28|49->28|53->32|53->32|53->32|54->33|54->33|55->34|59->38|64->43|64->43|64->43|67->46|67->46|71->50|71->50|75->54|75->54
                    -- GENERATED --
                */
            