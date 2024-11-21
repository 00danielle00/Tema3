package org.example;

import java.util.Scanner;

public class Ejercicios_Matrices {
    public void ejercicio1(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta los numeros en la matriz : ");
        int matriz[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("Qué numero quieres buscar: ");
        int buscar = teclado.nextInt();
        

    }
}
