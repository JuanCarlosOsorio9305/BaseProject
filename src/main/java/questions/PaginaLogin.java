package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.LoginPage;

public class PaginaLogin implements Question<String> {

    public static PaginaLogin estaPresente() {
        return new PaginaLogin();
    }


    @Override
    public String answeredBy(Actor actor) {
        return LoginPage.BOTON_LOGIN.resolveFor(actor).getValue();

    }
}
