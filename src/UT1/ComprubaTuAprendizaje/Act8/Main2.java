package UT1.ComprubaTuAprendizaje.Act8;

import java.io.*;

public class Main2 {
    public static void main(String[] args) throws IOException {
        //LEER CADENA DE TEXTO INTRODUCIDA POR TECLADO

        ProcessBuilder br = new ProcessBuilder("cat");
        br.redirectInput(new File("cadena.txt"));
        br.redirectOutput(new File("salidacomp8.txt"));
        br.redirectError(new File("salidaerrcopm8.txt"));

        Process p = br.start();
        //BufferedReader br = new BufferedReader(new FileReader("cadena.txt"));
        //String linea = br.readLine();
        //br.close();

    }
}