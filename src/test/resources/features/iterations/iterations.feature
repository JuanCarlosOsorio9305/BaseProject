# language: es


  @prueba
Característica: Verificar cada sección de The-Internet
  Como usuario QA
  Quiero validar el comportamiento del page
  Para garantizar que no existan errores

 Escenario: Acceder y validar
    Dado que Juan abre la página principal
    Cuando navega a la sección Basic Auth
    Y ingrese usuario y contraseña
    Entonces debería poder interatuar sin problema

