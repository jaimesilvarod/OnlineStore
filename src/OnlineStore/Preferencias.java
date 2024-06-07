package OnlineStore;

import java.util.List;
import java.util.ArrayList;

public class Preferencias {

    private List<Categoria> categoriasFavoritas;
    private String marcaFavorita;

    public Preferencias() {
        this.categoriasFavoritas = new ArrayList<>();
        this.marcaFavorita = "";
    }

    public void agregarCategoriaFavorita(Categoria categoria) {
        categoriasFavoritas.add(categoria);
        System.out.println("Se ha agregado la categoría " + categoria.getNombre() + " a las categorías favoritas");
    }

    public void eliminarCategoriaFavorita(Categoria categoria) {
        categoriasFavoritas.remove(categoria);
        System.out.println("Se ha eliminado la categoría " + categoria.getNombre() + " de las categorías favoritas");
    }

    public void setMarcaFavorita(String marca) {
        this.marcaFavorita = marca;
        System.out.println("Se ha establecido la marca " + marca + " como marca favorita");
    }

    public List<Categoria> getCategoriasFavoritas() {
        return categoriasFavoritas;
    }

    public String getMarcaFavorita() {
        return marcaFavorita;
    }
}