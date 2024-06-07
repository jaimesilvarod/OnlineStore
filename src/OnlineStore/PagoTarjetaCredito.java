package OnlineStore;

public class PagoTarjetaCredito extends SistemadePago{


    @Override
    public void iniciarPago() {
        System.out.println("Iniciando Pago");
    }

    @Override
    public void verificarPago() {
        System.out.println("Verificando Pago");
    }

    @Override
    public void confirmarPago() {
        System.out.println("Pago confirmado");
    }
}
