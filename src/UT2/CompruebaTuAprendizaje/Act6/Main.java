package UT2.CompruebaTuAprendizaje.Act6;

import java.util.Scanner;

public class Main {
    private static Thread th1;
    private static Thread th2;
    private static Thread th3;
    public static void main(String[] args) {
        //PREGUNTAR POR PRIORIDADES
        Scanner s = new Scanner(System.in);

        System.out.println("Indica prioridad para hilo 1");
        int th1P = s.nextInt();
        System.out.println("Indica prioridad para hilo 2");
        int th2P = s.nextInt();
        System.out.println("Indica prioridad para hilo 3");
        int th3P = s.nextInt();

        Hilo hilo1 = new Hilo("Hilo 1");
        Hilo hilo2 = new Hilo("Hilo 2");
        Hilo hilo3 = new Hilo("Hilo 3");

        th1 = new Thread(hilo1);
        th1.setPriority(th1P);

        th2 = new Thread(hilo2);
        th2.setPriority(th2P);

        th3 = new Thread(hilo3);
        th3.setPriority(th3P);


        th1.start();
        th2.start();
        th3.start();


    }

    public static void terminar(){
            th1.interrupt();
            th2.interrupt();
            th3.interrupt();
    }
}
