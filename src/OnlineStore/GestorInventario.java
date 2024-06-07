package OnlineStore;

public abstract class GestorInventario {

    protected int cantidad;

    public GestorInventario(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract void anadirProducto(String producto, int cantidad);

    public abstract void eliminarProducto(String producto);

    public abstract void actualizarStock(String producto, int nuevaCantidad);

}
