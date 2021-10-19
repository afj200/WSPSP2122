package UT1.ComprubaTuAprendizaje.Act6;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            //LEER CADENA DE TEXTO INTRODUCIDA POR TECLADO
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            String linea = br.readLine();
            br.close();
            is.close();
            //ESCRIBIR EN UN FICHERO
            File fich = new File("cadenaCompAct6.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(fich));
            bw.write(linea);
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
