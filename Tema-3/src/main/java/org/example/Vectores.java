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

        int numero [] = new int[5];
        int aux;

        System.out.println("Introduce los numeros a invertir: ");

        for (int i=0; i<numero.length;i++){
            numero[i]= teclado.nextInt();
        }

        System.out.println(Arrays.toString(numero));

        for (int i=0 ; i<numero.length/2;i++){
            aux = numero[i];
            numero[i]=numero[numero.length-1-i];
            numero[numero.length-1-i]= aux;
        }
        System.out.println(Arrays.toString(numero));
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
    public void ejercicio4(){

        Scanner teclado = new Scanner(System.in);
        int numero[]= {1,3,5,7,9};

        System.out.println("Array original "+ Arrays.toString(numero));

        System.out.println("Ingresa el índice a eliminar:");

        int eliminar = teclado.nextInt();

        for (int i=eliminar ; i<numero.length-1;i++){
            numero[i]=numero[i+1];

        }
        System.out.println("Array resultante: ");

        numero[numero.length-1]=-1;

        for (int i=0;i<numero.length;i++){

            if (numero[i]!= -1){
                System.out.print(numero[i]+" ");
            }
        }

    }
    public void ejercicio5(){

        int numero[]= {1,2,3,4,5};

        int ultimaposicion= numero[numero.length-1];

        System.out.println("Array original "+Arrays.toString(numero) );

        for (int i=numero.length-1; i>=0;i--){
            if (i==0){
                numero[i] = ultimaposicion;
            }else{
                numero[i]=numero[i-1];
            }
        }
        System.out.println("Array rotado :"+Arrays.toString(numero));

    }
    public void ejercicio6(){
        int array[]={1,2,3,2,1};

        int aux;

        for (int i=0;i<array.length;i++){
            System.out.print(" "+array[i]+" ");
        }
        for (int j=0;j<array.length/2;j++){
            if (array[j] != array[array.length - 1 - j]) {
                System.out.println("no es simetrico");
                break;
            }else {
                System.out.println("si es simetrico");
                break;
            }
        }



    }
    public void ejercicio7() {

        int array1[] = {1, 2, 3};
        System.out.println( "Array 1: "+Arrays.toString(array1).replace("[", " ").replace("]"," "));
        int array2[] = {4, 5, 6};
        System.out.println( "Array 2: "+Arrays.toString(array2).replace("[", " ").replace("]"," "));
        System.out.println("Array combinado: "+Arrays.toString(array1).replace("[", " ").replace("]"," ").concat(Arrays.toString(array2)).replace("["," ").replace("]"," "));

    }
    public void ejercicio8() {
        Scanner teclado = new Scanner(System.in);

        int original[] = {1, 2, 3, 4};
        int[] nuevoArray = new int[original.length + 1];

        System.out.println("En qué posición quieres insertar el número:");
        int posicion = teclado.nextInt();

        System.out.println("Indica el número que quieres insertar:");
        int insertar = teclado.nextInt();

        for (int i = 0; i < posicion - 1; i++) {
            nuevoArray[i] = original[i];
        }
        nuevoArray[posicion - 1] = insertar;

        for (int i = posicion - 1; i < original.length; i++) {
            nuevoArray[i + 1] = original[i];
        }

        System.out.println("Array después Nuevo :");
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
    }
    public void ejercicio9(){
        String palabras []= {"paco","pepesa","Lorena","Josemanuel"};

        String palabralarga ="";

        for (String palabra:palabras){
            if (palabra.length()>palabralarga.length()){
                palabralarga=palabra;
            }

        } System.out.println("La palabra más larga es "+palabralarga);
    }
    public void ordenacion(){
        int vector[]={7,8,1,4,6};
        int num = 4;

        int posicion = Arrays.binarySearch(vector,num);
        System.out.println(posicion);

        Arrays.sort(vector);//ordena arrays de menor a mayor

        System.out.println(posicion);

        //búsqueda binaria, solo con vector ordenado

        //[0,1,2,3,4,5,6,7,8,9]

        // define 2 limites, el primer numero y el ultimo, e indice intermedio que seria (0+9)/2
        //Si el numero no esta dentro del array, saldrá un número menor que 0

        //Buscar duplicados en el vector:
        //primero se hace un sort


    }
    public void eliminar (){

        int arrayoriginal []={0,1,1,2,2,3,4,5,6};
        int tam=0;

        System.out.println(Arrays.toString(arrayoriginal));

        int aux[]=new int[arrayoriginal.length];

        int sin_duplicados[]=new int[tam];

        for (int i =0; i<arrayoriginal.length;i++){
            if (i!=0 && arrayoriginal[i]==arrayoriginal[i-1]){
                continue;
            }else {
                aux[i]=arrayoriginal[i];
            }

        }
        System.out.println(Arrays.toString(aux));
        int pos=0;

        for (int i= 0; i<aux.length;i++){
            if (aux[i]!=0){
                sin_duplicados[pos]=aux[i];
                pos++;
            }
        }
        System.out.println(Arrays.toString(sin_duplicados));
    }
}
