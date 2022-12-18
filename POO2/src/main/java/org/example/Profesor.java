package org.example;

public class Profesor {
    public void ponerNotas(Alumno alumno){
        alumno.getA().setNota(Math.random()*10);
        alumno.getB().setNota(Math.random()*10);
        alumno.getC().setNota(Math.random()*10);
    }
}
