package org.example;

import java.util.Scanner;

public class Bucles_anidados {
    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Dime la altura: ");
        int altura = teclado.nextInt();
        //altura
        for (int i = 1; i <=altura ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }
    public void tabla(){


        for (int i = 1; i <=10 ; i++) {
            System.out.println("Tabla del "+i);
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i +"x"+j+"="+i*j );
            }
        }

    }
    public void ejercicio4(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el valor m: ");
        int m = teclado.nextInt();
    bucle1:
        for (int i = 2; i < m; i++) {
            for (int j=2; j < i; j++) {
                if (i%j==0){
                    continue bucle1;
                }
            }
            System.out.println("Primos: "+i);
        }

    }
}
