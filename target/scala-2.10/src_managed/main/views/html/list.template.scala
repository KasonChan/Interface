
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
object list extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[User],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(users: List[User]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.21*/("""

"""),_display_(Seq[Any](/*3.2*/frame(Messages("application.name"))/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
<div id="section">
  <div id="container">
    """),_display_(Seq[Any](/*6.6*/if(!users.isEmpty)/*6.24*/ {_display_(Seq[Any](format.raw/*6.26*/("""
    """),_display_(Seq[Any](/*7.6*/for(user <- users) yield /*7.24*/ {_display_(Seq[Any](format.raw/*7.26*/("""
    <form method="post" id="signup" action="">
      <label for="username">"""),_display_(Seq[Any](/*9.30*/Messages("update.label.name"))),format.raw/*9.59*/("""</label>
      <input type="text" name="firstname" id="firstname" value=""""),_display_(Seq[Any](/*10.66*/user/*10.70*/.firstname)),format.raw/*10.80*/("""" required readonly>
      <input type="text" name="lastname" id="lastname" value=""""),_display_(Seq[Any](/*11.64*/user/*11.68*/.lastname)),format.raw/*11.77*/("""" required readonly>

      <label for="username">"""),_display_(Seq[Any](/*13.30*/Messages("update.label.username"))),format.raw/*13.63*/("""</label>
      <input type="text" name="username" id="username" value=""""),_display_(Seq[Any](/*14.64*/user/*14.68*/.username)),format.raw/*14.77*/("""" required readonly>

      <label for="password">"""),_display_(Seq[Any](/*16.30*/Messages("update.label.password"))),format.raw/*16.63*/("""</label>
      <input type="password" name="password" id="password" value=""""),_display_(Seq[Any](/*17.68*/user/*17.72*/.password)),format.raw/*17.81*/("""" required readonly>
    </form>
  """)))})),format.raw/*19.4*/("""
""")))})),format.raw/*20.2*/("""
"""),_display_(Seq[Any](/*21.2*/if(users.isEmpty)/*21.19*/ {_display_(Seq[Any](format.raw/*21.21*/("""
<div id="errors">
  """),_display_(Seq[Any](/*23.4*/Messages("update.empty"))),format.raw/*23.28*/("""
</div>
""")))})),format.raw/*25.2*/("""
</div>
</div>
""")))})),format.raw/*28.2*/("""
"""))}
    }
    
    def render(users:List[User]): play.api.templates.HtmlFormat.Appendable = apply(users)
    
    def f:((List[User]) => play.api.templates.HtmlFormat.Appendable) = (users) => apply(users)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Aug 07 16:14:11 CDT 2014
                    SOURCE: /home/ka-son/Documents/Interface/app/views/list.scala.html
                    HASH: 307ab1962bfaf4c1af8d8610697cede4f34d57f7
                    MATRIX: 559->1|672->20|709->23|752->58|791->60|873->108|899->126|938->128|978->134|1011->152|1050->154|1162->231|1212->260|1322->334|1335->338|1367->348|1487->432|1500->436|1531->445|1618->496|1673->529|1781->601|1794->605|1825->614|1912->665|1967->698|2079->774|2092->778|2123->787|2190->823|2223->825|2260->827|2286->844|2326->846|2383->868|2429->892|2469->901|2516->917
                    LINES: 19->1|22->1|24->3|24->3|24->3|27->6|27->6|27->6|28->7|28->7|28->7|30->9|30->9|31->10|31->10|31->10|32->11|32->11|32->11|34->13|34->13|35->14|35->14|35->14|37->16|37->16|38->17|38->17|38->17|40->19|41->20|42->21|42->21|42->21|44->23|44->23|46->25|49->28
                    -- GENERATED --
                */
            