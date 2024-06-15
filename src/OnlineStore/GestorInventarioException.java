package OnlineStore;

public class GestorInventarioException extends Exception {
    private int codigoError;

    public GestorInventarioException(String mensaje) {
        super(mensaje);
    }

    public GestorInventarioException(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public int getCodigoError() {
        return codigoError;
    }
}


