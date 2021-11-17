package UT3.Ejercicios.Act3_1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.println("INDICA UN NOMBRE DE MAQUINA O DIRECCION IP:");
        String ip = s.next();
        InetAddress dir = null;

        try {
            dir = InetAddress.getByName("localhost");
            pruebaMetodos(dir);
        } catch (UnknownHostException e1) {
            e1.printStackTrace();
        }



    }
    private static void pruebaMetodos (InetAddress dir){
        System.out.println("\tMetodo getByName(): " + dir);
        System.out.println("\tMetodo getHostName(): " + dir.getHostAddress());
        System.out.println("\tMetodo getHostAddress(): " + dir.getHostAddress());
        System.out.println("\tMetodo toString(): " + dir.toString());
        System.out.println("\tMetodo getCanonicalHostName(): " + dir.getCanonicalHostName());
    }
}
