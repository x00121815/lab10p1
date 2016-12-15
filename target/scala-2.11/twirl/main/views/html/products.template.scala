
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*3.1*/("""<!-- Pass page title and content """),format.raw/*3.34*/("""{"""),format.raw/*3.35*/("""html between braces"""),format.raw/*3.54*/("""}"""),format.raw/*3.55*/(""" """),format.raw/*3.56*/("""to the main view -->
"""),_display_(/*4.2*/main("Products")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
  """),format.raw/*5.3*/("""<!-- HTML content for the index view -->
  <div class="row">
      <div class="col-sm-2">
        <div class="well">
          <h4>Categories</h4>
        </div>
      </div>
      <div class="col-sm-10">

          """),_display_(/*14.12*/if(flash.containsKey("success"))/*14.44*/ {_display_(Seq[Any](format.raw/*14.46*/("""
              """),format.raw/*15.15*/("""<div class="alert alert-success">
              """),_display_(/*16.16*/flash/*16.21*/.get("success")),format.raw/*16.36*/("""
              """),format.raw/*17.15*/("""</div>
          """)))}),format.raw/*18.12*/("""
          """),format.raw/*19.11*/("""<table class="table table-bordered table-hover table-condensed">
          <thead>
          <!-- The header row-->
          <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Description</th>
            <th>Stock</th>
            <th>Price</th>
          </tr>
          </thead>
          <tbody>
            <!-- Product row(s) -->
					<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*34.14*/for(p <- products) yield /*34.32*/ {_display_(Seq[Any](format.raw/*34.34*/("""
			    """),format.raw/*35.8*/("""<tr>
                  <td>"""),_display_(/*36.24*/p/*36.25*/.getId),format.raw/*36.31*/("""</td>
                  <td>"""),_display_(/*37.24*/p/*37.25*/.getName),format.raw/*37.33*/("""</td>
                    <td>"""),_display_(/*38.26*/p/*38.27*/.getCategory),format.raw/*38.39*/("""</td>
                  <td>"""),_display_(/*39.24*/p/*39.25*/.getDescription),format.raw/*39.40*/("""</td>
                  <td>"""),_display_(/*40.24*/p/*40.25*/.getStock),format.raw/*40.34*/("""</td>
                  <td>&euro; """),_display_(/*41.31*/("%.2f".format(p.getPrice))),format.raw/*41.58*/("""</td>

                   <td>
                       <a href=""""),_display_(/*44.34*/routes/*44.40*/.HomeController.updateProduct(p.getId)),format.raw/*44.78*/("""" class="btn-xs btn-danger">
                           <span class="glyphicon glyphicon-pencil"></span>
                       </a>
                   </td>
                  <!-- Delete product button -->
                  <td>
                      <a href=""""),_display_(/*50.33*/routes/*50.39*/.HomeController.deleteProduct(p.getId)),format.raw/*50.77*/("""" class="btn-xs btn-danger"
                        onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                      </a>
                  </td>
				</tr>
					""")))}),format.raw/*56.7*/(""" """),format.raw/*56.8*/("""<!-- End of For loop -->
          </tbody>
        </table>
        <p>
          <a href=""""),_display_(/*60.21*/routes/*60.27*/.HomeController.addProduct()),format.raw/*60.55*/("""">
            <button class="btn btn-primary">Add a Product</button>
          </a>
        </p>
      </div>
  </div>

  <script>
    // JavaScript function returns true if user clicks yes, otherwise, false
    function confirmDel() """),format.raw/*69.27*/("""{"""),format.raw/*69.28*/("""
        """),format.raw/*70.9*/("""return confirm('Are you sure?');
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
  """),format.raw/*72.3*/("""</script>

  <!-- End of content for main -->
""")))}))
      }
    }
  }

  def render(products:List[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(products)

  def f:((List[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (products) => apply(products)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:35:10 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab10part1/app/views/products.scala.html
                  HASH: 02442591b523dfb3a9e0455a16576ac1497563c5
                  MATRIX: 765->1|892->33|920->35|980->68|1008->69|1054->88|1082->89|1110->90|1157->112|1181->128|1220->130|1249->133|1493->350|1534->382|1574->384|1617->399|1693->448|1707->453|1743->468|1786->483|1835->501|1874->512|2368->979|2402->997|2442->999|2477->1007|2532->1035|2542->1036|2569->1042|2625->1071|2635->1072|2664->1080|2722->1111|2732->1112|2765->1124|2821->1153|2831->1154|2867->1169|2923->1198|2933->1199|2963->1208|3026->1244|3074->1271|3165->1335|3180->1341|3239->1379|3528->1641|3543->1647|3602->1685|3855->1908|3883->1909|4003->2002|4018->2008|4067->2036|4330->2271|4359->2272|4395->2281|4459->2318|4487->2319|4517->2322
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|36->5|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|49->18|50->19|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|75->44|75->44|75->44|81->50|81->50|81->50|87->56|87->56|91->60|91->60|91->60|100->69|100->69|101->70|102->71|102->71|103->72
                  -- GENERATED --
              */
          