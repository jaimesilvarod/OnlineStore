package OnlineStore;

public abstract class GestorInventario {

    protected int cantidad;

    public GestorInventario(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public abstract void anadirProducto(String producto, int cantidad) throws GestorInventarioException;

    public abstract void eliminarProducto(String producto) throws GestorInventarioException;

    public abstract void actualizarStock(String producto, int nuevaCantidad) throws GestorInventarioException;
}

