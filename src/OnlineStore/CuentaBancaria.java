package OnlineStore;

import java.util.Observable;

public class CuentaBancaria extends Observable{

    private double balance;

    public void agregarMonto(Double monto){
        this.balance += monto;
        setChanged();
        notifyObservers(balance);
    }

    public Double getBalance(){
        return balance;
    }

}
