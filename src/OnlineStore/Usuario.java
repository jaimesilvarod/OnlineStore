package OnlineStore;

public class Usuario {

    protected int id;
    protected String nombre;
    protected String email;
    protected String contrasena;
    protected String rol;

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
