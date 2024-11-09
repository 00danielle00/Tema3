package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {
    public void samurai() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        int equipo1[] = new int[7];
        int equipo2[] = new int[7];

        int suma = 0;
        int suma2 = 0;

        boolean comprobador = true;
        System.out.println("Equipo 1:");
        System.out.print("Introduce la potencia de los samurais:");//pregunto la potencia de los samurais


        while (comprobador) {
            String potenciasamurai = teclado.next();//introduce los valores de la potencia
            String entrada[] = potenciasamurai.split(" ");//utilizo el delimitador utilizando espacios

            if (entrada.length == 7) {//si las el índice son igual a 7

                for (int i = 0; i < 7; i++) {
                    equipo1[i] = Integer.parseInt(entrada[i]); //pasamos a entero el numero
                    suma += equipo1[i];//sumamos todos los índices dentro del array

                    if (suma != 30) {
                        System.out.println("Error.La potencia total no suma 30");
                        comprobador=false;
                        potenciasamurai = teclado.next();
                    } else {
                        System.out.println("Equipo completado");
                        return;
                    }
                }
            }
        }
//        System.out.println("Equipo 2:");
//        System.out.print("Introduce la potencia de los samurais:");//pregunto la potencia de los samurais
//        String potenciaequipo2 = teclado.next();//introduce los valores de la potencia
//        String entrada2[] = potenciaequipo2.split(" ");//utilizo el delimitador utilizando espacios
//
//        for (int i = 0; i < 7; i++) {
//            equipo2[i] = Integer.parseInt(entrada2[i]); //pasamos a entero el numero
//            suma2 += equipo2[i];//sumamos todos los índices dentro del array
//
//            if (suma != 30) {
//                System.out.println("Error.La potencia total no suma 30");
//                potenciaequipo2 = teclado.next();
//            } else {
//                System.out.println("Equipo completado");
//            }
//        }
    }
}