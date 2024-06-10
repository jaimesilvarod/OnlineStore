package OnlineStore;

public class CategoriaFisico extends Categoria{

    protected String identificador;

    public CategoriaFisico(int id, String name, String descripcion) {
        super(id, name, descripcion);
        this.identificador = "F";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría Producto Digital: " + nombre + ", Descripción: " + descripcion);
    }
}
