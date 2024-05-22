package OnlineStore;

public class Usuario {

    private int id;
    private String nombre;
    private String email;
    private String contrasena;
    private String rol;

    public Usuario(int id, String nombre, String email, String contrasena, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public void registrarUsuario(){
        System.out.println("Usuario Registrado");
    }

    public void iniciarSesion(){
        System.out.println("Sesión Iniciada");
    }

    public void actualizarPerfil(){
        System.out.println("Perfil Actualizado");
    }

    public void cerrarSesion(){
        System.out.println("Sesión cerrada con éxito");
    }

}
