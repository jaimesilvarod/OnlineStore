package OnlineStore;

public abstract class Categoria {

    protected int id;
    protected String nombre;
    protected String descripcion;

    public Categoria(int id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract void mostrarDetalles();

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
