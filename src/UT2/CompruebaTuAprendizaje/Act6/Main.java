package UT2.CompruebaTuAprendizaje.Act6;

import java.util.Scanner;

public class Main {
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

        Thread th1 = new Thread(hilo1);
        th1.setPriority(th1P);

        Thread th2 = new Thread(hilo2);
        th2.setPriority(th2P);

        Thread th3 = new Thread(hilo3);
        th3.setPriority(th3P);


        th1.start();
        th2.start();
        th3.start();

        if(th1.isInterrupted() || th2.isInterrupted() || th3.isInterrupted()){
            terminar(th1, th2, th3);
        }
    }

    public static void terminar(Thread t1 , Thread t2 , Thread t3){
            t1.interrupt();
            t2.interrupt();
            t3.interrupt();
    }
}
