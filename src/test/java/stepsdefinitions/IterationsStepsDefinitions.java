package stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.AbrirPagina;

public class IterationsStepsDefinitions {

    @Before
    public void prepararEscenario() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que Juan abre la página principal")
    public void queJuanAbreLaPaginaPrincipal() {
        OnStage.theActorCalled("Juan").attemptsTo(AbrirPagina.pagina());
    }
    @Cuando("navega a la sección Basic Auth")
    public void navegaALaSeccionBasicAuth() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Cuando("ingrese usuario y contraseña")
    public void ingreseUsuarioYContraseña() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Entonces("debería poder interatuar sin problema")
    public void deberiaPoderInteratuarSinProblema() {
        // Write code here that turns the phrase above into concrete actions
    }
}
