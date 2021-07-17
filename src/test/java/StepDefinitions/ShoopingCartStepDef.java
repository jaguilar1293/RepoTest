package StepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ShoopingCartStepDef {

    @Managed(driver = "chrome")
    private WebDriver navegaador;
    private Actor actor = Actor.named("");

    @Dado("^Que ingreso a la pagina de cursos$")
    public void queIngresoALaPaginaDeCursos() {

    }

    @Cuando("^Agrego los cursos al carrito$")
    public void agregoLosCursosAlCarrito() {

    }

    @Entonces("^Comparo el precio de la suma de los cursos seleccionados$")
    public void comparoElPrecioDeLaSumaDeLosCursosSeleccionados() {

    }
}
