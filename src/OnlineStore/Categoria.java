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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
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
