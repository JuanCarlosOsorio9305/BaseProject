package tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina {
    private static final String URL_BASE = "https://the-internet.herokuapp.com";

    public static Task pagina() {
        return Task.where("{0} abre la página principal",
                Open.url(URL_BASE));
    }
}
