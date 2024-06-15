package OnlineStore;

public class GestorInventarioImpl extends GestorInventario {

    public GestorInventarioImpl(int cantidad) {
        super(cantidad);
    }

    @Override
    public void anadirProducto(String producto, int cantidad) throws GestorInventarioException {
        if (cantidad > 0) {
            // Lógica para añadir el producto
            this.cantidad += cantidad;
        } else {
            throw new GestorInventarioException("La cantidad debe ser mayor que cero.");
        }
    }

    @Override
    public void eliminarProducto(String producto) throws GestorInventarioException {
        // Lógica para eliminar el producto
        if (this.cantidad > 0) {
            this.cantidad--;
        } else {
            throw new GestorInventarioException("No hay productos para eliminar.");
        }
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) throws GestorInventarioException {
        if (nuevaCantidad >= 0) {
            // Lógica para actualizar el stock
            this.cantidad = nuevaCantidad;
        } else {
            throw new GestorInventarioException("La nueva cantidad no puede ser negativa.");
        }
    }
}

