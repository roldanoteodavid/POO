package org.example;

public class Gallina extends Animal{

    public Gallina(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public boolean rentable() {
        return false;
    }
}
