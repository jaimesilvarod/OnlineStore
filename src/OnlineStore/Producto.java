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

    public Producto(int id){
        this.nombre = "Producto sin nombre";
        this.descripcion = "Producto sin descripción";
        this.precio = 00.00f;
        this.categoria = setId(10);
        this.stock = 1;
    }

    public int getId() {
        return id;
    }

    public Categoria setId(int id) {
        this.id = id;
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
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

    public abstract String getDetalles(){
        this.nombre = nombre;
        return null;
    }

}
