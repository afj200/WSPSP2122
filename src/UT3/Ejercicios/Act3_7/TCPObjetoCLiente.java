package UT3.Ejercicios.Act3_7;

import UT3.Ejemplos.Persona;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class TCPObjetoCLiente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        String host = "localhost";
        int puerto = 6000;

        System.out.println("PROGRAMA CLIENTE INICIADO....");
        Socket cliente = new Socket(host, puerto);
        int num = 1;
        ObjectOutputStream perSal = new ObjectOutputStream(cliente.getOutputStream());
        ObjectInputStream perEnt = new ObjectInputStream(cliente.getInputStream());
        while(num != 0){
            //CREACIÓN DEL OBJETO
            System.out.println("Introduce un número:");
            num = s.nextInt();

            Numeros n = new Numeros();
            n.setNumero(num);

            //ENVÍO DEL OBJETO
            perSal.writeObject(n);
            System.out.println("Envio: "+ n.getNumero());

            //RECIBO DEL OBJETO
            Numeros nR = (Numeros) perEnt.readObject();
            System.out.println("Cuadrado: "+ nR.getCuadrado() + ", Cubo: "+ nR.getCubo());

        }
        perSal.close();
        perEnt.close();

        cliente.close();






    }
}
