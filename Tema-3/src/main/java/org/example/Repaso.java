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
    public void ejercicioo(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese una frase:");
        String frase = teclado.nextLine();

        String partes []=frase.split(" ");

        String formato = "[a-zA-Z]+";

        int validas=0;
        int novalida=0;

        for ( String letras: partes){
            if (!letras.matches(formato)){
                novalida++;
                System.out.println("No valida "+letras);
            }else {
                validas++;
                System.out.println("valida "+letras);
            }
        }

        System.out.println("Resultados");
        System.out.println("Palabras válidas: "+validas);
        System.out.println("palabras no validas: "+novalida);

    }
    public void examen(){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        int num=0;

        int bolas = aleatorio.nextInt(40)+10;

        Integer vector_bolas []=new Integer[bolas];

        for (int i = 0; i < vector_bolas.length; i++) {
            do {
                num = aleatorio.nextInt(90) + 1;
            } while (Arrays.asList(vector_bolas[i]).contains(num));
            vector_bolas[i]=num;

        }
        Arrays.sort(vector_bolas);
        //numeros oficiales del bingo

        System.out.println("bienvenido al bingo dl casino cantabrico");

        System.out.println(bolas+" bolas extraidas hasta ahora: "+Arrays.toString(vector_bolas));


        String formato ="\\d{1,2}-\\d{1,2}-\\d{1,2}";

        int carton[][] = new int[3][3];

        System.out.println("Introduce los datos de tu carton");


        for (int i = 0; i < carton.length; i++) {
            System.out.println("fila "+(i+1));
            String valores = teclado.next();

            if (!valores.matches(formato)){
                System.out.println("cerrando el programa...");
                return;
            }
            String partes []=valores.split("-");

            for (int j = 0; j < carton[0].length; j++) {
                carton[i][j]=Integer.parseInt(partes[j]);
            }

        }

        System.out.println("Datos del carton introducido: ");
        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                System.out.print(carton[i][j]+" ");
            }
            System.out.println("\n");
        }

        System.out.println("Premios: ");
        int premio=0;
        boolean premios=false;

        for (int i = 0; i < carton.length; i++) {
            for (int j = 0; j < carton[i].length; j++) {
                if (carton[i][j]==vector_bolas[i]){
                    System.out.println("hay premio");
                    premios=true;
                    break;
                }

            }
            if (!premios){
                System.out.println("No hay premio");
                for (int a = 0; a < carton.length; a++) {
                    System.out.println("Linea " +(i+1));
                    for (int j = 0; j < carton[i].length; j++) {
                        if (carton[a][j]==vector_bolas[a]){
                            System.out.println("Correcta");
                            premios=true;
                        }else {
                            System.out.println("NO");
                        }
                    }

                }

            }
        }

    }
}
