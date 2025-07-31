package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ProductosPage {
    public static final Target TITULO_PRODUCTOS = Target.the("titulo de productos").located(By.className("title"));

    public static final Target BOTON_MENU_HAMBURGUESA = Target.the("menu hamburguesa").located(By.id("react-burger-menu-btn"));

    public static final Target OPCION_LOGOUT = Target.the("opción logout").located(By.id("logout_sidebar_link"));

}
