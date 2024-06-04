package OnlineStore;

public class Main {
    public static void main(String[] args) {
        System.out.print("Hello and welcome!");

        // Definimos los objetos
        Producto prComputadora, prTV, prCelular;
        Categoria ctElectrodomesticos, ctTecnologia;

        // Inicializamos los objetos
        ctElectrodomesticos = new Categoria(1,"Electrodomésticos", "Todos los electrodomésticos de la tienda");
        ctTecnologia = new Categoria(2,"Tecnología", "Todos los productos de tecnología de la tienda");

        prComputadora = new Producto(1,"HP", "Computadora Gamer Envy 5",34, ctTecnologia,54);
        prTV = new Producto(2,"Televisor Panasonic", "Televisor QLED de 75 pulgadas",500, ctTecnologia,25);
        prCelular = new Producto(3,"iPhone","15 Pro Max",1250,ctTecnologia,15);

        //Otros Objetos de Usuario
        Usuario usAdmin, usCliente, usAdministrador;


    }
}