package OnlineStore;

public class PagoTransferenciaBancaria extends SistemadePago {

    @Override
    public void iniciarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al iniciar el pago con transferencia bancaria", 5001);
        }
        System.out.println("Iniciando Pago con transferencia bancaria");
    }

    @Override
    public void verificarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al verificar el pago con transferencia bancaria", 5002);
        }
        System.out.println("Verificando Pago con transferencia bancaria");
    }

    @Override
    public void confirmarPago() throws PagoFallidoException {
        if (Math.random() > 0.5) {
            throw new PagoFallidoException("Error al confirmar el pago con transferencia bancaria", 5003);
        }
        System.out.println("Pago confirmado con transferencia bancaria");
    }

}
