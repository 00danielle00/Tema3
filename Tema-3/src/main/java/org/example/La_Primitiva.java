package org.example;

import java.util.Random;
import java.util.Scanner;

public class La_Primitiva {

    //complementaio (0-49)
    //array tam 6, 1-49

    //jugador 6 numeros y reintegro

    //array num[1-49]
    //sorteo_num[tam6]
    //jugador [tam7]
    //complementario no puede ser el mismo numero que el de los numeros sorteados
    //reintegro
    // el \d significa un numero entero

    // \d-\d-\d-\d-\d-\d/\d
    // split ([-/])
    public void juego2(){
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int sorteo_num[]=new int[6];

        String num_jugador []= new String[7];//ultimo numero es reintegro

        int complementario;

        for (int i = 0; i <sorteo_num.length; i++) { //numeros aleatorios del sorteo
            sorteo_num[i]= aleatorio.nextInt(49)+1;
        }

        System.out.println("***** Bienvenido al sorteo *****");
        System.out.println("Introduce los datos de tu boleto:");

        String boleto = teclado.nextLine();

        boolean comprobar = true;

            if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
                System.out.println("ERROR. El formato introducido no es correcto");
                return;
            }

                String guardar_boleto[] = boleto.split("[-/]");




    }









}
