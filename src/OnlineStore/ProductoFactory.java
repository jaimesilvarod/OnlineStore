package OnlineStore;

import java.util.Map;

public class ProductoFactory {

    public static Producto crearProducto(String tipoProducto, Map<String, String> parametros) {
        if(tipoProducto.equalsIgnoreCase("Digital")) {
            return new ProductoDigital(
                    Integer.parseInt(parametros.get("id")),
                    parametros.get("Nombre"),
                    Float.parseFloat(parametros.get("precio"))
                    );
        }else if(tipoProducto.equalsIgnoreCase("Físico")) {
            return new ProductoFisico(
                    Integer.parseInt(parametros.get("id")),
                    parametros.get("nombre"),
                    Float.parseFloat(parametros.get("precio"))
            );
        }else{
            throw new IllegalArgumentException("Tipo de producto no válido: " + tipoProducto);
        }


    }


}
