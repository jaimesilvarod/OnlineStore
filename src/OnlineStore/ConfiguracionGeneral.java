package OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class ConfiguracionGeneral {

    private static ConfiguracionGeneral instance;
    private Map<String,String> parametrosConexionDB;
    private Map<String,String> configuracionesUI;

    private ConfiguracionGeneral() {

        parametrosConexionDB = new HashMap<>();
        parametrosConexionDB.put("host","localhost");
        parametrosConexionDB.put("database","onlineStoreDB");
        parametrosConexionDB.put("user","user-onlineStoreDB");
        parametrosConexionDB.put("password","848des");

        configuracionesUI = new HashMap<>();
        configuracionesUI.put("tema","darkSide");
        configuracionesUI.put("idioma","español");

    }

    public static ConfiguracionGeneral getInstance() {
        if (instance == null) {
            instance = new ConfiguracionGeneral();
        }
        return instance;
    }

    public Map<String, String> getParametrosConexionDB() {
        return parametrosConexionDB;
    }

    public Map<String, String> getConfiguracionesUI() {
        return configuracionesUI;
    }

    public String getParametroDB(String nombreParametro) {
        if (parametrosConexionDB.containsKey(nombreParametro)) {
            return parametrosConexionDB.get(nombreParametro);
        }else {
            return "null";
        }
    }

    public String getParametroUI(String nombreParametro) {
        if (configuracionesUI.containsKey(nombreParametro)) {
            return configuracionesUI.get(nombreParametro);
        }else{
            return "null";
        }
    }

    public String setParametrosConexionDB(String parametro, String valor) {
        if (parametrosConexionDB.containsKey(parametro)) {
            parametrosConexionDB.replace(parametro, valor);
            return "Parámetro " + parametro + " fue modificado exitosamente.";
        }else{
            return "null";
        }
    }

    public String setConfiguracionesUI(String parametro, String valor) {
        if (configuracionesUI.containsKey(parametro)) {
            configuracionesUI.replace(parametro, valor);
            return "Parámetro " + parametro + " fue modificado exitosamente.";
        }else{
            return "null";
        }
    }
}
