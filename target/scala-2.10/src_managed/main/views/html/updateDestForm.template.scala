
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

      <!-- Type -->
      <input type="text" name="destinationType" id="destinationType" 
      value=""""),_display_(Seq[Any](/*73.15*/destination/*73.26*/.destinationType)),format.raw/*73.42*/("""" maxlength="35" 
      onclick="changeDestinationType()" 
      onfocus="showTypeHint()" onblur="hideTypeHint()" readonly required>

      <!-- Submit -->
      <input type="submit" value=""""),_display_(Seq[Any](/*78.36*/Messages("update.destination.label.submit"))),format.raw/*78.79*/("""">
    </form>

    <!-- Delete form -->
    <!-- All fields of this form is hidden except the submit button -->
    <form method="post" id="delete" 
    action=""""),_display_(Seq[Any](/*84.14*/routes/*84.20*/.Destinations.edit(destination.username, 
    "deleted"))),format.raw/*85.15*/("""">
    <!-- User -->
    <!-- Username -->
    <input type="text" name="username" id="username" 
    placeholder=""""),_display_(Seq[Any](/*89.19*/Messages("destination.label.username"))),format.raw/*89.57*/("""" 
    value=""""),_display_(Seq[Any](/*90.13*/destination/*90.24*/.username)),format.raw/*90.33*/("""" required readonly hidden>

    <!-- Destination -->
    <!-- Username -->
    <input type="text" name="destinationUsername" id="destinationUsername" 
    placeholder=""""),_display_(Seq[Any](/*95.19*/Messages("destination.label.username"))),format.raw/*95.57*/("""" 
    value=""""),_display_(Seq[Any](/*96.13*/destination/*96.24*/.destinationUsername)),format.raw/*96.44*/("""" readonly required hidden>

    <!-- Hostname -->
    <input type="text" name="destinationHostname" id="destinationHostname" 
    placeholder=""""),_display_(Seq[Any](/*100.19*/Messages("destination.label.hostname"))),format.raw/*100.57*/("""" 
    value=""""),_display_(Seq[Any](/*101.13*/destination/*101.24*/.destinationHostname)),format.raw/*101.44*/("""" readonly required hidden>

    <!-- Password -->
    <input type="password" name="destinationPassword" id="destinationPassword" 
    placeholder=""""),_display_(Seq[Any](/*105.19*/Messages("destination.label.password"))),format.raw/*105.57*/("""" 
    value=""""),_display_(Seq[Any](/*106.13*/destination/*106.24*/.destinationPassword)),format.raw/*106.44*/("""" readonly required hidden>

    <!-- Type -->
    <input type="text" name="destinationType" id="destinationType" 
    value=""""),_display_(Seq[Any](/*110.13*/destination/*110.24*/.destinationType)),format.raw/*110.40*/("""" maxlength="35" 
    onclick="changeDestinationType()" 
    onfocus="showTypeHint()" onblur="hideTypeHint()" readonly required hidden>

    <!-- Submit -->
    <input type="submit" value=""""),_display_(Seq[Any](/*115.34*/Messages("update.destination.label.delete"))),format.raw/*115.77*/("""">
  </form>
</div>
""")))})),format.raw/*118.2*/("""
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
                    DATE: Wed Aug 27 15:08:00 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/updateDestForm.scala.html
                    HASH: a453841570f91c4f064f61d9d845289569f3259b
                    MATRIX: 602->1|775->80|898->168|955->204|1093->307|1126->331|1166->333|1276->408|1316->432|1356->434|1399->442|1428->449|1469->459|1525->484|1637->561|1668->583|1708->585|1816->658|1852->678|1892->680|1935->688|1962->693|2003->703|2059->728|2168->802|2216->834|2256->836|2406->950|2421->956|2501->1014|2682->1159|2742->1197|2795->1214|2815->1225|2846->1234|3060->1412|3120->1450|3173->1467|3193->1478|3235->1498|3415->1642|3475->1680|3528->1697|3548->1708|3590->1728|3774->1876|3834->1914|3887->1931|3907->1942|3949->1962|4102->2079|4122->2090|4160->2106|4387->2297|4452->2340|4651->2503|4666->2509|4744->2565|4895->2680|4955->2718|5006->2733|5026->2744|5057->2753|5263->2923|5323->2961|5374->2976|5394->2987|5436->3007|5618->3152|5679->3190|5731->3205|5752->3216|5795->3236|5981->3385|6042->3423|6094->3438|6115->3449|6158->3469|6322->3596|6343->3607|6382->3623|6609->3813|6675->3856|6728->3877
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|67->46|67->46|68->47|73->52|73->52|74->53|74->53|74->53|79->58|79->58|80->59|80->59|80->59|84->63|84->63|85->64|85->64|85->64|89->68|89->68|90->69|90->69|90->69|94->73|94->73|94->73|99->78|99->78|105->84|105->84|106->85|110->89|110->89|111->90|111->90|111->90|116->95|116->95|117->96|117->96|117->96|121->100|121->100|122->101|122->101|122->101|126->105|126->105|127->106|127->106|127->106|131->110|131->110|131->110|136->115|136->115|139->118
                    -- GENERATED --
                */
            