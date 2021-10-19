package UT1.ComprubaTuAprendizaje.Act5;

public class Main {
    public static void main(String[] args) {
        try{
            String p = args[0];
            for(int i = 0; i < 5; i++){
                System.out.println(p);
            }
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("No se ha indicado el parametro de entrada");
            System.exit(1);
        }


    }
}
