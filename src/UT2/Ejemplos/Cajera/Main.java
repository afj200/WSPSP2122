package UT2.Ejemplos.Cajera;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cliente 1", new int[] {2,2,1,5,2,3});
        Cliente cliente2 = new Cliente("Cliente 2", new int[] {1,3,5,1,1});

        Cajera cajera1 = new Cajera("Cajera 1");
        Cajera cajera2 = new Cajera("Cajera 2");

        //long initialTime = System.currentTimeMillis();

        //cajera1.procesarCompra(cliente, initialTime);
        //cajera2.procesarCompra(cliente2, initialTime);

        ProcesaCompra hilo1 = new ProcesaCompra(cajera1, cliente);
        ProcesaCompra hilo2 = new ProcesaCompra(cajera2, cliente2);

        hilo1.start();
        hilo2.start();



        //RESULTADOS SIN HILOS: CLIENTE 1: 15 SEG     CLIENTE 2: 26SEG(16SEG)

        //RESULTADOS CON HILOS: CLIENTE 1: 11 SEG   CLIENTE 2; 15SEG(4SEG)
    }
}
