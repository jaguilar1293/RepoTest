package usersinterfaces;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.amazon.com/stores/page/72E1DF4D-82A8-493F-8EBE-0B188CC722F8?ingress=3&visitId=df6fc52e-7be5-4a89-8ea8-212e10e330b4")
public class HomePage extends PageObject {
    public static final Target ADD_PRODUCTONE = Target.the("Boton para seleccionar productonumero uno").locatedBy("(//*[@class='style__button__1MgdH style__addToCart__9TqqV style__beacon__2ECwE ProductGridItem__addToCartBtn__2nB4J style__small__1WMMU style__disableInternalPointerEvents__1ECVO'])[1]");
    public static final Target ADD_PRODUCTTWO = Target.the("Boton para seleccionar producto numero dos").locatedBy("(//*[@class='style__button__1MgdH style__addToCart__9TqqV style__beacon__2ECwE ProductGridItem__addToCartBtn__2nB4J style__small__1WMMU style__disableInternalPointerEvents__1ECVO'])[2]");
    public static final Target BUTTON_CART = Target.the("Boton del carrito").located(By.id("nav-cart-count"));
    public static final Target BUTTON_DELECT_PRODUCT = Target.the("Eliminar producto del carito").located(By.name("submit.delete.C54244662-56b4-4b4e-a0e7-455f05c2ae24"));

}
