package UT1.ComprubaTuAprendizaje.Act5;

import java.io.*;

public class EjecutarCadena {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String text;
        try{
            System.out.println("Introduce una cadena...");
            text = br.readLine();
            System.out.println("Cadena escrita:" + text);
            is.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        File directorio = new File("./out/production/PSP2122/UT1");
        ProcessBuilder pb = new ProcessBuilder("java", "CompruebaTuAprendizaje.Act5.Main");

        pb.directory(directorio);

        pb.start();

    }
}
