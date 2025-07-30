package enums;

public enum UsuarioSauceDemo {

    USUARIO_ESTANDAR("standard_user", "secret_sauce"),
    USUARIO_BLOQUEADO("locked_out_user","secret_sauce"),
    USUARIO_PERFORMANCE("performance_glitch_user", "secret_sauce"),
    USUARIO_PROBLEMA("problem_user", "secret_sauce"),
    USUARIO_ERROR("error_user", "secret_sauce"),
    USUARIO_VISUAL("visual_user", "secret_sauce");


    private final String nombreUsuario;

    private final String contrsena;

    UsuarioSauceDemo(String nombreUsuario, String contrsena) {
        this.nombreUsuario = nombreUsuario;
        this.contrsena = contrsena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrsena() {
        return contrsena;
    }
}
