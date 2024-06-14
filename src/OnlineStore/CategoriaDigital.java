package OnlineStore;

public class CategoriaDigital extends Categoria{

    public CategoriaDigital(int id, String name, String descripcion) {
        super(id, name, descripcion);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Categoría Producto Digital: " + nombre + ", Descripción: " + descripcion);
    }
}
