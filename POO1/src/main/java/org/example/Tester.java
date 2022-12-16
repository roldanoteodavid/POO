package org.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //PUNTO
        Punto a = new Punto();
        System.out.println("Introduzca la coordenada x del punto a");
        double x = teclado.nextDouble();
        a.setX(x);
        System.out.println("Introduzca la coordenada y del punto a");
        double y = teclado.nextDouble();
        a.setY(y);
        System.out.println("Introduzca las coordenadas del punto b");
        Punto b = new Punto(teclado.nextDouble(), teclado.nextDouble());
        System.out.println("La distancia entre los dos punto es "+a.calcularDistanciaDesde(b));
        //CÍRCULO
        System.out.println("Introduzca la coordenada x del centro");
        double xc = teclado.nextDouble();
        System.out.println("Introduzca la coordenada y del centro");
        double yc = teclado.nextDouble();
        System.out.println("Introduzca el radio");
        double radio = teclado.nextDouble();
        Circulo cr = new Circulo(radio, xc, yc);
        System.out.println("Introduzca las coordenadas de otro punto para calcular las distancias");
        Punto c = new Punto(teclado.nextDouble(), teclado.nextDouble());
        //System.out.println("La distancia entre los dos punto es "+cr.calcularDistanciaDesdeCirculo(c, radio));
        System.out.println("El perímetro del círculo es "+cr.calcularPerimetro());
        System.out.println("El área del círculo es "+cr.calcularArea());
    }
}
