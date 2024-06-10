package OnlineStore;

public class CategoriaDigital extends Categoria{

    protected String identificador;

    public CategoriaDigital(int id, String name, String descripcion) {
        super(id, name, descripcion);
        this.identificador = "D";
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría Producto Digital: " + nombre + ", Descripción: " + descripcion);
    }
}
