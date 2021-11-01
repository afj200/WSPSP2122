package UT2.CompruebaTuAprendizaje.Act4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Fich extends Thread {
    String nombre;

    public Fich(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run() {
        try {
            FileReader fr = new FileReader(nombre);
            BufferedReader br = new BufferedReader(fr);
            String linea = br.readLine();
            int cont = 0;
            long t_comienzo, t_fin;
            t_comienzo = System.currentTimeMillis();

            while(linea != null){
                StringTokenizer tokens = new StringTokenizer(linea);
                cont = cont + tokens.countTokens();
                linea = br.readLine();
            }

            t_fin = System.currentTimeMillis();
            long t_total = t_fin - t_comienzo;
            System.out.println("El fichero "+ nombre+ " tiene "+ cont + " palabras");
            System.out.println("El proceso ha tardado:" + t_total + " miliseg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}