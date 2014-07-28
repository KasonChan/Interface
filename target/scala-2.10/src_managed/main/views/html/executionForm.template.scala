
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
object executionForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(outputs: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.65*/("""

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
    """),_display_(Seq[Any](/*42.6*/if(outputs == "")/*42.23*/ {_display_(Seq[Any](format.raw/*42.25*/("""
    Internal server error
  """)))})),format.raw/*44.4*/("""
  """),_display_(Seq[Any](/*45.4*/if(outputs != "")/*45.21*/ {_display_(Seq[Any](format.raw/*45.23*/("""
  """),_display_(Seq[Any](/*46.4*/outputs)),format.raw/*46.11*/("""
  
""")))})),format.raw/*48.2*/("""
</div>
</div>"""))}
    }
    
    def render(messages:List[String],errors:List[String],outputs:String): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(outputs)
    
    def f:((List[String]) => (List[String]) => (String) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (outputs) => apply(messages)(errors)(outputs)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Mon Jul 28 16:39:33 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/executionForm.scala.html
                    HASH: c56e3fb6b4dfc693d32c4d72469ab3da18da02d2
                    MATRIX: 590->1|747->64|870->152|919->180|1057->283|1090->307|1130->309|1240->384|1280->408|1320->410|1363->418|1392->425|1433->435|1489->460|1601->537|1632->559|1672->561|1780->634|1816->654|1856->656|1899->664|1926->669|1967->679|2023->704|2152->798|2178->815|2218->817|2279->847|2318->851|2344->868|2384->870|2423->874|2452->881|2488->886
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|63->42|63->42|63->42|65->44|66->45|66->45|66->45|67->46|67->46|69->48
                    -- GENERATED --
                */
            