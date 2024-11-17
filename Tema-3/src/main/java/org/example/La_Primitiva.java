package org.example;

import java.util.Arrays;
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

        int complementario=aleatorio.nextInt(49)+1;//numero complementario del 1-49 aleatorio

        int reintegro= aleatorio.nextInt(10);//Reintegro del 0-9

        String formato = "\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d";

        String[] guardar_boleto = new String[7];


        System.out.println("***** Bienvenido al sorteo *****");
        System.out.println("Introduce los datos de tu boleto:");
        String entrada_jugador = teclado.nextLine();
        if (!entrada_jugador.matches(formato)) {
                System.out.println("ERROR.EL FORMATO INTRODUCIDO NO ES VALIDO");
                return;
        }
        String partes [] = entrada_jugador.split("[-/]");

        for (int i = 0; i < partes.length; i++) {
            int numero_jugador = Integer.parseInt(partes[i]);
            guardar_boleto[i]=partes[i];
        }

        System.out.println("El numero que has elegido es :"+Arrays.toString(guardar_boleto));

        boolean contiene =false;
        for (int i = 0; i <sorteo_num.length; i++) { //numeros aleatorios del sorteo, si se repite, se vuelve a generar uno nuevo
            sorteo_num[i]= aleatorio.nextInt(49)+1;
        }

        int sorteo_ordenado[]= Arrays.stream(sorteo_num).distinct().toArray();//ordeno array
        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(sorteo_ordenado));

    }





//        boolean comprobar = true;
//
//            if (!boleto.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d")) {
//                System.out.println("ERROR. El formato introducido no es correcto");
//                return;
//            }
//
//                String guardar_boleto[] = boleto.split("[-/]");
//
//    }









}
