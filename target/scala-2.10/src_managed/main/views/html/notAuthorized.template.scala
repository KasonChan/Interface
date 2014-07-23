
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
object notAuthorized extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[String],List[String],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<!-- Section messages -->
"""),_display_(Seq[Any](/*5.2*/if(messages != List(""))/*5.26*/ {_display_(Seq[Any](format.raw/*5.28*/(""" 
<div id="section">
  <div id="container">
    <div id="messages">
      """),_display_(Seq[Any](/*9.8*/for(message <- messages) yield /*9.32*/ {_display_(Seq[Any](format.raw/*9.34*/("""
      """),_display_(Seq[Any](/*10.8*/message)),format.raw/*10.15*/("""<br>
    """)))})),format.raw/*11.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*15.2*/("""

<!-- Section errors -->
"""),_display_(Seq[Any](/*18.2*/if(errors != List(""))/*18.24*/ {_display_(Seq[Any](format.raw/*18.26*/(""" 
<div id="section">
  <div id="container">
    <div id="errors">
      """),_display_(Seq[Any](/*22.8*/for(error <- errors) yield /*22.28*/ {_display_(Seq[Any](format.raw/*22.30*/("""
      """),_display_(Seq[Any](/*23.8*/error)),format.raw/*23.13*/("""<br>
    """)))})),format.raw/*24.6*/("""
  </div>
</div>
</div>
""")))})),format.raw/*28.2*/("""
""")))})))}
    }
    
    def render(messages:List[String],errors:List[String]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)
    
    def f:((List[String]) => (List[String]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => apply(messages)(errors)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jul 23 12:24:55 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/notAuthorized.scala.html
                    HASH: 0f7a30a9850038403758c9913bafc0714c576841
                    MATRIX: 583->1|723->47|760->50|803->85|842->87|904->115|936->139|975->141|1084->216|1123->240|1162->242|1205->250|1234->257|1275->267|1331->292|1393->319|1424->341|1464->343|1572->416|1608->436|1648->438|1691->446|1718->451|1759->461|1815->486
                    LINES: 19->1|22->1|24->3|24->3|24->3|26->5|26->5|26->5|30->9|30->9|30->9|31->10|31->10|32->11|36->15|39->18|39->18|39->18|43->22|43->22|43->22|44->23|44->23|45->24|49->28
                    -- GENERATED --
                */
            