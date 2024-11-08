package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {
    public void samurai(){

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int equipo1[]=new int[7];
        int equipo2[]=new int[7];

        int suma=0;

        System.out.println("Equipo 1:");
        for (int i=0;i<7;i++){
            System.out.print("Introduce la potencia de los samurais:");//pregunto la potencia de los samurais
            String potenciasamurai=teclado.next();//introduce los valores de la potencia
            String entrada []=potenciasamurai.split(" ");

            if (entrada.length == 7){//si las potencias son igual a 7
                equipo1[i]=Integer.parseInt(entrada[i]); //pasamos a entero el numero
                suma+=equipo1[i];
            }


        }
    }
}
