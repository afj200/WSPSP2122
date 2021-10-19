package UT1.Act17;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ProcessBuilder pb = new ProcessBuilder("ls" );
        File fInp = new File("./entrada17.txt");
        File fOut = new File("./salida17.txt");
        File ferr = new File("./error17.txt");
        pb.redirectInput(fInp);
        pb.redirectOutput(fOut);
        pb.redirectError(ferr);

        pb.start();

    }
}
