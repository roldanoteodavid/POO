package org.example;

import java.util.Scanner;

public class OperacionesArrayTester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cuantos número quiere que tenga el array.");
        int tamanyo = teclado.nextInt();
        OperacionesArray op = new OperacionesArray();
        op.cargar();
        System.out.println(op.media());
        for (int i = 0; i < ; i++) {

        }
    }
}