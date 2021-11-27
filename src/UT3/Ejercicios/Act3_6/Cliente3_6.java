package UT3.Ejercicios.Act3_6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Cliente3_6 {
    private  static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        DatagramSocket clientSocket = new DatagramSocket();
        InetAddress IPServidor = InetAddress.getLocalHost();
        int puerto = 12345;
        String cadena = "1";

        do{
            System.out.println("Introduce mensaje:");
            cadena = sc.nextLine();
            byte[] enviados = new byte[1024];
            enviados = cadena.getBytes();

            DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);

            clientSocket.send(envio);
            byte[] recibidos = new byte[2];
            DatagramPacket recibo = new DatagramPacket(recibidos, recibidos.length);
            System.out.println("Esperando datagrama...");
            clientSocket.receive(recibo);

            byte[] hh = recibo.getData();
            int numero = hh[0];
            System.out.println("Recibo Nº de caracteres dque son a => "+numero);
        }while (!cadena.equalsIgnoreCase("*"));
        clientSocket.close();
    }
}
