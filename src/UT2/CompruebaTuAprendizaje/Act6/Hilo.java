package UT2.CompruebaTuAprendizaje.Act6;

import java.util.Observable;
import java.util.Scanner;

public class Hilo extends Observable implements Runnable {
    private String nombre;

    public Hilo(String nombre){
        this.nombre = nombre;

    }

    @Override
    public void run() {
        int porcentaje = 0;
        int numAleatorio;
        try{
            while(porcentaje < 100){
                numAleatorio = generarPorcentajeAleatorio(1,15);
                System.out.println("Porcentaje de " + nombre +" es "+ porcentaje +" ha aumentado en "+ numAleatorio);
                porcentaje += numAleatorio;
                this.setChanged();
                this.notifyObservers();

                Thread.sleep(2000);
            }
            System.out.println(nombre + "ha ganado.");
            Thread.interrupted();
        }catch(InterruptedException e){
            System.out.println("Hilo interrumpido");
        }

    }

    public static int generarPorcentajeAleatorio(int minimo, int maximo){
        int num = (int) Math.floor(Math.random() * (maximo - minimo + 1) + (minimo));
        return num;
    }

}
