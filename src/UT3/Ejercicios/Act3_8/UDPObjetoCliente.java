package UT3.Ejercicios.Act3_8;

import UT3.Ejercicios.Act3_7.Numeros;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPObjetoCliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner s = new Scanner(System.in);
        InetAddress IPServidor = InetAddress.getLocalHost();
        int puerto = 12345;
        int num = 1;
        DatagramSocket Socket = new DatagramSocket();
        System.out.println("PROGRAMA CLIENTE INICIADO....");
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bs);
        while(num != 0){
            //ENVIAR
            System.out.println("Introduce un número:");
            num = s.nextInt();

            Numeros n = new Numeros();
            n.setNumero(num);

            out.reset();
            out.writeObject(n);
            byte[] enviados = bs.toByteArray();
            DatagramPacket paqEnviar = new DatagramPacket(enviados, enviados.length);
            Socket.send(paqEnviar);
            System.out.println("Envio: "+ n.getNumero());

            //RECIBIR
            byte[] recibidos = new byte[1024];
            DatagramPacket paqRecibido = new DatagramPacket(recibidos, recibidos.length);
            Socket.receive(paqRecibido);
            ByteArrayInputStream bais = new ByteArrayInputStream(recibidos);
            ObjectInputStream in = new ObjectInputStream(bais);
            Numeros nR = (Numeros) in.readObject();

            System.out.println("Cuadrado: "+ nR.getCuadrado()+", Cubo: "+nR.getCubo());

            in.close();
            bais.close();
        }
        out.close();

    }
}
