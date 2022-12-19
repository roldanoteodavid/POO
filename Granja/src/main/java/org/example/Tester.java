package org.example;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca cuantos animales tiene la granja.");
        Animal[] animales = new Animal[teclado.nextInt()];
        int cont=0;
        do {
            System.out.println("Introduzca 1 si el animal es una gallina, 2 si es una vaca y 3 si es una oveja");
            int tipo = teclado.nextInt();
            switch (tipo){
                case 1:

                    cont++;
                    break;
                case 2:
                    cont++;
                    break;
                case 3:
                    cont++;
                    break;
                default:
                    System.out.println("Introduzca un animal válido");
            }
        }while (cont<animales.length);
    }
}
