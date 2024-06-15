package OnlineStore;

public abstract class SistemadePago {

    public abstract void iniciarPago() throws SistemadePagoException, PagoFallidoException;
    public abstract void verificarPago() throws SistemadePagoException, PagoFallidoException;
    public abstract void confirmarPago() throws SistemadePagoException, PagoFallidoException;

}
