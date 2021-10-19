package UT1.ComprubaTuAprendizaje.Act8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //LEER CADENA DE TEXTO INTRODUCIDA POR TECLADO
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Escribe una cadena");
        String linea = br.readLine();
        br.close();
        is.close();



        if(linea.length() == 0){
            System.out.println("No has escrito la linea");
        }else{
            String invertido = new StringBuilder(linea).reverse().toString();
            if(invertido.equalsIgnoreCase(linea)){
                System.out.println("La palabra es palíndromo");
            }
        }
    }
}
