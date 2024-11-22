package org.example;

import java.util.Scanner;

public class Matrices_Vectores {
    public void ejercicio1(){
        int vector []={1,4,5,6};
        Scanner teclado = new Scanner(System.in);

        int matriz [][]= new int[2][vector.length];

        for (int i = 0; i < vector.length; i++) {
            matriz[0][i]=vector[i];
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.print("\n");
        }

        int matriz2 [][]= new int[3][4];

//introducir valores en una matriz con vectores

        for (int i = 0; i < matriz2.length; i++) {
            System.out.println("Introduce valores de la fila ");
            String fila []= teclado.next().split(",");
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j]=Integer.parseInt(fila[j]);
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz[i][j]+ " ");

            }
            System.out.print("\n");
        }




    }
}
