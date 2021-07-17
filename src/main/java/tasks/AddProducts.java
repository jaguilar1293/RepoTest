package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.locators.WaitForWebElements;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static usersinterfaces.HomePage.*;

public class AddProducts implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ADD_PRODUCTONE),
                Click.on(ADD_PRODUCTTWO)
        );
    }

    public static AddProducts shoppingCart() {
        return instrumented(AddProducts.class);
    }

}
