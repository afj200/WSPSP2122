package UT2.CompruebaTuAprendizaje.Act2;



public class Main {
    HolaMundo h1 = new HolaMundo("uno");
    HolaMundo h2 = new HolaMundo("dos");
    HolaMundo h3 = new HolaMundo("tres");
    HolaMundo h4 = new HolaMundo("cuatro");
    HolaMundo h5 = new HolaMundo("cinco");

    //PRBLEMA AQUI
    Thread hilo1 = new Thread(h1);
    hilo1.start();

}
