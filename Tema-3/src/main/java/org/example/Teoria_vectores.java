package org.example;

import java.util.Scanner;

public class Teoria_vectores {
    public void teoria(){
//guardar numero en el vector
        Scanner teclado = new Scanner(System.in);
        int numero;
        int sumaprecios = 0;
        int precios[]= new int[3];


        for (int i=0; i< precios.length;i++){
            System.out.println("dame el precio: ");
            precios[i]= teclado.nextInt();
        }
        for (int i=0; i< precios.length;i++){
            System.out.println(precios[i]);
        }

    //sumar vectores
        for (int i=0; i< precios.length;i++){
            sumaprecios=sumaprecios+precios[i];
        }
        System.out.println("La suma es "+sumaprecios);









    }


}
