package OnlineStore;
import java.util.ArrayList;
import java.util.List;

public class HistorialCompras {

    private List<Producto> compras;

    public HistorialCompras() {
        this.compras = new ArrayList<>();
    }

    public void agregarCompra(Producto producto) {
        compras.add(producto);
        System.out.println("Se ha agregado la compra del producto " + producto.getNombre() + " al historial");
    }

    public void mostrarHistorial() {
        if (compras.isEmpty()) {
            System.out.println("El historial de compras está vacío");
            return;
        }

        System.out.println("Historial de Compras:");
        for (Producto producto : compras) {
            System.out.println("- " + producto.getNombre() + " (" + producto.getCategoria() + ")");
        }
    }
}




