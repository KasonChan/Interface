
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
object executionForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],List[File],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(outputs: List[File]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.69*/("""

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
    <!-- Output -->
  """),_display_(Seq[Any](/*42.4*/if(outputs != List(File("", "")))/*42.37*/ {_display_(Seq[Any](format.raw/*42.39*/("""
  <form method="post" id="output">
    """),_display_(Seq[Any](/*44.6*/for(output <- outputs) yield /*44.28*/ {_display_(Seq[Any](format.raw/*44.30*/("""
    <label for="outputFilename">"""),_display_(Seq[Any](/*45.34*/output/*45.40*/.filename)),format.raw/*45.49*/("""</label>
    <input type="text" name="outputContent" id="outputContent" value=""""),_display_(Seq[Any](/*46.72*/output/*46.78*/.content)),format.raw/*46.86*/("""" required readonly>
  """)))})),format.raw/*47.4*/("""
</form>
""")))})),format.raw/*49.2*/("""
</div>
</div>"""))}
    }
    
    def render(messages:List[String],errors:List[String],outputs:List[File]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(outputs)
    
    def f:((List[String]) => (List[String]) => (List[File]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (outputs) => apply(messages)(errors)(outputs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 07 16:59:54 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/executionForm.scala.html
                    HASH: e7b283e46f92d36971b810dd87172fa157cf8a4b
                    MATRIX: 594->1|755->68|878->156|927->184|1065->287|1098->311|1138->313|1248->388|1288->412|1328->414|1371->422|1400->429|1441->439|1497->464|1609->541|1640->563|1680->565|1788->638|1824->658|1864->660|1907->668|1934->673|1975->683|2031->708|2158->800|2200->833|2240->835|2316->876|2354->898|2394->900|2464->934|2479->940|2510->949|2626->1029|2641->1035|2671->1043|2726->1067|2767->1077
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|63->42|63->42|63->42|65->44|65->44|65->44|66->45|66->45|66->45|67->46|67->46|67->46|68->47|70->49
                    -- GENERATED --
                */
            