package org.example;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Vectores {

    public void explicacionvextores(){

        int numeros [] = new int[7];
        numeros[3] = 27;

        numeros[6]=numeros[3]+2;
        numeros[1] = numeros[6]-numeros[3];


        for (int i =0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
        String palabras [] = new String[5];


        for (int i =0; i<palabras.length;i++){
            System.out.println(" "+numeros[i]+" ");
        }
    }
    public void ejercicio1(){

        int numero [] = new int[8];
        Random aleatorio = new Random();

        int suma = 0;

        for (int i=0; i<numero.length;i++){
            numero [i] = aleatorio.nextInt(501);
            suma+=i;

        }
        System.out.println("El resultado es: " + suma);

    }
    public void ejercicio2(){

        Scanner teclado = new Scanner(System.in);

        int numero [] = new int[3];
        System.out.println("Introduce los numeros a invertir: ");

        for (int i=0; i<numero.length;i++){
            numero[i]= teclado.nextInt();
        }

        System.out.println("la cadena invertida es:");

        for (int i=numero.length -1 ; i>=0;i--){

            System.out.print(" "+ numero[i]+ " ");
        }
    }
    public void ejercicio3(){
        int numero [] = new int[25];
        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        for (int i=0; i<numero.length;i++){
            numero [i] = aleatorio.nextInt(101);
        }

        System.out.println("ingrese un numero de 0-100");
        int num =0;
        do {
            if (teclado.hasNextInt()){
                num = teclado.nextInt();
            }else {
                System.out.println("Introduce un formato válido: ");
                teclado.nextLine();
            }

        }while (num<0 || num>100);

        int contador = 0;

        for (int i=0; i<numero.length;i++){

            if(num==numero[i]){
                contador++;
            }
        }
        System.out.println("El numero "+num+" aparece " + contador+ " veces en el array");

    }
    public void vectores_evo(){

        String palabras[]={"Paco,pepe,Manolo,Antonio,Alexandre"};

        for (String i : palabras){
            System.out.println(" "+ i + " ");
        }

        String salida = Arrays.toString(palabras);

        salida = salida.replace("[", "").replace("[", "");
        System.out.println(salida);

        String palabras2[] = palabras;
        String palabras3[] = palabras.clone();

        palabras3[0]="Francisco";

        System.out.println(Arrays.toString(palabras2));
        System.out.println(Arrays.toString(palabras3));

        String palabras_corto[] = new String[2];
        System.arraycopy(palabras,0,palabras_corto,0,2);

    }

}
