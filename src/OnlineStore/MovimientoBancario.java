package OnlineStore;

import java.util.Observable;
import java.util.Observer;

public class MovimientoBancario implements Observer {

    private String tipo;
    private Double tasaCoeficiente;
    private Double totalCalculado = 0.80;

    public MovimientoBancario(String tipo, Double tasaCoeficiente){
        this.tipo = tipo;
        this.tasaCoeficiente = tasaCoeficiente;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTasaCoeficiente() {
        return tasaCoeficiente;
    }

    public void setTasaCoeficiente(Double tasaCoeficiente) {
        this.tasaCoeficiente = tasaCoeficiente;
    }

    public Double getTotalCalculado() {
        return totalCalculado;
    }

    public void setTotalCalculado(Double totalCalculado) {
        this.totalCalculado = totalCalculado;
    }

    @Override
    public void update(Observable o, Object valor){
        this.totalCalculado = ((Double)valor) * tasaCoeficiente;
    }

    @Override
    public String toString(){
        return "Movimiento Bancario{" +
        "tipo: " + tipo + "\n" +
        ", tasaCoeficiente: " + tasaCoeficiente + "\n" +
        ", total calculado: " + totalCalculado + "\n" +
        '}';
    }

}
