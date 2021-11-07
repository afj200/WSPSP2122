package UT2.Ejemplos;

public class Cuenta {
    private int saldo;
    Cuenta(int s){ saldo = s;}
    int getSaldo(){return saldo;}
    void restar(int cantidad){
        saldo = saldo- cantidad;
    }
    synchronized void retirarDinero(int cant, String nom){
        if(getSaldo() >= cant){
            System.out.println(nom + " SE VA A RETIRER SALDO (ACTUAL ES: "+ getSaldo() + ")");

            try{
                Thread.sleep(500);
            }catch (InterruptedException ex){ }

            restar(cant);

            System.out.println("\t" +  nom + " retira => " + cant + " ACTUAL("+ getSaldo()+ ")");
        }else{
            System.out.println(nom + " No se puede retirar dinero, NO HAY SALDO (" + getSaldo() + ")");
        }
        if(getSaldo() < 0){
            System.out.println("SALDO NEGATIVO =>  "+ getSaldo());
        }
    }
}
