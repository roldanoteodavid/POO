package org.example;

public class Oveja extends Animal{
    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public boolean rentable() {
        return false;
    }
}
