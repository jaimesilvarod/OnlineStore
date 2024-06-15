package OnlineStore;

public class PagoFallidoException extends Exception {
    private int codigoError;

    public PagoFallidoException(String mensaje, int codigoError) {
        super(mensaje);
        this.codigoError = codigoError;
    }

    public int getCodigoError() {
        return codigoError;
    }
}

