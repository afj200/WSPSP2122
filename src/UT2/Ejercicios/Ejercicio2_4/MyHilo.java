package UT2.Ejercicios.Ejercicio2_4;

import java.util.Scanner;

public class MyHilo extends Thread{
    private SolicitaSuspender suspender = new SolicitaSuspender();
    private int contador = 0;
    private boolean stopHilo = false;
    public void Suspende(){ suspender.set(true); }

    public void Reanuda(){ suspender.set(false); }

    public void pararHilo(){stopHilo = true;}

    @Override
    public void run() {

        Reanuda();
        try{
            while(!stopHilo){
                contador++;
                System.out.println(contador);
                Thread.sleep(5000);
                suspender.esperandoParaReanudar();
            }
            System.out.println("Fin de bucle");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public int devolverContador(){
        return contador;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rep = "";
        boolean acabado = false;
        MyHilo my = new MyHilo();
        my.start();
        while(!acabado){
            System.out.println("Indica S, R o * si quieres parar, reanudar o finalizar el hilo.");
            rep = s.next();

            if(rep.equalsIgnoreCase("S")){
                my.Suspende();
                System.out.println("Se suspende el hilo");
            }else if(rep.equalsIgnoreCase("R")){
                my.Reanuda();
                System.out.println("Se reanuda el hilo");
            }else if(rep.equalsIgnoreCase("*")){
                my.pararHilo();
                System.out.println("Se finaliza el hilo");
                acabado = true;
            }else{
                System.out.println("Escribe una acción correcta.");
            }
        }
    }
}
