package UT2.Ejercicios.Ejercicio2_1;

public class TIC extends Thread{
    public TIC(){
        super();
    }

    @Override
    public void run() {
        try{
            for(int i =  0 ; i < 1; i--){
                System.out.println("TIC");
                sleep(10);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
