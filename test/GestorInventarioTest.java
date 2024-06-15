import OnlineStore.GestorInventarioException;
import OnlineStore.GestorInventarioImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class GestorInventarioTest {

    @Test
    public void testAnadirProducto() {
        GestorInventarioImpl gestor = new GestorInventarioImpl(300);
        assertThrows(GestorInventarioException.class, () -> {
            gestor.anadirProducto("Producto1", -120);
        });
    }

    @Test
    public void testEliminarProducto() {
        GestorInventarioImpl gestor = new GestorInventarioImpl(-10);
        assertThrows(GestorInventarioException.class, () -> {
            gestor.eliminarProducto("Producto2");
        });
    }

    @Test
    public void testActualizarStock() {
        GestorInventarioImpl gestor = new GestorInventarioImpl(100);
        assertThrows(GestorInventarioException.class, () -> {
            gestor.actualizarStock("Producto3", -150);
        });
    }
}
