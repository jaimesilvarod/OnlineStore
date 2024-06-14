Bienvenidos al repositorio del curso de POO
Broward International University

En este repo se publican los avances de cada entrega pactada.

V.1
- Creación del proyecto en IntelliJ IDEA
- Creación de las clases Categoria, Producto, Usuario y CarritoDeCompras
- Inclusión de atributos, constructor y métodos por clase
 
V 1.5
- Creación de las clases que heredan de Producto y Usuario: ProductoDigital y ProductoFisico; y UsuarioCliente y Usuario Administrador.

V.2
- Definición e instancias de objetos
- Herencia en Usuario y Producto

V.2.1
- Correcciones finales para la entrega de Herencia

v.3.0
- Entrega del proyecto con Polimorfismo, aplicado en la clase Producto con sobrecarga de constructor y en las clases de ProductoDigital y ProductoFisico, sobrecarga de métodos

v.4
- Abstracción aplicada en la clase GestorInventario y creación de Clases Hijas InventarioDigital e InventarioFísico.

v.5
- Vimos la creación de interfaces pero aplicamos aún más abstracción con SistemadePago implementando 3 clases hijas, PagoTarjetaCredito, PagoTransFerenciaBancaria y PagoPayPal.

V.6 
- Se aplican atributos privados a las clases Producto, Usuario y CarritoDeCompras, con sus setters y getters.
- Se realiza validación anti números negativos (Producto) y de correo electrónico (Usuario).
- Se abstrae la Clase Categoria de las clases CategoriaDigital y CategoriaFisica.
- Se actualiza el diagrama de clases de la aplicación.

V.7
- Aplicación del patrón de diseño Singleton como la clase de configuración y Factory para la creación de Productos.
- Aplicación del patrón de diseño Observador en el ejemplo de la clase con CuentaBancaria y MovimientoBancario; además, se crea la forma no obsoleta del patrón en una clase InventarioObservable y su clase que observa MovimientoInventario.

![Diagrama de Clases de nuestra Online Store.](img/diagrama-clases.png)
