package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterface.ProductosPage;

public class EstadoLogin implements Question<Boolean> {


    public static EstadoLogin esExito() {
        return new EstadoLogin();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductosPage.TITULO_PRODUCTOS.resolveFor(actor).isVisible();
    }
}
