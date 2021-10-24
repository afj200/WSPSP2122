package UT2.Ejercicios.Ejercicio2_1;

public class TAC extends Thread{
    public TAC(){
        super();
    }

    @Override
    public void run() {
        try{
            for(int i =  0 ; i < 1; i--){
                System.out.println("TAC");
                sleep(10);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
