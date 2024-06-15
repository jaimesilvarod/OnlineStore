package OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class InventarioDigital extends GestorInventario {

    private Map<String, Integer> inventarioDigital;

    public InventarioDigital(int cantidad) {
        super(cantidad);
        this.inventarioDigital = new HashMap<>();
    }

    @Override
    public void anadirProducto(String producto, int cantidad) throws GestorInventarioException {
        if (cantidad <= 0) {
            throw new GestorInventarioException("La cantidad a añadir debe ser mayor que cero", 1001);
        }
        inventarioDigital.put(producto, inventarioDigital.getOrDefault(producto, 0) + cantidad);
        System.out.println("Añadiendo Producto " + cantidad + " unidades de " + producto + " al inventario digital.");
    }

    @Override
    public void eliminarProducto(String producto) throws GestorInventarioException {
        if (!inventarioDigital.containsKey(producto)) {
            throw new GestorInventarioException("El producto no existe en el inventario digital", 1002);
        }
        inventarioDigital.remove(producto);
        System.out.println("Eliminando Producto " + producto + " del inventario digital.");
    }

    @Override
    public void actualizarStock(String producto, int nuevaCantidad) throws GestorInventarioException {
        if (!inventarioDigital.containsKey(producto)) {
            throw new GestorInventarioException("El producto no existe en el inventario digital", 1002);
        }
        if (nuevaCantidad < 0) {
            throw new GestorInventarioException("La nueva cantidad no puede ser negativa", 1003);
        }
        inventarioDigital.put(producto, nuevaCantidad);
        System.out.println("Actualizando stock de: " + producto + " a " + nuevaCantidad + " unidades en el inventario digital.");
    }
}

