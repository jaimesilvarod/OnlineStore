package OnlineStore;

public class PagoPayPal extends SistemadePago {

    @Override
    public void iniciarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al iniciar el pago con PayPal", 3001);
        }
        System.out.println("Iniciando Pago con PayPal");
    }

    @Override
    public void verificarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al verificar el pago con PayPal", 3002);
        }
        System.out.println("Verificando Pago con PayPal");
    }

    @Override
    public void confirmarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al confirmar el pago con PayPal", 3003);
        }
        System.out.println("Pago confirmado con PayPal");
    }
}
