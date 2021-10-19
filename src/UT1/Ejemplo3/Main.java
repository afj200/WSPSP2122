package UT1.Ejemplo3;

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File directorio = new File("./out/production/PSP2122/UT1");

        ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo2.Main");

        pb.directory(directorio);

        System.out.println("Directorio de trabajo: " + pb.directory());

        Process p = pb.start();

        try{
            InputStream is = p.getInputStream();
            int c;
            while ((c = is.read()) != -1){
                System.out.print((char) c);

            }
            is.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}