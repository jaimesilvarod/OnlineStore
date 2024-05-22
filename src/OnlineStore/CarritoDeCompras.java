package OnlineStore;

import java.util.List;

public class CarritoDeCompras {

    private int id;
    private Usuario usuario;
    private List<Producto> productos;
    private float total;

    public CarritoDeCompras(int id, Usuario usuario, List<Producto> productos, float total) {
        this.id = id;
        this.usuario = usuario;
        this.productos = productos;
        this.total = total;
    }

    public void agregarProducto(){

    }

    public void eliminarProducto(){

    }

    public void actualizarCantidad(){

    }

    public void calcularTotal(){

    }

}
