package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Repaso {
    public void ejercicio1(){
        int array [] = new int[8];
        int ultimapos=array[array.length -1];
        int nuevo [] = {1,2,3,4};
        array[0]=1;

        for (int i = 0; i < nuevo.length; i++) {
            System.out.println(nuevo[i]);
        }

        for (int n: array){
            System.out.println(n);
        }
    }
    public void ejercicio2(){

        int array [] = new int[8];

        Random aleatorio = new Random();

        int suma =0;

        for (int i = 0; i < array.length; i++) {
            array[i]=aleatorio.nextInt(10)+1;
        }

        for (int i = 0; i < array.length; i++) {
            suma+=array[i];

        }
        System.out.println("la suma de elementos: "+suma);
    }
    public void ejercicio3(){
        int array []={1,2,3,4,5};
        int aux;

        System.out.println("Array original: ");
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Array invertido: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i]>array[i+1]){
                aux=array[i];
                array[i]=array[i+1];
                array[i+1]=aux;
            }
        }

    }
    public void ejercicio4(){

        int matriz[][]= {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i < matriz.length; i++) {
            int suma=0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("Suma de fila "+(i+1)+" :"+suma);

            System.out.print(" ");
        }

    }
    public void ejercicio5(){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        Integer vector [] = new  Integer[5];

        //genero numero aleatorio

        for (int i = 0; i < vector.length; i++) {

            vector[i]=aleatorio.nextInt(100)+1;

        }

        int grande=0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i]>grande){
                grande=vector[i];
            }

        }
        System.out.println(grande);

        System.out.println("Cuál es el numero mas grande");
        int numgrande = teclado.nextInt();

        int aciertos =3;
        boolean adivinar = false;
        while (aciertos != 0 ){
            if (numgrande!=grande){
                System.out.println("No lo adivinaste, te quedan  "+aciertos);
                numgrande= teclado.nextInt();
                aciertos--;
            }else {
                System.out.println("Adivinaste el numero");
                adivinar=true;
                return;
            }
        }



    }
}
