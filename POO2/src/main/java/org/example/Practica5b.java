package org.example;

public class Practica5b {
    public static void main(String[] args) {
        Asignatura programacion = new Asignatura(1);
        Asignatura entornos = new Asignatura(2);
        Asignatura marcas = new Asignatura(3);
        Alumno juan = new Alumno(programacion, entornos, marcas);
        Profesor antonio = new Profesor();
        antonio.ponerNotas(juan);
        System.out.printf("La nota de programación es "+ programacion.getNota()+", la nota de entornos es "+entornos.getNota()+" y la nota de lenguaje de marcas es "+marcas.getNota());
        double media = (programacion.getNota()+ entornos.getNota()+ marcas.getNota())/3;
        System.out.println("\nLa media del alumno es "+media);
    }
}
