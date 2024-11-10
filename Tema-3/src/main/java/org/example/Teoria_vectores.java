package org.example;

import java.lang.runtime.SwitchBootstraps;
import java.util.Random;
import java.util.Scanner;

public class Teoria_vectores {
    public void teoria(){
//guardar numero en el vector
        Scanner teclado = new Scanner(System.in);
//        int numero;
//        int sumaprecios = 0;
//        int precios[]= new int[3];
//
//
//        for (int i=0; i< precios.length;i++){
//            System.out.println("dame el precio: ");
//            precios[i]= teclado.nextInt();
//        }
//        for (int i=0; i< precios.length;i++){
//            System.out.println(precios[i]);
//        }
//
//    //sumar vectores
//        for (int i=0; i< precios.length;i++){
//            sumaprecios=sumaprecios+precios[i];
//        }
//        System.out.println("La suma es "+sumaprecios);
// vector será del tamaño que el usuario nos indique

        System.out.println("Cuántos números quieres guardar?");
        int longitud= teclado.nextInt();

        int array []= new int[longitud];
        int aux;
//for para llenar el array
        for (int i=0; i<longitud;i++){
            System.out.println("Ingrese el numero "+ (i+1)+":");
            aux= teclado.nextInt();
//Se guarda el numero introducido anteriormente en el array
            array[i]=aux;
        }
        //for para imprimir
        System.out.println("Array desordenado");
        for (int i=0; i<longitud;i++){
            System.out.println(array[i]);
        }

        //ordenar el array en caso de que el usuario haya rellenado sin ordenar
        int guardado;
        //que lo haga una vez menos, lo ordena por primera vez
        for (int i=0;i<(longitud-1);i++){
        //lo ordena por 2 vez, lo reinicia
            for (int j=0;j<(longitud-1);j++){
                if (array[j]>array[j+1]){
                    guardado=array[j];//guarda el primer valor
                    array[j]=array[j+1];
                    array[j+1]=guardado;
                }
            }
        }
        System.out.println("Array ordenado");
        for (int i=0; i<longitud;i++){
            System.out.print(array[i]);
        }
    }
    public void juego(){
        Scanner teclado = new Scanner(System.in);

        Random aleatorio = new Random();

        int maquina = aleatorio.nextInt(3);

        switch (maquina){
            case 0:
                System.out.println("Papel");
                break;
            case 1:
                System.out.println("Piedra");
                break;
            case 2:
                System.out.println("Tijera");
                break;
        }

        System.out.println("Elige una opcion p/a/t: ");
        String op = teclado.next();

        String resultadomaquina;
        String resultadohomano;






    }


}
