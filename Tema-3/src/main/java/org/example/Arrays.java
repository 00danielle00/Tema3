package org.example;

import java.util.Random;

public class Arrays {

    public void explicacionvextores(){

        int numeros [] = new int[7];
        numeros[3] = 27;

        numeros[6]=numeros[3]+2;
        numeros[1] = numeros[6]-numeros[3];


        for (int i =0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        String palabras [] = new String[5];


        for (int i =0; i<palabras.length;i++){
            System.out.println(" "+numeros[i]+" ");
        }
    }
    public void ejercicio1(){

        int numero [] = new int[8];
        Random aleatorio = new Random();

        int suma = 0;

        for (int i=0; i<numero.length;i++){
            numero [i] = aleatorio.nextInt(501);
            suma+=i;

        }
        System.out.println("El resultado es: " + suma);

    }
}
