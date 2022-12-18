package org.example;

public class Triangulo {
    private Punto a;
    private Punto b;
    private Punto c;

    public Triangulo(){
        a = new Punto();
        b = new Punto();
        c = new Punto();
    }

    public Triangulo(double ax, double ay, double bx, double by, double cx, double cy){
        a = new Punto(ax, ay);
        b = new Punto(bx, by);
        c = new Punto(cx, cy);
    }

    public Punto getA() {
        return a;
    }

    public Punto getB() {
        return b;
    }

    public Punto getC() {
        return c;
    }

    public double calcularDistanciaDesde(Punto v){
        return a.calcularDistanciaDesde(v);
    }

    public double calcularArea (){
        double area;
        double ladoab = Math.sqrt (Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2));
        double ladoac = Math.sqrt (Math.pow(a.x-c.x,2) + Math.pow(a.y-c.y,2));
        double ladobc = Math.sqrt (Math.pow(b.x-c.x,2) + Math.pow(b.y-c.y,2));
        double semi = (ladoab + ladoac + ladobc)/2;
        area = Math.sqrt(semi*(semi-ladoab)*(semi-ladoac)*(semi-ladobc));
        return area;
    }

    public double calcularPerimetro(){
        double perimetro;
        double ladoab = Math.sqrt (Math.pow(a.x-b.x,2) + Math.pow(a.y-b.y,2));
        double ladoac = Math.sqrt (Math.pow(a.x-c.x,2) + Math.pow(a.y-c.y,2));
        double ladobc = Math.sqrt (Math.pow(b.x-c.x,2) + Math.pow(b.y-c.y,2));
        perimetro = (ladoab + ladoac + ladobc);
        return perimetro;
    }
}
