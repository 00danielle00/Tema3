package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sopa {
    public void practica3(){
        Scanner teclado = new Scanner(System.in);
        int m =0; //inicializo las variables fuera
        int n=0;

        try {//aplico un try-catch en caso de introducir una cadena en vez de un int
            System.out.println("Introduce el número de filas:");

             m = teclado.nextInt();

            System.out.println("Introduce el número de columnas:");

             n = teclado.nextInt();


        }catch (InputMismatchException err){
            System.out.println("Error: los datos introducidos no son correctos");
            return;
        }
        // creo una matriz con los valores introducidos anteriormente introducidos por el usuario.
        String matriz [][] = new String[m][n];

        // hago 2 bucles que sirven para rellena la fila y la columna en solo una fila

        for (int i = 0; i < matriz.length; i++) {
            System.out.print("Introduce valores de la fila "+(i+1)+" :");
            String fila[] = teclado.next().split("");
            //condicion if en caso de introducir más letras de las que ha puesto el usuario
            if (n!= fila.length){
                System.out.println("ERROR:introduce valores válidos "+ n +" letras");
                return;
            }
            for (String letra : fila ){ // hago un bucle for each en caso de que el usuario introduzca en las filas, un numero.
                if (!letra.matches("[a-zA-Z]+")){
                    System.out.println("Error: Introduce solo letras");
                    return;
                }
            }
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=fila[j]; //introduzco en fila, los valores de i y j
            }
        }

        //imprimimos los valores introducidos en la matriz.

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }

        //preguntamos al usuario que palabra que quiere buscar
        System.out.println("Introduce la palabra a buscar: ");
        String lectura= teclado.next();

        //lectura.matches("[a-zA-Z]+")

        boolean encontrar = false; //hago una variable de tipo booleana.

        //busca horizontalmente
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (lectura.equals(matriz[i][j])){
                    encontrar=true;
                    System.out.println("Palabra encontrada en la posición: [" + i + "][" + j + "]");
                    break;

                }
            }
            if (encontrar) break;// si encuentra la palabra en horizontal, para el bucle.
        }
        //si no lo encuentra horizontalmente, ahora lo busca de manera vertical
        if (!encontrar) {
            for (int i = 0; i < matriz[0].length; i++) {
                for (int j = 0; j < matriz.length;j++) {
                    if (lectura.contains(matriz[i][j])) {
                        encontrar=true;
                        System.out.println("Palabra encontrada en la posición: [" + i + "][" + j + "]");
                        break;
                    }
                }
                if (encontrar) break; // si encuentra la palabra en vertical, para el bucle.
            }
        }

    }
}
