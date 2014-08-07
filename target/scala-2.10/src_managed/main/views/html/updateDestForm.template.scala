
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
object updateDestForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],List[Destination],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(destinations: List[Destination]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.81*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("update.destination.title"))),format.raw/*6.58*/("""</div>
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
    """),_display_(Seq[Any](/*41.6*/for(destination <- destinations) yield /*41.38*/ {_display_(Seq[Any](format.raw/*41.40*/("""
    <div id="content_wrapper">

      <!-- Update form -->
      <form method="post" id="update" 
      action=""""),_display_(Seq[Any](/*46.16*/routes/*46.22*/.Destinations.edit(destination.username, 
      "updated"))),format.raw/*47.17*/("""">
      <!-- User -->
      <!-- Username -->
      <!-- Hidden -->
      <input type="text" name="username" id="username" 
      placeholder=""""),_display_(Seq[Any](/*52.21*/Messages("destination.label.username"))),format.raw/*52.59*/("""" 
      value=""""),_display_(Seq[Any](/*53.15*/destination/*53.26*/.username)),format.raw/*53.35*/("""" required readonly hidden>

      <!-- Destination -->
      <!-- Username -->
      <input type="text" name="destinationUsername" id="destinationUsername" 
      placeholder=""""),_display_(Seq[Any](/*58.21*/Messages("destination.label.username"))),format.raw/*58.59*/("""" 
      value=""""),_display_(Seq[Any](/*59.15*/destination/*59.26*/.destinationUsername)),format.raw/*59.46*/("""" readonly required>

      <!-- Hostname -->
      <input type="text" name="destinationHostname" id="destinationHostname" 
      placeholder=""""),_display_(Seq[Any](/*63.21*/Messages("destination.label.hostname"))),format.raw/*63.59*/("""" 
      value=""""),_display_(Seq[Any](/*64.15*/destination/*64.26*/.destinationHostname)),format.raw/*64.46*/("""" readonly required>

      <!-- Password -->
      <input type="password" name="destinationPassword" id="destinationPassword" 
      placeholder=""""),_display_(Seq[Any](/*68.21*/Messages("destination.label.password"))),format.raw/*68.59*/("""" 
      value=""""),_display_(Seq[Any](/*69.15*/destination/*69.26*/.destinationPassword)),format.raw/*69.46*/("""" required>

      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*72.36*/Messages("update.destination.label.submit"))),format.raw/*72.79*/("""">
    </form>

    <!-- Delete form -->
    <!-- All fields of this form is hidden except the submit button -->
    <form method="post" id="delete" 
    action=""""),_display_(Seq[Any](/*78.14*/routes/*78.20*/.Destinations.edit(destination.username, 
    "deleted"))),format.raw/*79.15*/("""">
    <!-- User -->
    <!-- Username -->
    <input type="text" name="username" id="username" 
    placeholder=""""),_display_(Seq[Any](/*83.19*/Messages("destination.label.username"))),format.raw/*83.57*/("""" 
    value=""""),_display_(Seq[Any](/*84.13*/destination/*84.24*/.username)),format.raw/*84.33*/("""" required readonly hidden>

    <!-- Destination -->
    <!-- Username -->
    <input type="text" name="destinationUsername" id="destinationUsername" 
    placeholder=""""),_display_(Seq[Any](/*89.19*/Messages("destination.label.username"))),format.raw/*89.57*/("""" 
    value=""""),_display_(Seq[Any](/*90.13*/destination/*90.24*/.destinationUsername)),format.raw/*90.44*/("""" readonly required hidden>

    <!-- Hostname -->
    <input type="text" name="destinationHostname" id="destinationHostname" 
    placeholder=""""),_display_(Seq[Any](/*94.19*/Messages("destination.label.hostname"))),format.raw/*94.57*/("""" 
    value=""""),_display_(Seq[Any](/*95.13*/destination/*95.24*/.destinationHostname)),format.raw/*95.44*/("""" readonly required hidden>

    <!-- Password -->
    <input type="password" name="destinationPassword" id="destinationPassword" 
    placeholder=""""),_display_(Seq[Any](/*99.19*/Messages("destination.label.password"))),format.raw/*99.57*/("""" 
    value=""""),_display_(Seq[Any](/*100.13*/destination/*100.24*/.destinationPassword)),format.raw/*100.44*/("""" readonly required hidden>

    <!-- Submit -->
    <input type="submit" value=""""),_display_(Seq[Any](/*103.34*/Messages("update.destination.label.delete"))),format.raw/*103.77*/("""">
  </form>
</div>
""")))})),format.raw/*106.2*/("""
</div>
</div>
"""))}
    }
    
    def render(messages:List[String],errors:List[String],destinations:List[Destination]): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(destinations)
    
    def f:((List[String]) => (List[String]) => (List[Destination]) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (destinations) => apply(messages)(errors)(destinations)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 07 16:14:11 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/updateDestForm.scala.html
                    HASH: 86f85101d4d7da4e772a6fd8e3ec4dc376765172
                    MATRIX: 602->1|775->80|898->168|955->204|1093->307|1126->331|1166->333|1276->408|1316->432|1356->434|1399->442|1428->449|1469->459|1525->484|1637->561|1668->583|1708->585|1816->658|1852->678|1892->680|1935->688|1962->693|2003->703|2059->728|2168->802|2216->834|2256->836|2406->950|2421->956|2501->1014|2682->1159|2742->1197|2795->1214|2815->1225|2846->1234|3060->1412|3120->1450|3173->1467|3193->1478|3235->1498|3415->1642|3475->1680|3528->1697|3548->1708|3590->1728|3774->1876|3834->1914|3887->1931|3907->1942|3949->1962|4055->2032|4120->2075|4319->2238|4334->2244|4412->2300|4563->2415|4623->2453|4674->2468|4694->2479|4725->2488|4931->2658|4991->2696|5042->2711|5062->2722|5104->2742|5285->2887|5345->2925|5396->2940|5416->2951|5458->2971|5643->3120|5703->3158|5755->3173|5776->3184|5819->3204|5938->3286|6004->3329|6057->3350
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|67->46|67->46|68->47|73->52|73->52|74->53|74->53|74->53|79->58|79->58|80->59|80->59|80->59|84->63|84->63|85->64|85->64|85->64|89->68|89->68|90->69|90->69|90->69|93->72|93->72|99->78|99->78|100->79|104->83|104->83|105->84|105->84|105->84|110->89|110->89|111->90|111->90|111->90|115->94|115->94|116->95|116->95|116->95|120->99|120->99|121->100|121->100|121->100|124->103|124->103|127->106
                    -- GENERATED --
                */
            