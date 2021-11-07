package UT2.Ejemplos;

public class HiloA extends Thread{
    private  Contador contador;
    public HiloA(String n, Contador c){
        setName(n);
        contador = c;
    }

    @Override
    public void run() {
        synchronized (contador){
            for(int j = 0; j < 300; j++){
                contador.incrementa();
                try{
                    sleep(100);
                }catch(InterruptedException e){}
            }
            System.out.println(getName() + " contador vale "+ contador.valor());
        }

    }
}
