import OnlineStore.CarritoDeCompras;
import OnlineStore.Producto;
import OnlineStore.Usuario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CarritoDeComprasTest {

    private CarritoDeCompras carrito;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    public void setUp() {
        Usuario usuario = new Usuario(1, "Juan", "juan@example.com", "password", "cliente");
        List<Producto> productos = new ArrayList<>();
        producto1 = new Producto(1, "Laptop", "Laptop de alta gama", 1200.0f, null, 10);
        producto2 = new Producto(2, "Smartphone", "Smartphone avanzado", 800.0f, null, 5);
        productos.add(producto1);
        productos.add(producto2);
        carrito = new CarritoDeCompras(1, usuario, productos, 0.0f);
    }

    @Test
    public void testAgregarProducto() {
        Producto producto3 = new Producto(3, "Tablet", "Tablet moderna", 500.0f, null, 3);
        carrito.agregarProducto(producto3);
        assertTrue(carrito.getProductos().contains(producto3));
        assertEquals(500.0f, carrito.getTotal());
    }

    @Test
    public void testEliminarProducto() {
        carrito.eliminarProducto(producto1);
        assertFalse(carrito.getProductos().contains(producto1));
        assertEquals(-1200.0f, carrito.getTotal());
    }

    @Test
    public void testCalcularTotal() {
        carrito.calcularTotal();
        assertEquals(2000.0f, carrito.getTotal());
    }

}
