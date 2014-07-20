
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
object signupForm extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[String],List[String],User,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(messages: List[String])(errors: List[String])(user: User):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.60*/("""

<!-- Section title -->
<div id="section">
  <div id="container">
    <div id="title">"""),_display_(Seq[Any](/*6.22*/Messages("signup.title"))),format.raw/*6.46*/("""</div>
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
    <form method="post" id="signup" action=""""),_display_(Seq[Any](/*41.46*/routes/*41.52*/.Users.create)),format.raw/*41.65*/("""">
      <!-- Name -->
      <label for="name">"""),_display_(Seq[Any](/*43.26*/Messages("signup.label.name"))),format.raw/*43.55*/("""</label>
      <input type="text" name="firstname" id="firstname" placeholder="First" value=""""),_display_(Seq[Any](/*44.86*/user/*44.90*/.firstname)),format.raw/*44.100*/("""" maxlength="35" required>
      <input type="text" name="lastname" id="lastname" placeholder="Last" value=""""),_display_(Seq[Any](/*45.83*/user/*45.87*/.lastname)),format.raw/*45.96*/("""" maxlength="35" required>

      <!-- Username -->
      <label for="username">"""),_display_(Seq[Any](/*48.30*/Messages("signup.label.username"))),format.raw/*48.63*/("""</label>
      <input type="text" name="username" id="username" value=""""),_display_(Seq[Any](/*49.64*/user/*49.68*/.username)),format.raw/*49.77*/("""" maxlength="35" required>
      
      <!-- Password -->
      <label for="password">"""),_display_(Seq[Any](/*52.30*/Messages("signup.label.password"))),format.raw/*52.63*/("""</label>
      <input type="password" name="password" id="password" value=""""),_display_(Seq[Any](/*53.68*/user/*53.72*/.password)),format.raw/*53.81*/("""" maxlength="35" required>
      
      <!-- Confirm password -->
      <label for="password">"""),_display_(Seq[Any](/*56.30*/Messages("signup.label.confirmPassword"))),format.raw/*56.70*/("""</label>
      <input type="password" name="passwordConfirmation" id="passwordConfirmation" maxlength="35" required>
      
      <input type="submit" value=""""),_display_(Seq[Any](/*59.36*/Messages("signup.label.submit"))),format.raw/*59.67*/("""">
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
                    DATE: Sun Jul 20 15:03:05 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/signupForm.scala.html
                    HASH: e8f43a4114a4d8b3762477645a676fa906618ea2
                    MATRIX: 585->1|737->59|860->147|905->171|1043->274|1076->298|1116->300|1226->375|1266->399|1306->401|1349->409|1378->416|1419->426|1475->451|1587->528|1618->550|1658->552|1766->625|1802->645|1842->647|1885->655|1912->660|1953->670|2009->695|2159->809|2174->815|2209->828|2293->876|2344->905|2474->999|2487->1003|2520->1013|2665->1122|2678->1126|2709->1135|2826->1216|2881->1249|2989->1321|3002->1325|3033->1334|3156->1421|3211->1454|3323->1530|3336->1534|3367->1543|3498->1638|3560->1678|3755->1837|3808->1868
                    LINES: 19->1|22->1|27->6|27->6|33->12|33->12|33->12|37->16|37->16|37->16|38->17|38->17|39->18|43->22|47->26|47->26|47->26|51->30|51->30|51->30|52->31|52->31|53->32|57->36|62->41|62->41|62->41|64->43|64->43|65->44|65->44|65->44|66->45|66->45|66->45|69->48|69->48|70->49|70->49|70->49|73->52|73->52|74->53|74->53|74->53|77->56|77->56|80->59|80->59
                    -- GENERATED --
                */
            