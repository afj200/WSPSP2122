package UT3.Ejemplos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MCservidor {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        MulticastSocket ms = new MulticastSocket();

        int puerto = 12345;
        InetAddress grupo = InetAddress.getByName("255.0.0.1");

        String cadena="";

        while(!cadena.trim().equals("*")){
            System.out.println("Datos a enviar al grupo: ");
            cadena = in.readLine();

            DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), grupo, puerto);
            ms.send(paquete);
        }
        ms.close();
        System.out.println("Socket cerrado...");
    }
}
