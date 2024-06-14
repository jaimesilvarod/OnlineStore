package OnlineStore;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class MovimientoInventario implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("productos".equals(evt.getPropertyName())) {
            System.out.println("El inventario ha cambiado.");
            System.out.println("Productos anteriores: " + evt.getOldValue());
            System.out.println("Productos actuales: " + evt.getNewValue());
        }
    }
}

