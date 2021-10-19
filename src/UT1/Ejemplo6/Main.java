package UT1.Ejemplo6;

import java.io.File;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder test = new ProcessBuilder();
        Map entorno = test.environment();
        System.out.println("Variables de entorno:");
        System.out.println(entorno);

        File directorio = new File("./out/production/PSP2122/UT1");
        test = new ProcessBuilder("java", "Act14.MostrarNombre", "Angel *");
        test.directory(directorio);

        //devuelve el nombre del proceso y sus argumentos
        List l = test.command();
        Iterator iter = l.iterator();
        System.out.println("Argumentos del comando:");
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        test = test.command("ls");

        try{
            Process p = test.start();
            InputStream is = p.getInputStream();

            System.out.println();
            //mostramos en pantalla caracter a caracter

            int c;
            while ((c = is.read()) != -1){
                System.out.print((char) c);
            }
            is.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
