package estaticas;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);


        // Declarando Array
        int [] vector1 = new int [10];
/* 
        vector1[0]=30;
        vector1[1]=50;
        vector1[2]=25;
        vector1[3]=85;
        vector1[4]=12;
        vector1[5]=6;
        vector1[6]=32;
        vector1[7]=41;
        vector1[8]=23;
        vector1[9]=63;
        */
        
/*1  // imprimir Array for normal
        for (int index=0;index<10;index++){
            System.out.println( " en la posicion  " + index + " esta el valor "  + vector1[index]);
        }
        System.out.println(vector1[5]+ " "+vector1[3]); 

     // imprimir array for each mejorado   
for (int index:vector1){
    System.out.println(index);*/

    // Ciclo Rellenar el Array
    for (int index=0;index<10;index++){
        System.out.println(" digite la posicion " + index );
        vector1[index]= entrada.nextInt();
    }

}
    }
