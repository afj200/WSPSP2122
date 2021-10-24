package UT2.Ejemplos;

public class PrimerHilo extends Thread{
    private int x;
    PrimerHilo (int x){
        this.x = x;
    }

    public void run() {
        for(int i = 0; i < x; i++){
            System.out.println("En el Hilo..."+ i);
        }
    }
}
