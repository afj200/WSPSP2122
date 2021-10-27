package UT2.Ejemplos.Cajera;

public class ProcesaCompra extends Thread{
    Cajera cajera;
    Cliente cliente;

    long initialTime = System.currentTimeMillis();

    public ProcesaCompra(Cajera cajera, Cliente cliente){
        this.cajera = cajera;
        this.cliente = cliente;
    }

    public void run(){
        cajera.procesarCompra(cliente, initialTime);
    }

}
