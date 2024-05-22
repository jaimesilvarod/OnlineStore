package OnlineStore;

public class Producto {

    private int id;
    private String nombre;
    private String descripcion;
    private float precio;
    private Categoria categoria;
    private int stock;

    public Producto(int id, String nombre, String descripcion, float precio, Categoria categoria, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public void agregarProducto(){
        System.out.println("Producto Agregado");
    }

    public void editarProducto(){
        System.out.println("Producto Editado");
    }

    public void eliminarProducto(){
        System.out.println("Producto Eliminado");
    }

    public void actualizarStock(){
        System.out.println("Stock Actualizado");
    }

}
