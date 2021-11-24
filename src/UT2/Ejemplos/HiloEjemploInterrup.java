package UT2.Ejemplos;

public class HiloEjemploInterrup extends Thread{
    @Override
    public void run() {
        try{
            while(!isInterrupted()){
                System.out.println("En el hilo");
                Thread.sleep(10);
            }
        }catch (InterruptedException e){
            System.out.println("Ha ocurrido una excepcion");
        }
        System.out.println("FIN HILO");
    }
    public void interrumpir(){
        interrupt();
    }

    public static void main(String[] args) {
        HiloEjemploInterrup h = new HiloEjemploInterrup();
        h.start();
        for(int i = 0; i < 1000000000; i++);
        h.interrumpir();
    }
}
