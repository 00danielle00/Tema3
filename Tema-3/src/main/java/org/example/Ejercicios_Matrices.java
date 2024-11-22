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
                matriz[i][j]=aleatorio.nextInt(10)+1;
            }
        }
        //lo imprimimos

        System.out.println("Matriz aleatoria: ");

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j]+ " ");
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
                suma2+=matriz[j][i];
            }
            System.out.println("suma columna "+(i+1)+":"+suma2);
        }
    }
    public void ejercicio3(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cuántos estudiantes tienes:");
        int estudiantes = teclado.nextInt();

        System.out.println("Cuántas asignaturas tienen:");
        int asignaturas = teclado.nextInt();

        String total [][]=new String[estudiantes+1][asignaturas+1];

        total[0][0]= "Estudiantes";
        //estudiantes
        for (int i = 1; i < total.length; i++) {
            System.out.println("Introduce el nombre del estudiante:"+i);
            total[i][0]=teclado.next();//solo una palabra

        }
        //Asignaturas
        for (int j = 1; j < total[0].length; j++) {
            System.out.println("Introduce las asignaturas:"+j);
            total[0][j]=teclado.next();
        }


        //notas
        for (int i = 1; i < total.length ; i++) {
            for (int j = 1; j < total[0].length ; j++) {
                System.out.println("Inserta la nota de "+total[i][0]+"para la asignatura"+total[0][j]);
                total[i][j]=Integer.toString(teclado.nextInt());

            }
        }

        //imprimo

        for (int i = 0; i < total.length ; i++) {
            for (int j = 0; j < total[i].length; j++) {
                System.out.println(total[i][j]+" ");

            }
            System.out.println("\n");
        }
        System.out.println("\n");
        System.out.println("Medias por asignatura y de cada estudiate:");

        int media_estudiante =0;

        for (int i = 1; i <total.length ; i++) {
            for (int j = 1; j <total[i].length ; j++) {
                media_estudiante+=Integer.parseInt(total[i][j]);
            }
            System.out.println("La media del estudiante"+total[i][0]+" es "+ (media_estudiante/asignaturas));
            media_estudiante=0;
        }

        int media_asignatura=0;
        for (int i = 1; i < total[0].length; i++) {
            for (int j = 1; j < total.length; j++) {
                media_asignatura+=Integer.parseInt(total[j][i]);

            }
            System.out.println("La media de la asignatura"+total[0][i]+" es "+ (media_asignatura/estudiantes));
            media_asignatura=0;
        }



    }
}
