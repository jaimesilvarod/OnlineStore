package OnlineStore;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class InventarioObservable {

    private List<String> productos;
    private PropertyChangeSupport support;

    public InventarioObservable() {
        this.productos = new ArrayList<>();
        this.support = new PropertyChangeSupport(this);
    }

    public void agregarProducto(String producto) {
        List<String> viejosProductos = new ArrayList<>(this.productos);
        this.productos.add(producto);
        support.firePropertyChange("productos", viejosProductos, this.productos);
    }

    public void removerProducto(String producto) {
        if (this.productos.contains(producto)) {
            List<String> viejosProductos = new ArrayList<>(this.productos);
            this.productos.remove(producto);
            support.firePropertyChange("productos", viejosProductos, this.productos);
        } else {
            System.out.println("El producto no se encuentra en el inventario.");
        }
    }

    public List<String> getProductos() {
        return productos;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }
}

