package UT1.ComprubaTuAprendizaje.Act7;

import java.io.File;
import java.io.IOException;

public class Ejecutor {
    public static void main(String[] args) throws IOException {
        File directorio = new File("./out/production/PSP2122/UT1");
        ProcessBuilder pb = new ProcessBuilder("java", "CompruebaTuAprendizaje.Act7.LeerCadena");

        pb.directory(directorio);

        Process p = pb.start();
    }
}
