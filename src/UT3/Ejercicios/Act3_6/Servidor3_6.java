package UT3.Ejercicios.Act3_6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Locale;

public class Servidor3_6 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        System.out.println("Servidor Esperando Datagrama...");
        DatagramPacket recibo;
        byte[] bufer = new byte[1024];
        recibo = new DatagramPacket(bufer, bufer.length);
        socket.receive(recibo);

        String mensaje = new String(recibo.getData()).trim();
        System.out.println("Servidor Recibe:" + mensaje);
        InetAddress IPOrigen = recibo.getAddress();
        int puerto = recibo.getLength();

        mensaje.toUpperCase(Locale.ROOT);

        System.out.println("Enviando mensaje en mayusulas=> "+ mensaje);
        byte[] b = mensaje.getBytes();
        byte[] enviados = new byte[1024];

        for(int i = 0; i < b.length; i++){
            enviados[0] += b[i];
        }

        DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
        socket.send(envio);

        System.out.println("Cerrando coneión...");
        socket.close();
    }
}
