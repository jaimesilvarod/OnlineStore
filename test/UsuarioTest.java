import OnlineStore.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testSetEmailCorreoValido() {
        Usuario usuario = new Usuario(1, "Juan", "juan@example.com", "password", "cliente");
        assertEquals("juan@example.com", usuario.getEmail());
    }

    @Test
    public void testSetEmailCorreoInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            Usuario usuario = new Usuario(2, "Ana", "correo_invalido", "password", "cliente");
        });
    }

}
