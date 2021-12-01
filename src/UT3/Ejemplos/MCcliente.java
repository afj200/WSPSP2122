package UT3.Ejemplos;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MCcliente {
    public static void main(String[] args) throws Exception{
        int puerto = 12345;

        MulticastSocket ms = new MulticastSocket(puerto);

        InetAddress grupo = InetAddress.getByName("255.0.0.1");

        ms.joinGroup(grupo);

        String msg = "";

        while(!msg.trim().equals("*")){
            byte[] buf = new byte[1000];
            DatagramPacket paquete = new DatagramPacket(buf, buf.length);
            ms.receive(paquete);

            msg = new String(paquete.getData());

            System.out.println("Recibo: "+msg.trim());
        }
        ms.leaveGroup(grupo);
        ms.close();
        System.out.println("Socket cerrado...");
    }
}
