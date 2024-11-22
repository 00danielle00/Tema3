package org.example;

import java.util.Random;
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
        bucle1:
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == buscar) {
                    System.out.println("Número encontrado en la posición: [" + i + "][" + j + "]");
                    break bucle1;
                }
            }
        }

    }
    public void ejercicio2(){
        Random aleatorio = new Random();

        int matriz [][]= new int[3][3];

        //hacemos random
        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                matriz[i][j]=aleatorio.nextInt(10);
            }
        }
        //lo imprimimos

        System.out.println("Matriz aleatoria: ");

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.print("\n");
        }

        //sumamos filas
        System.out.println("Suma de filas:");
        for (int i = 0; i < matriz.length; i++) {
            int suma = 0;
            for (int j = 0; j <matriz[i].length ; j++) {
                suma+=matriz[i][j];

            }
            System.out.println("suma fila "+(i+1)+":"+suma);
        }
        System.out.print("\n");
        //sumamos columnas
        System.out.println("Suma de columnas:");
        for (int i = 0; i < matriz[0].length; i++) {
            int suma2 = 0;
            for (int j = 0; j <matriz.length ; j++) {
                suma2+=matriz[i][j];
            }
            System.out.println("suma columna "+(i+1)+":"+suma2);
        }
    }
}
