package OnlineStore;

public class SistemadePagoException extends Exception {
    private int codigoError;

    public SistemadePagoException(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public int getCodigoError() {
        return codigoError;
    }
}
