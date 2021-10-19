package UT1.Ejemplo2;

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        Process p = new ProcessBuilder("ls", "../").start();

        try{
            InputStream is = p.getInputStream();
            int c;
            while((c = is.read()) != -1){
                System.out.print((char) c);

            }
            is.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
