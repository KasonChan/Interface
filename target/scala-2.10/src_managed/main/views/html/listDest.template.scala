
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
object listDest extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Destination],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(destinations: List[Destination]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.35*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<div id="section">
  <div id="container">
    <!-- Check if the list of destinations is not empty -->
    """),_display_(Seq[Any](/*7.6*/if(!destinations.isEmpty)/*7.31*/ {_display_(Seq[Any](format.raw/*7.33*/("""
    """),_display_(Seq[Any](/*8.6*/for(destination <- destinations) yield /*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
    <form method="post" id="destination" action="#">
      <input type="text" name="username" id="username" 
      value=""""),_display_(Seq[Any](/*11.15*/destination/*11.26*/.username)),format.raw/*11.35*/("""" required readonly>

      <!-- Destination -->
      <label for="username">"""),_display_(Seq[Any](/*14.30*/Messages("destination.label.destination"))),format.raw/*14.71*/("""</label>

      <!-- Username -->
      <input type="text" name="destinationUsername" id="destinationUsername" 
      value=""""),_display_(Seq[Any](/*18.15*/destination/*18.26*/.destinationUsername)),format.raw/*18.46*/("""" required readonly>

      <!-- Hostname -->
      <input type="text" name="destinationHostname" id="destinationHostname" 
      value=""""),_display_(Seq[Any](/*22.15*/destination/*22.26*/.destinationHostname)),format.raw/*22.46*/("""" required readonly>

      <!-- Password -->
      <input type="password" name="destinationPassword" id="destinationPassword"
      value=""""),_display_(Seq[Any](/*26.15*/destination/*26.26*/.destinationPassword)),format.raw/*26.46*/("""" required readonly>      
    </form>
  """)))})),format.raw/*28.4*/(""" 
""")))})),format.raw/*29.2*/("""
<!-- Check if the list of destinations is not empty-->
"""),_display_(Seq[Any](/*31.2*/if(destinations.isEmpty)/*31.26*/ {_display_(Seq[Any](format.raw/*31.28*/("""
<div id="errors">
  """),_display_(Seq[Any](/*33.4*/Messages("destination.empty"))),format.raw/*33.33*/("""
</div>
""")))})),format.raw/*35.2*/("""
</div>
</div>
""")))})),format.raw/*38.2*/("""
"""))}
    }
    
    def render(destinations:List[Destination]): play.api.templates.HtmlFormat.Appendable = apply(destinations)
    
    def f:((List[Destination]) => play.api.templates.HtmlFormat.Appendable) = (destinations) => apply(destinations)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 07 16:14:11 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/listDest.scala.html
                    HASH: 87bac57736671cdf8fe61743bcf3f6961f16242d
                    MATRIX: 570->1|697->34|734->37|777->72|816->74|958->182|991->207|1030->209|1070->215|1117->247|1156->249|1316->373|1336->384|1367->393|1481->471|1544->512|1706->638|1726->649|1768->669|1942->807|1962->818|2004->838|2181->979|2201->990|2243->1010|2316->1052|2350->1055|2442->1112|2475->1136|2515->1138|2572->1160|2623->1189|2663->1198|2710->1214
                    LINES: 19->1|22->1|24->3|24->3|24->3|28->7|28->7|28->7|29->8|29->8|29->8|32->11|32->11|32->11|35->14|35->14|39->18|39->18|39->18|43->22|43->22|43->22|47->26|47->26|47->26|49->28|50->29|52->31|52->31|52->31|54->33|54->33|56->35|59->38
                    -- GENERATED --
                */
            