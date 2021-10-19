package UT1.Act15;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        File directorio = new File("./out/production/PSP2122/UT1");
        ProcessBuilder pb = new ProcessBuilder("java", "Ejemplo3.Main");

        pb.directory(directorio);

        Process p = pb.start();

        try{
            InputStream is = p.getErrorStream();
            int c;
            while((c = is.read()) != -1){
                System.out.print((char) c);
            }
            is.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
