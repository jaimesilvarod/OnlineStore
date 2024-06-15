package OnlineStore;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private String rol;

    public Usuario(int id, String nombre, String email, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        setEmail(email); // Aquí se verifica el correo
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String CORREO_PERMITIDO = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]{2,})+$";
        if (elCorreoEsValido(email, CORREO_PERMITIDO)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("El formato de correo electrónico es incorrecto.");
        }
    }

    public static boolean elCorreoEsValido(String email, String CORREO_PERMITIDO) {
        Pattern pattern = Pattern.compile(CORREO_PERMITIDO);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void registrarUsuario() {
        System.out.println("Usuario Registrado");
    }

    public void iniciarSesion() {
        System.out.println("Sesión Iniciada");
    }

    public void actualizarPerfil() {
        System.out.println("Perfil Actualizado");
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada con éxito");
    }

}
