package OnlineStore;

public class UsuarioAdministrador extends Usuario {

        private String tipoAcceso; //Bajo, Moderado, Completo

        public UsuarioAdministrador(int idUsuario, String nombre, String correoElectronico, String contrasena, String rol, String tipoAcceso) {
            super(idUsuario, nombre, correoElectronico, contrasena, rol);
            this.tipoAcceso = tipoAcceso;
        }

        public String getTipoAcceso(){
            return tipoAcceso;
        }

        public void gestionarInventario(Producto producto) {
            // Implementar la lógica para gestionar el inventario
            System.out.println("El administrador " + getNombre() + " ha gestionado el producto " + producto.getNombre());
        }

        public void establecerPromocion(Producto producto, float descuento) {
            // Implementar la lógica para establecer una promoción
            System.out.println("El administrador " + getNombre() + " ha establecido una promoción para el producto " + producto.getNombre() + " con un descuento del " + descuento + "%");
        }
}

