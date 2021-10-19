package UT1.Ejemplo1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        ProcessBuilder pb = new ProcessBuilder("gedit");
        Process p = pb.start();
    }
}
