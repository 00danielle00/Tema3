package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sopa {
    public void practica3(){
        Scanner teclado = new Scanner(System.in);
        int m =0;
        int n=0;

        try {
            System.out.println("Introduce el número de filas:");

             m = teclado.nextInt();

            System.out.println("Introduce el número de columnas:");

             n = teclado.nextInt();
            String matriz [][] = new String[m][n];

        }catch (InputMismatchException err){
            System.out.println("Error: lod datos introducidos no son correctos :(");
            return;
        }
        String matriz [][] = new String[m][n];

        // rellenar la fila

        for (int i = 0; i < m; i++) {
            System.out.println("Introduce las letras de la fila "+(i+1));
            String fila = teclado.next();
            if (fila.length() != n ){
                System.out.println("Error: Introduce datos válidos: "+n+"letras");
                return;
            }

        }

        //imprimimos

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }






    }
}
