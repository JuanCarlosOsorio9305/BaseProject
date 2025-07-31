#language: es

Característica: Autenticación en SauceDemo
  Como usuario del sistema SauceDemo
  Quiero poder iniciar sesión con diferentes tipos de usuarios
  Para acceder a las funcionalidades de la aplicación

  Antecedentes:
    Dado que el usuario este en la página de login de Sauce Demo


  @smokeTest
  Escenario: Inicio de sesión exitoso con usuario estándar
    Cuando el usuario inicia sesión con credenciales de "USUARIO_ESTANDAR"
    Entonces debería ver la pagina de productos
    Y debería poder cerrar sesión exitosamente

  @login_exitoso
  Escenario: Inicio de sesión exitoso con usuario bloqueado
    Cuando el usuario inicia sesión con credenciales de "USUARIO_BLOQUEADO"
    Entonces debería ver la pagina de productos
    Y debería poder cerrar sesión exitosamente

  @prueba
  Escenario: Inicio de sesión exitoso con usuario performance
    Cuando el usuario inicia sesión con credenciales de "USUARIO_PERFORMANCE"
    Entonces debería ver la pagina de productos
    Y debería poder cerrar sesión exitosamente