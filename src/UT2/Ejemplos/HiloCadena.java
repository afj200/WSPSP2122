package UT2.Ejemplos;

public class HiloCadena extends Thread{
    private ObjetoCompartido objeto;
    String cad;

    public HiloCadena(ObjetoCompartido c, String s){
        this.objeto = c;
        this.cad=s;
    }

    @Override
    public void run() {
        synchronized (objeto){
            for(int j = 0; j  < 10; j++){
                objeto.PintaCadena(cad);
            }
        }

    }
}
