package OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class InventarioFisico extends GestorInventario {

    private Map<String, Integer> inventarioFisico;

    public InventarioFisico(int cantidad) {
        super(cantidad);
        this.inventarioFisico = new HashMap<>();
    }

    @Override
    public void anadirProducto(String producto, int cantidad) throws GestorInventarioException {
        if (cantidad <= 0) {
            throw new GestorInventarioException("La cantidad a añadir debe ser mayor que cero", 1001);
        }
        inventarioFisico.put(producto, inventarioFisico.getOrDefault(producto, 0) + cantidad);
        System.out.println("Añadiendo Producto " + cantidad + " unidades de " + producto + " al inventario físico.");
    }

    @Override
    public void eliminarProducto(String producto) throws GestorInventarioException {
        if (!inventarioFisico.containsKey(producto)) {
            throw new GestorInventarioException("El producto no existe en el inventario físico", 1002);
        }
        inventarioFisico.remove(producto);
        System.out.println("Eliminando Producto " + producto + " del inventario físico.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) throws GestorInventarioException {
        if (!inventarioFisico.containsKey(producto)) {
            throw new GestorInventarioException("El producto no existe en el inventario físico", 1002);
        }
        if (nuevaCantidad < 0) {
            throw new GestorInventarioException("La nueva cantidad no puede ser negativa", 1003);
        }
        inventarioFisico.put(producto, nuevaCantidad);
        System.out.println("Actualizando stock de: " + producto + " a " + nuevaCantidad + " unidades en el inventario físico.");
    }
}

