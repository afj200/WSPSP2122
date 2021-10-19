package UT1.ComprubaTuAprendizaje.Act7;

import java.io.*;

public class LeerCadena {
    public static void main(String[] args) throws IOException {

            //LEER CADENA DE TEXTO INTRODUCIDA POR TECLADO
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String linea = "";
            while(linea != "*"){
                System.out.println("Escribe una cadena (* para acabar)");
                 linea = br.readLine();
            }
            System.out.println("Se acabó");
            br.close();
            is.close();


    }
}
