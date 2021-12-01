package UT3.Ejemplos;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre;
    int edad;
    public Persona(String nombre, int edad){
        super();
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(){
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
