package tasks;

import enums.UsuarioSauceDemo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.LoginPage;

public class IniciarSesion implements Task {

    private final UsuarioSauceDemo  usuario;

    public IniciarSesion(UsuarioSauceDemo usuario) {
        this.usuario = usuario;
    }

    public static IniciarSesion con(UsuarioSauceDemo usuario) {
        return new IniciarSesion(usuario);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Enter.theValue(usuario.getNombreUsuario()).into(LoginPage.CAMPO_USUARIO));
        t.attemptsTo(Enter.theValue(usuario.getContrsena()).into(LoginPage.CAMPO_CONTRASENA));
        t.attemptsTo(Click.on(LoginPage.BOTON_LOGIN));
    }
}
