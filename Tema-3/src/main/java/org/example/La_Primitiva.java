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

        Integer complementario;

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

        System.out.println("El numero que has elegido es : "+Arrays.toString(guardar_boleto));

        for (int i = 0; i <sorteo_num.length; i++) { //numeros aleatorios del sorteo, si se repite, se vuelve a generar uno nuevo
            sorteo_num[i]= aleatorio.nextInt(49)+1;
        }

        Arrays.sort(sorteo_num);//ordeno array
        boolean aux=true;
        while (aux){//bucle para que no se repitan las bolas
            aux=false;
            for (int i = 0; i < sorteo_num.length; i++) {
                if (i!=sorteo_num.length - 1 && sorteo_num[i]==sorteo_num[i+1]){
                    sorteo_num[i]=aleatorio.nextInt(49)+1;
                    aux=true;
                }
                Arrays.sort(sorteo_num);
            }
        }

        // Si el número complementario sorteado coincide con alguno de los números ya sorteados anteriormente
        //(guardados en el vector), debe volver a recalcularlo.
        do {
            complementario = aleatorio.nextInt(49) + 1;
        } while (Arrays.asList(sorteo_num).contains(complementario));

        System.out.println("Ha salido:");
        System.out.println(Arrays.toString(sorteo_num));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: "+reintegro);

        int aciertos =0;
        boolean comprobar = false;

        for (int i = 0; i < guardar_boleto.length; i++) {
                int jugador = Integer.parseInt(guardar_boleto[i]); // convierto a int

                for (int j = 0; j < sorteo_num.length; j++) {
                    if (jugador == sorteo_num[j]) {
                        aciertos++;
                        break;
                    }
                }
                if (jugador == complementario) {
                    comprobar = true;
                }
        }
        //saco la ultima posicion del array del jugador que es el reintegro
        int reintegro_jugador = Integer.parseInt(guardar_boleto[guardar_boleto.length - 1]);

        System.out.println("RESULTADOS");
        if (aciertos==6 && reintegro_jugador==reintegro){
            System.out.println("ENHORABUENA, HAS GANADO LA CATEGORIA ESPECIAL");
        } else if (aciertos==6) {
            System.out.println("EHORABUENA, HAS GANADO LA 1ª CATEGORIA");
        } else if (aciertos==5 && comprobar) {
            System.out.println("ENHORABUENA, HAS GANADO LA 2ª CATEGORIA");
        } else if (aciertos==5) {
            System.out.println("ENHORABUENA, HAS GANADO LA 3ª CATEGORIA");
        } else if (aciertos==4) {
            System.out.println("ENHORABUENA, HAS GANADO LA 4ª CATEGORIA");
        } else if (aciertos==3) {
            System.out.println("ENHORABUENA, HAS GANADO LA 5ª CATEGORIA");
        } else if (reintegro_jugador == reintegro) {
            System.out.println("¡Has acertado el reintegro!");
        }else {
            System.out.println("NO HAS GANADO NADA, VUELVE A INTENTARLO");
        }










    }
}
