package org.example;

public class OperacionesArray {
    private int[] numeros;
    int tamanyo;

    public OperacionesArray() {
        numeros = new int[tamanyo];
    }

    public void OperacionesArrays(int tamanyo) {
        numeros = new int[tamanyo];
    }

    /*public OperacionesArray(int numeros[]) {
        this.numeros = numeros;
    }*/

    public void cargar() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 9 + 1);
        }
    }

    public double media() {
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media=media+numeros[i];
        }
        media=media/ numeros.length;
        return media;
    }

    public int[] ordenar(){
        int ordenado [] = new int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            ordenado[i]=numeros[i];
        }
        return ordenado;
    }

    public int[] invertir(){
        int invertido [] = new int [numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            invertido[i]=numeros[i];
        }
        for (int i = 0; i < invertido.length; i++) {
            for (int j = 0; j < invertido.length; j++) {
                int aux = invertido[i];

            }
        }
        return invertido;
    }
}
