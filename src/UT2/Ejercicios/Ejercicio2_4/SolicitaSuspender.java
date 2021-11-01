package UT2.Ejercicios.Ejercicio2_4;

public class SolicitaSuspender {
    private boolean suspender;

    public synchronized void set(boolean b){
        suspender = b; //cambio de estado sobre objeto
        notifyAll();
    }

    public synchronized void esperandoParaReanudar() throws InterruptedException{
        while(suspender){
            wait(); //SUSPENDER HILO HASTA RECIBIR notify() o notifiAll()
        }
    }
}
