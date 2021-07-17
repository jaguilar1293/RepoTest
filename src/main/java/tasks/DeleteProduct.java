package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static usersinterfaces.HomePage.*;

public class DeleteProduct implements Task {
    public static DeleteProduct ofCart() {
        return instrumented(DeleteProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_DELECT_PRODUCT)
        );
    }

}
