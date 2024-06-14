package OnlineStore;

import java.util.Map;

public class UsuarioFactory {

    public static Usuario crearProducto(String tipoUsuario, Map<String, String> parametros) {
        if(tipoUsuario.equalsIgnoreCase("Administrador")) {
            return new UsuarioAdministrador(
                    Integer.parseInt(parametros.get("id")),
                    parametros.get("nombre"),
                    parametros.get("email"),
                    parametros.get("contrasena"),
                    parametros.get("rol")
                    );
        }else if(tipoUsuario.equalsIgnoreCase("Cliente")) {
            return new UsuarioCliente(
                    Integer.parseInt(parametros.get("id")),
                    parametros.get("nombre"),
                    parametros.get("correo"),
                    parametros.get("contrasena"),
                    parametros.get("rol")
            );
        }else{
            throw new IllegalArgumentException("Tipo de usuario no válido: " + tipoUsuario);
        }


    }


}
