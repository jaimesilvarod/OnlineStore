package OnlineStore;

public class InventarioDigital extends GestorInventario{

    public InventarioDigital(int cantidad) {
        super(cantidad);
    }

    @Override
    public void anadirProducto(String producto, int cantidad) {
        System.out.println("Añadiendo Producto " + cantidad + " unidades de " + producto + " al inventario digital.");
    }

    @Override
    public void eliminarProducto(String producto) {
        System.out.println("Eliminando Producto " + producto + " del inventario digital.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) {
        System.out.println("Actualizando stock de: " + producto + " a " + nuevaCantidad + " unidades en el inventario digital.");
    }
}
