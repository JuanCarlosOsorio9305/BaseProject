package stepsdefinitions.saucedemo;

import enums.UsuarioSauceDemo;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import tasks.AbrirPaginaLogin;
import tasks.IniciarSesion;

public class LoginStepDefinitions {



    @Dado("que el usuario este en la página de login de Sauce Demo")
    public void queElUsuarioEsteEnLaPaginaDeLoginDeSauceDemo() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AbrirPaginaLogin.delSitio()
        );
    }
    @Cuando("el usuario inicia sesión con credenciales de {string}")
    public void elUsuarioIniciaSesionConCredencialesDe(String tipoUsuario) {
        UsuarioSauceDemo usuario = UsuarioSauceDemo.valueOf(tipoUsuario);
        OnStage.theActorInTheSpotlight().attemptsTo(
                IniciarSesion.con(usuario)
        );
    }
    @Entonces("debería ver la pagina de productos")
    public void deberiaVerLaPaginaDeProductos() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debería poder cerrar sesión exitosamente")
    public void deberiaPoderCerrarSesionExitosamente() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
