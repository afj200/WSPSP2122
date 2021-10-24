package UT1.Ejemplo4;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        Process p = new ProcessBuilder("date").start();

        OutputStream os = p.getOutputStream();
        os.write("10211748".getBytes());
        os.flush();

        InputStream is = p.getInputStream();
        int c;
        while((c = is.read()) != -1){
            System.out.println((char) c);
        }
        is.close();

        int exitVal;
        try{
            exitVal = p.waitFor();
            System.out.println("Valor de salida: " + exitVal);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
