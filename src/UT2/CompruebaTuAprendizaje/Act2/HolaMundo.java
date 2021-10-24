package UT2.CompruebaTuAprendizaje.Act2;

public class HolaMundo implements Runnable{
    String cadena;
    public HolaMundo(String cadena){
        this.cadena = cadena;
   }

    @Override
    public void run() {
        System.out.println("Hola Mundo "+ this.cadena +" ID: " +Thread.currentThread().getId());
    }
}
