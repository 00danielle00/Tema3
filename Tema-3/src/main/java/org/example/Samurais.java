package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {
    public void samurai() {

        Scanner teclado = new Scanner(System.in);
        int equipo1[] = new int[7];//Vector de 0-6 índices.

        int equipo2[]= new int[7];

        boolean comprobador = false;
        boolean comprobador2 = false;

        String potenciaequipo1;
        String potenciaequipo2;

        System.out.println("Equipo 1:");
        int suma = 0;
        int suma2 = 0;
        while (!comprobador) {
            System.out.println("Introduce las potencias de los samurais: ");
            potenciaequipo1 = teclado.nextLine(); //
            String[] entrada = potenciaequipo1.split(" "); // Separar por espacios, para poder luego operar

            if (entrada.length == 7) { //verifica si el array es de longitud 7

                try {
                    for (int i = 0; i < 7; i++) {
                        equipo1[i] = Integer.parseInt(entrada[i]); // convierte el array a int
                        suma += equipo1[i]; // Suma los valores introducidos por el usuario
                    }
                    if (suma == 30) {//verifica si la suma da total de 30
                        System.out.println("Equipo completado correctamente.");
                        comprobador = true; // Salir del bucle
                    } else {
                        System.out.println("Error: La potencia total no suma 30.");
                        return;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: El valor introducido es erróneo");

                }
            }
        }

        System.out.println("Equipo 2:");
        while (!comprobador2) {
            System.out.println("Introduce la potencia de los samurais: ");
            potenciaequipo2 = teclado.nextLine();
            String entrada[] = potenciaequipo2.split(" ");

            if (entrada.length == 7) {
                try {
                    for (int i = 0; i < 7; i++) {
                        equipo1[i] = Integer.parseInt(entrada[i]);
                        suma2 += equipo1[i];
                    }
                    if (suma2 == 30) {//verifica si la suma da total de 30
                        System.out.println("Equipo completado correctamente.");
                        comprobador2 = true; // Salir del bucle
                    } else {
                        System.out.println("Error: La potencia total no suma 30.");
                        return;
                    }
                }catch(NumberFormatException err){
                    System.out.println("Error: El valor introducido es erróneo");
                }
            }
        }
        System.out.println("¡EMPIEZA LA BATALLA!");
        Random aleatorio = new Random();
        int inicio = aleatorio.nextInt(7);
        System.out.println("La battalla inicia con el Samurai "+(inicio+1));

        int muertosequipo1=0;
        int muertosequipo2=0;

        for (int i =0; i<7;i++){

            System.out.println("Samurai "+ (i+1)+". ");

            if (equipo1[i]>equipo2[i]){
                System.out.println("Gana Equipo 1 :"+equipo1[i]+" vs "+equipo2[i]);
                equipo2[i]=0;
                muertosequipo2++;
            } else if (equipo1[i]<equipo2[i]) {
                System.out.println("Gana Equipo 2:" +equipo1[i]+ " vs "+ equipo2[i]);
                equipo1[i]=0;
                muertosequipo1++;
            }else {
                System.out.println("Empate. Fin de la partida");
                equipo1[i]=0;
                equipo2[i]=0;
                muertosequipo1++;
                muertosequipo2++;
            }
            if (muertosequipo1 >= 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + muertosequipo1 + " bajas.");
            } else if (muertosequipo2 >= 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + muertosequipo2 + " bajas.");
            } else {
                System.out.println("Empate, ambos equipos pierden");
            }
        }

    }
}