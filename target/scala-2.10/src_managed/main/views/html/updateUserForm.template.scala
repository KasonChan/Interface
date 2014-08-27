
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
object updateUserForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("update.title"))),format.raw/*6.46*/("""</div>
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
    <form method="post" id="update" action=""""),_display_(Seq[Any](/*41.46*/routes/*41.52*/.Users.edit(user.username, "updated"))),format.raw/*41.89*/("""">
    <!-- Name -->
    <label for="name">"""),_display_(Seq[Any](/*43.24*/Messages("update.label.name"))),format.raw/*43.53*/("""</label>
    <input type="text" name="firstname" id="firstname" value=""""),_display_(Seq[Any](/*44.64*/user/*44.68*/.firstname)),format.raw/*44.78*/("""" 
    maxlength="35" required>
    <input type="text" name="lastname" id="lastname" value=""""),_display_(Seq[Any](/*46.62*/user/*46.66*/.lastname)),format.raw/*46.75*/("""" 
    maxlength="35" required>

    <!-- Username -->
    <label for="username">"""),_display_(Seq[Any](/*50.28*/Messages("update.label.username"))),format.raw/*50.61*/("""</label>
    <input type="text" name="username" id="username" value=""""),_display_(Seq[Any](/*51.62*/user/*51.66*/.username)),format.raw/*51.75*/("""" 
    required readonly>

    <!-- Password -->
    <label for="password">"""),_display_(Seq[Any](/*55.28*/Messages("update.label.password"))),format.raw/*55.61*/("""</label>
    <input type="password" name="password" id="password" 
    value=""""),_display_(Seq[Any](/*57.13*/user/*57.17*/.password)),format.raw/*57.26*/("""" maxlength="35" required>

    <input type="submit" value=""""),_display_(Seq[Any](/*59.34*/Messages("update.label.submit"))),format.raw/*59.65*/("""">
  </form>
</div>
</div>
"""))}
    }
    
    def render(messages:List[String],errors:List[String],user:User): play.api.templates.HtmlFormat.Appendable = apply(messages)(errors)(user)
    
    def f:((List[String]) => (List[String]) => (User) => play.api.templates.HtmlFormat.Appendable) = (messages) => (errors) => (user) => apply(messages)(errors)(user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Aug 27 15:07:58 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/updateUserForm.scala.html
                    HASH: 2c3224515c295c58acc4fe3c05eab6d1e00991db
                    MATRIX: 589->1|741->59|864->147|909->171|1047->274|1080->298|1120->300|1230->375|1270->399|1310->401|1353->409|1382->416|1423->426|1479->451|1591->528|1622->550|1662->552|1770->625|1806->645|1846->647|1889->655|1916->660|1957->670|2013->695|2163->809|2178->815|2237->852|2317->896|2368->925|2476->997|2489->1001|2521->1011|2650->1104|2663->1108|2694->1117|2812->1199|2867->1232|2973->1302|2986->1306|3017->1315|3129->1391|3184->1424|3299->1503|3312->1507|3343->1516|3440->1577|3493->1608
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|64->43|64->43|65->44|65->44|65->44|67->46|67->46|67->46|71->50|71->50|72->51|72->51|72->51|76->55|76->55|78->57|78->57|78->57|80->59|80->59
                    -- GENERATED --
                */
            