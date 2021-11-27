package UT3.Ejemplos;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPservidor {
    public static void main(String[] args) throws IOException {
        byte[] bufer = new byte[1024];
        DatagramSocket socket = new DatagramSocket(12345);

        System.out.println("Espreando datagrama......");
        DatagramPacket recibo = new DatagramPacket(bufer, bufer.length);
        socket.receive(recibo);
        int bytesRec = recibo.getLength();
        String paquete = new String(recibo.getData());

        System.out.println("Número de Bytes recibidos: "+ bytesRec);
        System.out.println("Contenido del Paquete    :" + paquete.trim());
        System.out.println("Puerto origen del mensaje: "+ recibo.getPort());
        System.out.println("IP de origen    :"+ socket.getLocalPort());
        socket.close();
    }
}
