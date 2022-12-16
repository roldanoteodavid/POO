package org.example;

public class Circulo {
    private double radio;
    private Punto centro;
    public Circulo(){
        radio = 1;
        centro = new Punto();
    }
    public Circulo(double radio, double x, double y){
        this.radio = radio;
        centro = new Punto(x,y);
    }

    public double getRadio() {
        return radio;
    }

    public Punto getCentro() {
        return centro;
    }

    /*public double calcularDistanciaDesdeCirculo (Punto c, double radio){
        return (Math.sqrt (Math.pow(c.x-x,2) + Math.pow(cr.y-y,2)))-radio;
    }*/

    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * radio * Math.PI;
        return perimetro;
    }

    public double calcularArea(){
        double area;
        area = Math.PI * Math.pow(radio,2);
        return area;
    }
}
