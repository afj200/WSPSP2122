package UT3.Ejercicios.Act3_7;

import UT3.Ejemplos.Persona;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPObjetoServidor {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int numeroPuero = 6000;
        ServerSocket servidor = new ServerSocket(numeroPuero);
        Socket cliente = new Socket();
        ObjectInputStream inObjeto = new ObjectInputStream(cliente.getInputStream());
        ObjectOutputStream outObjeto = new ObjectOutputStream(cliente.getOutputStream());
        int num = 1;
        while(num != 0){
            System.out.println("Esperando al cliente...");
            cliente= servidor.accept();

            Numeros nR = (Numeros) inObjeto.readObject();

            System.out.println("Recibo: "+ nR.getNumero());

            Numeros nE = new Numeros();
            nE.setNumero(nR.getNumero());
            nE.setCuadrado(nR.getNumero()*nR.getNumero());
            nE.setCubo(nR.getNumero()*nR.getNumero()*nR.getNumero());


            outObjeto.writeObject(nE);
            System.out.println("Cuadrado: " + nE.getCuadrado() + ", Cubo: "+ nE.getCubo());
        }
        outObjeto.close();
        inObjeto.close();
        cliente.close();
        servidor.close();


    }
}
