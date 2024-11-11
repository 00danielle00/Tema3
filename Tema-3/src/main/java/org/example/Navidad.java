package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Navidad {
    public void ejercicio_navidad(){

        Scanner teclado = new Scanner(System.in);

        final String PALABRA ="NAVIDAD";//define constante

        String palabras[]=PALABRA.split("");

        System.out.println("Introduce la cantidad de letras que quieres: ");

        String cantidad = teclado.nextLine();

        String cantidades[]= cantidad.split(" ");

        String resultado="";
        if (cantidades.length==7){
            for (int i = 0; i<cantidades.length;i++){

                for (int j=0; j<Integer.parseInt(cantidades[i]);j++){

                    resultado=resultado + palabras[i];

                }
            }
        }else {
            System.out.println("No hay un numero por letra.");
        }

        System.out.println(resultado);

    }
    public void ejercicio_colores(){
        Scanner teclado = new Scanner(System.in);

        String nombres []= {"Paco","Pepe","Alfonso","Ximo"};

        String palabra_buscar = "Pepe";

        boolean existe = Arrays.asList(nombres).contains(palabra_buscar);//busca en el array x cosa especifica

        if (existe){
            System.out.println(palabra_buscar + " existe");
        }else {
            System.out.println(palabra_buscar + " No existe en el vector");
        }

        //buscar primitivos

        Integer numeros[]= {3,5,6,8,24,56};
        int num =25;

        boolean num_existe = Arrays.asList(numeros).contains(num);

        if (num_existe){
            System.out.println(num_existe + " existe");
        }else {
            System.out.println(num_existe + " No existe en el vector");
        }
    }
    public void ruleta(){
        Scanner teclado = new Scanner(System.in);
        String colores[]={"rojo","negro"};
        String color = "";
        String par = "";

        Integer numeros[]=new Integer[37];

        for (int i =0; i<numeros.length;i++){
            numeros[i]=i;
        }
        String pares []={"par", "impar"};



        System.out.println("******** Bienvenido a la ruleta **********");
        System.out.println("Introduce un numero 0-36: ");
        int numero = teclado.nextInt();

        boolean num_rango = Arrays.asList(numeros).contains(numero);

        if (!num_rango){
            System.out.println("ERROR.NUMERO NO VALIDO");
            return;
        }else {
            if (numero!=0){
            System.out.println("Dime un color: ");
            color = teclado.next();

            boolean colores_almacenados = Arrays.asList(colores).contains(color);

            if (!colores_almacenados){
                System.out.println("ERROR,COLOR NO ENCONTRADO");
                return;
            }   else {
                    System.out.println("Inserta par/impar: ");
                    par = teclado.next();
                    boolean par_encontrado = Arrays.asList(pares).contains(par);

                        if (!par_encontrado){
                            System.out.println("ERROR.valor no encontrado");
                            return;
                        }
                    }

            }

        }
        Random aleatorio = new Random();
        String sorteo_color = colores[aleatorio.nextInt(colores.length)];
        int sorteo_num = numeros [aleatorio.nextInt(numeros.length)];

        String sorteo_par="";

        if (sorteo_num%2==0){
            sorteo_par="par";

        }else {
            sorteo_par="impar";
        }
        System.out.println("Ha tocado "+ sorteo_num+ " "+sorteo_color+" "+ sorteo_par);

        if (sorteo_num == numero && sorteo_color==color){
            System.out.println("Has ganado!");
        }else if (numero!=0 && sorteo_color.equals(color)){
            System.out.println("Has acertado el color");
        } else if (numero!=0&&sorteo_par.equals(par)) {
            System.out.println("HAs acertado si es impar/par");
        } else if ( numero!=0&& sorteo_num == numero) {
            System.out.println("HAS acertado el numero ");
        } else if (numero==0&sorteo_num==0) {
            System.out.println("Has acertado, los dmás pierden");
        }else {
            System.out.println("has perdido.");
        }


    }
}
