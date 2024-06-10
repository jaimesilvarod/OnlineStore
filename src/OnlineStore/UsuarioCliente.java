package OnlineStore;

class UsuarioCliente extends Usuario {

    private HistorialCompras historialCompras;
    private Preferencias preferencias;

    public UsuarioCliente(int idUsuario, String nombre, String correoElectronico, String contrasena, String rol) {
        super(idUsuario, nombre, correoElectronico, contrasena, rol);
        this.historialCompras = new HistorialCompras();
        this.preferencias = new Preferencias();
    }

    public void realizarCompra(Producto producto) {
        // Implementar la lógica para realizar la compra
        System.out.println("El cliente " + getNombre() + " ha comprado el producto " + producto.getNombre());
        historialCompras.agregarCompra(producto);
    }

    public void verHistorialCompras() {
        historialCompras.mostrarHistorial();
    }

    public void editarPreferencias(Preferencias preferencias) {
        this.preferencias = preferencias;
    }

    public Preferencias obtenerPreferencias() {
        return preferencias;
    }
}
