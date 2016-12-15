
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProduct_Scope0 {
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

     object addProduct_Scope1 {
import helper._

class addProduct extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(addProductForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.40*/("""

"""),format.raw/*7.102*/("""

"""),_display_(/*9.2*/main("Add Product")/*9.21*/ {_display_(Seq[Any](format.raw/*9.23*/("""
	"""),format.raw/*10.2*/("""<h3>Add a new Product</h3>
	
	<!-- Use the views.html.helpers package to create the form -->
	"""),_display_(/*13.3*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role->"form")/*13.102*/ {_display_(Seq[Any](format.raw/*13.104*/("""
		
		"""),format.raw/*15.3*/("""<!-- Build the form, adding an input for each field -->
		<!-- Note the label parameter -->
		"""),_display_(/*17.4*/inputText(addProductForm("name"), '_label -> "Name",'class -> "form-control")),format.raw/*17.81*/("""
		"""),_display_(/*18.4*/inputText(addProductForm("category"), '_label -> "Category",'class -> "form-control")),format.raw/*18.89*/("""
		"""),_display_(/*19.4*/inputText(addProductForm("description"), '_label -> "Description",'class -> "form-control")),format.raw/*19.95*/("""
		"""),_display_(/*20.4*/inputText(addProductForm("stock"), '_label -> "Stock",'class -> "form-control")),format.raw/*20.83*/("""
		"""),_display_(/*21.4*/inputText(addProductForm("price"), '_label -> "Price",'class -> "form-control")),format.raw/*21.83*/("""

		"""),_display_(/*23.4*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*23.71*/("""
	"""),format.raw/*24.2*/("""<!-- Add a submit button -->
  <div class="actions">
      <input type="submit" value="Add Product" class="btn btn-primary">
			<a href=""""),_display_(/*27.14*/routes/*27.20*/.HomeController.products()),format.raw/*27.46*/(""""><button class="btn btn-warning">Cancel</button>
	  		</a>
  </div>
	""")))}),format.raw/*30.3*/(""" """),format.raw/*30.4*/("""<!-- End Form definition -->

""")))}),format.raw/*32.2*/(""" """),format.raw/*32.3*/("""<!-- End of page content -->

"""))
      }
    }
  }

  def render(addProductForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => apply(addProductForm)

  def ref: this.type = this

}


}
}

/**/
object addProduct extends addProduct_Scope0.addProduct_Scope1.addProduct
              /*
                  -- GENERATED --
                  DATE: Thu Dec 15 17:35:10 GMT 2016
                  SOURCE: /home/wdd/webapps/Lab10part1/app/views/addProduct.scala.html
                  HASH: 35a39c3d7e2938c2f8a5a08704e15fff53e74543
                  MATRIX: 818->110|951->148|981->251|1009->254|1036->273|1075->275|1104->277|1225->372|1334->471|1375->473|1408->479|1529->574|1627->651|1657->655|1763->740|1793->744|1905->835|1935->839|2035->918|2065->922|2165->1001|2196->1006|2284->1073|2313->1075|2478->1213|2493->1219|2540->1245|2641->1316|2669->1317|2730->1348|2758->1349
                  LINES: 30->5|35->5|37->7|39->9|39->9|39->9|40->10|43->13|43->13|43->13|45->15|47->17|47->17|48->18|48->18|49->19|49->19|50->20|50->20|51->21|51->21|53->23|53->23|54->24|57->27|57->27|57->27|60->30|60->30|62->32|62->32
                  -- GENERATED --
              */
          