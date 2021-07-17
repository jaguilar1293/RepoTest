package StepDefinitions;

import cucumber.api.java.en_old.Ac;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.MaximizeWindow;
import tasks.AddProducts;
import tasks.DeleteProduct;
import tasks.OpenToCart;
import usersinterfaces.HomePage;

import java.util.concurrent.TimeUnit;

public class ShoopingCartStepDef {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("");
    private HomePage homePage = new HomePage();

    @Dado("^Que ingreso a la pagina de productos$")
    public void queIngresoALaPaginaDeCursos() {
        actor.can(BrowseTheWeb.with(navegador));
        navegador.manage().window().maximize();
        actor.wasAbleTo(Open.browserOn(homePage));

    }

    @Cuando("^Agrego los productos al carrito$")
    public void agregoLosCursosAlCarrito() {
        actor.wasAbleTo(
                AddProducts.shoppingCart()
        );
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @Entonces("^Comparo el precio de la suma de los cursos seleccionados$")
    public void comparoElPrecioDeLaSumaDeLosCursosSeleccionados() {
        actor.wasAbleTo(
                OpenToCart.product(),
                DeleteProduct.ofCart()
        );

    }
}
