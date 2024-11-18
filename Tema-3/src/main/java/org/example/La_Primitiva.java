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

        System.out.println("El numero que has elegido es :"+Arrays.toString(guardar_boleto));

        for (int i = 0; i <sorteo_num.length; i++) { //numeros aleatorios del sorteo, si se repite, se vuelve a generar uno nuevo
            sorteo_num[i]= aleatorio.nextInt(49)+1;
        }

        Arrays.sort(sorteo_num);//ordeno array
        boolean aux=true;
        while (aux){//bucle para que no se repitan las bolas
            aux=false;
            for (int i = 0; i < sorteo_num.length; i++) {
                if (i!=sorteo_num.length - 1 && sorteo_num[i]==sorteo_num[i+1]){
                    System.out.println("Duplicado: "+sorteo_num[i]);
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

        int reintegro_usuario=Integer.parseInt(partes[6]);
        


        //• Categoría Especial: acertar los seis números de la combinación ganadora y el reintegro.
        //• 1ª Categoría: acertar los seis números de la combinación ganadora.
        //• 2ª Categoría: acertar cinco números de la combinación y el número complementario.
        //• 3ª Categoría: acertar cinco números de la combinación.
        //• 4ª Categoría: acertar cuatro números de la combinación.
        //• 5ª Categoría: acertar tres números de la combinación.
        //• Reintegro: acertar el número del reintegro.
        //• No premiado.








    }
}
