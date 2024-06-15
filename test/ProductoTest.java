import OnlineStore.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    private Producto producto;

    @BeforeEach
    public void setUp() {
        producto = new Producto(1, "Laptop", "Laptop de alta gama", 1200.0f, null, 10);
    }

    @Test
    public void testConstructorConParametros() {
        assertNotNull(producto);
        assertEquals(1, producto.getId());
        assertEquals("Laptop", producto.getNombre());
        assertEquals("Laptop de alta gama", producto.getDescripcion());
        assertEquals(1200.0f, producto.getPrecio(), 0.001);
        assertNull(producto.getCategoria());
        assertEquals(10, producto.getStock());
    }

    @Test
    public void testConstructorSoloConID() {
        Producto producto2 = new Producto(2);
        assertNotNull(producto2);
        assertEquals(10, producto2.getId());
        assertEquals("Producto sin nombre", producto2.getNombre());
        assertEquals("Producto solo con ID", producto2.getDescripcion());
        assertEquals(0.0f, producto2.getPrecio(), 0.001);
        assertNull(producto2.getCategoria());
        assertEquals(1, producto2.getStock());
    }

    @Test
    public void testConstructorConNombreYPrecio() {
        Producto producto3 = new Producto("Tablet", 500.0f);
        assertNotNull(producto3);
        assertEquals(19, producto3.getId());
        assertEquals("Tablet", producto3.getNombre());
        assertEquals("Producto con nombre y precio", producto3.getDescripcion());
        assertEquals(500.0f, producto3.getPrecio(), 0.001);
        assertNull(producto3.getCategoria());
        assertEquals(1, producto3.getStock());
    }

    @Test
    public void testSetNombre() {
        producto.setNombre("Smartphone");
        assertEquals("Smartphone", producto.getNombre());
    }

    @Test
    public void testSetDescripcion() {
        producto.setDescripcion("Smartphone de última generación");
        assertEquals("Smartphone de última generación", producto.getDescripcion());
    }

    @Test
    public void testSetPrecio() {
        producto.setPrecio(1500.0f);
        assertEquals(1500.0f, producto.getPrecio(), 0.001);
    }

    @Test
    public void testSetPrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            producto.setPrecio(-10.0f);
        });
    }

    @Test
    public void testSetStock() {
        producto.setStock(20);
        assertEquals(20, producto.getStock());
    }

    @Test
    public void testSetStockNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            producto.setStock(-5);
        });
    }

    @Test
    public void testAgregarProducto() {
        producto.agregarProducto();
        // Aquí puedes agregar verificaciones adicionales si el método hace más que imprimir
    }

    @Test
    public void testEditarProducto() {
        producto.editarProducto();
        // Aquí puedes agregar verificaciones adicionales si el método hace más que imprimir
    }

    @Test
    public void testEliminarProducto() {
        producto.eliminarProducto();
        // Aquí puedes agregar verificaciones adicionales si el método hace más que imprimir
    }

    @Test
    public void testActualizarStock() {
        producto.actualizarStock();
        // Aquí puedes agregar verificaciones adicionales si el método hace más que imprimir
    }

    @Test
    public void testGetDetalles() {
        String detalles = producto.getDetalles();
        assertEquals("Cadena de caracteres", detalles);
    }

    @Test
    public void testEntrega() {
        producto.entrega();
        // Aquí puedes agregar verificaciones adicionales si el método hace más que imprimir
    }
}
