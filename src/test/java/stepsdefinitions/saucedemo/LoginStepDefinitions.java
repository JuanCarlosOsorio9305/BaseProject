package stepsdefinitions.saucedemo;

import enums.UsuarioSauceDemo;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;

import net.serenitybdd.screenplay.actors.OnStage;

import org.hamcrest.Matchers;
import questions.EstadoLogin;
import questions.PaginaLogin;
import tasks.AbrirPaginaLogin;
import tasks.CerrarSesion;
import tasks.IniciarSesion;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


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
        OnStage.theActorInTheSpotlight().should(
                seeThat("El resultado del login es: ", EstadoLogin.esExito(), Matchers.is(true))
        );
    }
    @Entonces("debería poder cerrar sesión exitosamente")
    public void deberiaPoderCerrarSesionExitosamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CerrarSesion.delaAplicacion()
        );
        OnStage.theActorInTheSpotlight().should(
                seeThat(PaginaLogin.estaPresente(), Matchers.containsString("Login"))
        );

    }

}
