package UT2.CompruebaTuAprendizaje.Act1;

public class HolaMundo extends Thread{
    public HolaMundo(){
        super();
    }

    @Override
    public void run() {
        System.out.println("Hola Mundo, ID:" + Thread.currentThread().getId());
    }
}
