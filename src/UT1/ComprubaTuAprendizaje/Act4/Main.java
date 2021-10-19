package UT1.ComprubaTuAprendizaje.Act4;

public class Main {
    public static void main(String[] args) {
        try{
            if(args.length > 1)System.exit(1);
            //No sé realizra la siguiente condición
            //else if(args[0]);
            else if(Integer.parseInt(args[0]) < 0)System.exit(3);
            else System.exit(0);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
