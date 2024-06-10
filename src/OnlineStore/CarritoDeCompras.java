package OnlineStore;

import java.util.List;

public class CarritoDeCompras {

    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private float total;

    public CarritoDeCompras(int id, Usuario usuario, List<Producto> productos, float total) {
        this.id = id;
        this.usuario = usuario;
        this.productos = productos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
        System.out.println("Producto agregado: " + producto.getDetalles());
    }

    public void agregarProducto(int id) {
        Producto producto = new Producto(id);
        productos.add(producto);
        total += producto.getPrecio();
        System.out.println("Producto agregado: " + producto.getDetalles());
    }

    public void agregarProducto(String Nombre, float precio) {
        Producto producto = new Producto(Nombre, precio);
        productos.add(producto);
        total += producto.getPrecio();
        System.out.println("Producto agregado: " + producto.getDetalles());
    }

    public void eliminarProducto(Producto producto) {
        if (productos.remove(producto)) {
            total -= producto.getPrecio();
            System.out.println("Producto eliminado: " + producto.getDetalles());
        } else {
            System.out.println("Producto no encontrado en el carrito.");
        }
    }

    public void actualizarCantidad(Producto producto, int nuevaCantidad) {
        // Implementar lógica para actualizar la cantidad
        // Aquí se asume que cada producto es único y no se manejan cantidades
        System.out.println("Cantidad actualizada para el producto: " + producto.getDetalles());
    }

    public void calcularTotal() {
        total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        System.out.println("Total actualizado: " + total);
    }

    public float getTotal() {
        return total;
    }

}
