package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.InstrumentedTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ProductosPage;

public class CerrarSesion implements Task {


    public static CerrarSesion delaAplicacion() {
        return Instrumented.instanceOf(CerrarSesion.class).newInstance();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(ProductosPage.BOTON_MENU_HAMBURGUESA));
        WaitUntil.the(ProductosPage.OPCION_LOGOUT, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds();
        t.attemptsTo(Click.on(ProductosPage.OPCION_LOGOUT));
    }
}
