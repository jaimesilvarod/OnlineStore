package OnlineStore;

public class PagoTarjetaCredito extends SistemadePago {

    @Override
    public void iniciarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al iniciar el pago con tarjeta de crédito", 4001);
        }
        System.out.println("Iniciando Pago con tarjeta de crédito");
    }

    @Override
    public void verificarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al verificar el pago con tarjeta de crédito", 4002);
        }
        System.out.println("Verificando Pago con tarjeta de crédito");
    }

    @Override
    public void confirmarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al confirmar el pago con tarjeta de crédito", 4003);
        }
        System.out.println("Pago confirmado con tarjeta de crédito");
    }

}
