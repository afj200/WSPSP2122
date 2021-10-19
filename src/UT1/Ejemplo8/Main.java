package UT1.Ejemplo8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("bash");
        File fBat = new File("./script.sh");

        pb.redirectInput(fBat);
        pb.start();
    }
}
