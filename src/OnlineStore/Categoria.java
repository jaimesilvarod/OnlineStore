package OnlineStore;

public class Categoria {

    private int id;
    private String name;
    private String descripcion;

    public Categoria(int id, String name, String descripcion) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
    }

    public void agregarCategoria(){
        System.out.println("Categoría Agregada");
    }

    public void editarCategoria(){
        System.out.println("Categoría Editada");
    }

    public void eliminarCategoria(){
        System.out.println("Categoría Eliminada");
    }

}
