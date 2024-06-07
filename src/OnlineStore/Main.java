package OnlineStore;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tienda Virtual");

        // Definimos los objetos
        Producto prComputadora, prTV, prCelular;
        Categoria ctElectrodomesticos, ctTecnologia;
        //Otros Objetos de Usuario
        Usuario usAdmin, usCliente, usAdministrador;
        UsuarioAdministrador usACoach;

        // Inicializamos los objetos
        ctElectrodomesticos = new Categoria(1,"Electrodomésticos", "Todos los electrodomésticos de la tienda");
        ctTecnologia = new Categoria(2,"Tecnología", "Todos los productos de tecnología de la tienda");

        prComputadora = new Producto(1,"HP", "Computadora Gamer Envy 5",34, ctTecnologia,54);
        prTV = new Producto(2,"Televisor Panasonic", "Televisor QLED de 75 pulgadas",500, ctTecnologia,25);
        prCelular = new Producto(3,"iPhone","15 Pro Max",1250,ctTecnologia,15);



        usACoach = new UsuarioAdministrador(1,"Alfredo Castro","julionino@hotmail.com","/*45864","Administrador Senior", "Completo");

        System.out.println( "El nombre del usuario Administrador es: " + usACoach.nombre + " con el acceso: " + usACoach.getTipoAcceso());
        System.out.println( "El nombre del producto es: " + prTV.getNombre() + " descripción: " + prTV.getDescripcion() + " costo: "  + prTV.getPrecio());

        ProductoDigital productoDigital = new ProductoDigital("Película", 12.34f);
        ProductoFisico productoFisico = new ProductoFisico(4);

        System.out.println("La entrega del producto digital es: " + productoDigital.getDetalles());
        System.out.println("La entrega del producto físico es: " + productoFisico.getDetalles());

        productoFisico.entrega();
        productoDigital.entrega();

    }
}