package org.example;

public class Practica5b {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura entornos = new Asignatura(2);
        Asignatura marcas = new Asignatura(3);
        Alumno juan = new Alumno(programacion, entornos, marcas);
        Profesor antonio = new Profesor();
        antonio.ponerNotas(juan);
        System.out.println("La nota de programación es "+ programacion.getNota()+", la nota de entornos es "+entornos.getNota()+" y la nota de lenguaje de marcas es "+marcas.getNota());
        System.out.println("La media del alumno es "+antonio.calcularMedia(juan));
    }
}
