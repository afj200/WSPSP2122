package UT2.CompruebaTuAprendizaje.Act4;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        Fich hilo1 = new Fich(args[0]);
        Fich hilo2 = new Fich(args[1]);
        Fich hilo3 = new Fich(args[2]);

        hilo1.start();
        hilo2.start();
        hilo3.start();




    }


}