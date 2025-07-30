package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenUrl;

public class AbrirPaginaLogin implements Task {


    public static AbrirPaginaLogin delSitio() {
        return new AbrirPaginaLogin();
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Open.url("https://www.saucedemo.com/")
        );
    }
}
