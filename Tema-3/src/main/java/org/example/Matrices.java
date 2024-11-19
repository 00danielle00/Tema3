package org.example;

public class Matrices {

    public void prueba (){

        int matriz[][]=new int [3][4];

        int matriz2 [][]={{12,32,44,1},{33,2,90,56}};

        System.out.println(matriz2[0][2]);

        System.out.println("Tamaño fila "+ matriz2.length);
        System.out.println("Tamaño columna "+matriz2[0].length);

        for (int i = 0; i < matriz2.length ; i++) {//filas
            for (int j = 0; j < matriz2[i].length ; j++) {//columnas
                System.out.print(j);
            }
        }

    }
}
