package OnlineStore;

public class ProductoDigital extends Producto {

    protected String formatoArchivo;
    protected int pesoMB;


    public ProductoDigital(int id, String nombre, String descripcion, float precio, Categoria categoria, int stock, String formatoArchivo, int pesoMB) {
        super(id, nombre, descripcion, precio, categoria, stock);
        this.formatoArchivo = formatoArchivo;
        this.pesoMB = pesoMB;
    }

    public String getFormatoArchivo() {
        return "Para este producto cuya descripción es: " + getDescripcion() + "el formato de archivo disponible es: " + formatoArchivo;
    }

    public void setFormatoArchivo(String formatoArchivo) {
        this.formatoArchivo = formatoArchivo;
    }

    public int getPesoMB() {
        return pesoMB;
    }

    public void setPesoMB(int pesoMB) {
        this.pesoMB = pesoMB;
    }

    @Override
    public String getDetalles() {
        return "Producto Digital - Nombre: " + getNombre() + ", Descripción: " + getDescripcion() + ", Precio: " + getPrecio() + ", Formato: " + formatoArchivo + ", Peso: " + pesoMB + "MB";
    }

}
