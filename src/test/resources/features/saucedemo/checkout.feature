#language: es

Característica: Checkout
  Como usuario del sistema SauceDemo
  Quiero poder realizar agregar un producto
  Para poder realizar el Checkout

  Antecedentes:
    Dado que el usuario este en la página de login de Sauce Demo
    Cuando el usuario inicia sesión con credenciales de "USUARIO_ESTANDAR"

  @smokeTest
  Esquema del escenario: Agregar productos y realizar pago
    Cuando el usuario agregue el producto con nombre "<producto>"
    Y ingresa su información personal
      | nombre   | apellidos   | codigoPostal   |
      | <nombre> | <apellidos> | <codigoPostal> |
    Entonces validar los mensajes al finalizar la compra
      | <mensaje1> | <mensaje2> |

    Ejemplos:
      | nombre | apellidos   | codigoPostal | producto              | mensaje1                  | mensaje2                                                                                |
      | JUAN   | OSORIO      | 154598       | Sauce Labs Backpack   | Thank you for your order! | Your order has been dispatched, and will arrive just as fast as the pony can get there! |
      | KEVIN  | GAMANTHALER | 545566       | Sauce Labs Bike Light | Thank you for your order! | Your order has been dispatched, and will arrive just as fast as the pony can get there! |



