package UT1.Act14;

public class MostrarNombre {

    public static void main(String[] args) {
        int i = 0;
        while(!args[i].equals("*")){
            System.out.println(args[i]);
            i++;
        }
    }
}
