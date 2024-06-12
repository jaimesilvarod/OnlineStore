package OnlineStore;

public class ProductoFisico extends Producto{

    protected float altoCM;
    protected float largoCM;
    protected float anchoCM;
    protected float pesoKG;

    public ProductoFisico(int id, String nombre, String descripcion, float precio, Categoria categoria, int stock, float altoCM, float largoCM, float anchoCM, float pesoKG) {
        super(id, nombre, descripcion, precio, categoria, stock);
        this.altoCM = altoCM;
        this.largoCM = largoCM;
        this.anchoCM = anchoCM;
        this.pesoKG = pesoKG;
    }

    public ProductoFisico(int id) {
        super(id);
        this.altoCM = 0;
        this.largoCM = 0;
        this.anchoCM = 0;
        this.pesoKG = 0;
    }

    public ProductoFisico(int id, String nombre, float precio) {
        super(id, nombre, precio);
        this.altoCM = 0;
        this.largoCM = 0;
        this.anchoCM = 0;
        this.pesoKG = 0;
    }


    public float getAltoCM() {
        return altoCM;
    }

    public void setAltoCM(float altoCM) {
        this.altoCM = altoCM;
    }

    public float getLargoCM() {
        return largoCM;
    }

    public void setLargoCM(float largoCM) {
        this.largoCM = largoCM;
    }

    public float getAnchoCM() {
        return anchoCM;
    }

    public void setAnchoCM(float anchoCM) {
        this.anchoCM = anchoCM;
    }

    public float getPesoKG() {
        return pesoKG;
    }

    public void setPesoKG(float pesoKG) {
        this.pesoKG = pesoKG;
    }

    @Override
    public String getDetalles() {
        return "Producto Físico - Nombre: " + getNombre() + ", Descripción: " + getDescripcion() + ", Precio: " + getPrecio() + ", Dimensiones: " + altoCM + "x" + largoCM + "x" + anchoCM + "cm, Peso: " + pesoKG + "kg";
    }

    @Override
    public void entrega(){
        System.out.println("Entrega Física");
    }
}
