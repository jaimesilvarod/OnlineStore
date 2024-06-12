package OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n\nTienda Virtual");

        System.out.println("\n////////////////////////CLASES BASE//////////////////////////\n");
        // Definimos los objetos
        Producto prComputadora, prTV, prCelular;
        Categoria ctElectrodomesticos, ctTecnologia;
        //Otros Objetos de Usuario
        Usuario usAdmin, usCliente, usAdministrador;
        UsuarioAdministrador usACoach;

        // Inicializamos los objetos
        ctElectrodomesticos = new CategoriaFisico(1,"Electrodomésticos", "Todos los electrodomésticos de la tienda");
        ctTecnologia = new CategoriaFisico(2,"Tecnología", "Todos los productos de tecnología de la tienda");

        prComputadora = new Producto(1,"HP", "Computadora Gamer Envy 5",34, ctTecnologia,54);
        prTV = new Producto(2,"Televisor Panasonic", "Televisor QLED de 75 pulgadas",500, ctTecnologia,25);
        prCelular = new Producto(3,"iPhone","15 Pro Max",1250,ctTecnologia,15);

        System.out.println("\n////////////////////////HERENCIA//////////////////////////\n");

        usACoach = new UsuarioAdministrador(1,"Alfredo Castro","marconino@hotmail.com","/*45864","Administrador Senior", "Completo");

        System.out.println( "El nombre del usuario Administrador es: " + usACoach.getNombre() + " con el acceso: " + usACoach.getTipoAcceso());
        System.out.println( "El nombre del producto es: " + prTV.getNombre() + " descripción: " + prTV.getDescripcion() + " costo: "  + prTV.getPrecio());

        System.out.println("\n////////////////////////POLIMORFISMO//////////////////////////\n");

        ProductoDigital productoDigital = new ProductoDigital("Película", 12.34f);
        ProductoFisico productoFisico = new ProductoFisico(4);

        System.out.println("La entrega del producto digital es: " + productoDigital.getDetalles());
        System.out.println("La entrega del producto físico es: " + productoFisico.getDetalles());

        productoFisico.entrega();
        productoDigital.entrega();

        Usuario validarCorreo = new Usuario(76, "Juan", "colombia@net.co","gyger776","Inválido");
        System.out.println(validarCorreo.getId());
        System.out.println(validarCorreo.getNombre());
        System.out.println(validarCorreo.getEmail());
        System.out.println(validarCorreo.getContrasena());
        System.out.println(validarCorreo.getRol());
        System.out.println("///////////////////////////////////////////////////////////");
        validarCorreo.setEmail("@0793234");
        System.out.println("///////////////////////////////////////////////////////////");

        System.out.println("\n////////////////////////ABSTRACCIÓN//////////////////////////\n");
        GestorInventario inventarioDigital = new InventarioDigital(23);
        GestorInventario inventarioFisico = new InventarioFisico(33);

        inventarioDigital.anadirProducto("Suscripción curso Java", 55);
        inventarioFisico.anadirProducto("Libro de Java", 12);

        inventarioDigital.actualizarStock("Suscripción curso Java", 23);
        inventarioFisico.actualizarStock("Libro de Java", 15);

        System.out.println("El inventario Digital tiene en stock " + inventarioDigital.getCantidad() + " productos.");
        System.out.println("El inventario Físico tiene en stock " + inventarioFisico.getCantidad() + " productos.");

        System.out.println("\n////////////////////////SINGLETON//////////////////////////\n");
        ConfiguracionGeneral configuracionSistema = ConfiguracionGeneral.getInstance();

        System.out.println(configuracionSistema.getParametroDB("host"));
        System.out.println(configuracionSistema.getParametroUI("idioma"));
        configuracionSistema.setParametrosConexionDB("host", "172.12.25.25");
        configuracionSistema.setConfiguracionesUI("idioma", "francés");
        //Probando cuando no hay un valor
        System.out.println(configuracionSistema.setConfiguracionesUI("enfasisColor", "azul"));

        System.out.println("\n////////////////////////FACTORY//////////////////////////\n");

        Map<String, String> parametrosProductoDigital = new HashMap<>();
        parametrosProductoDigital.put("id","21");
        parametrosProductoDigital.put("Nombre", "Membresía Internet TV");
        parametrosProductoDigital.put("precio", "100");
        Producto productoFDigital = ProductoFactory.crearProducto("Digital", parametrosProductoDigital);

        Map<String, String> parametrosProductoFisico = new HashMap<>();
        parametrosProductoFisico.put("id","37");
        parametrosProductoFisico.put("Nombre", "Televisor LG");
        parametrosProductoFisico.put("precio", "400");
        Producto productoFFisico = ProductoFactory.crearProducto("Físico", parametrosProductoFisico);
    }
}