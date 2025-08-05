package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target CAMPO_USUARIO = Target.the("Campo Usuario").located(By.id("user-name"));

    public static final Target CAMPO_CONTRASENA = Target.the("Campo de Contraseña").located(By.id("password"));

    public static final Target BOTON_LOGIN = Target.the("botón de login").located(By.id("login-button"));

    public static final Target MENSAJE_ERROR = Target.the("mensaje de error").locatedBy("[data-test= 'error']");



}
