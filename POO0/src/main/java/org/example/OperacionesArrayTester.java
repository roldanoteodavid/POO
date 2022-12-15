package org.example;

import java.util.Scanner;

public class OperacionesArrayTester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        OperacionesArray op = new OperacionesArray();
        System.out.println("Introduzca cuantos número quiere que tenga el array.");
        op.tamanyo = teclado.nextInt();
        op.OperacionesArrays(op.tamanyo);
        op.cargar();
        System.out.println(op.media());

    }
}