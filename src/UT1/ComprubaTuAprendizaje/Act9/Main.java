package UT1.ComprubaTuAprendizaje.Act9;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //LEER CADENA DE TEXTO INTRODUCIDA POR TECLADO

        BufferedReader br = new BufferedReader(new FileReader("cadena.txt"));
        String linea = "";
        linea = br.readLine();
        while(linea != "*"){
            linea = br.readLine();
        }
        System.out.println("Se acabó");
        br.close();

    }
}
