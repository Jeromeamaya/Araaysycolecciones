package estaticas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int competidores;
        String nombres;
        Float tiempo,promtiempo,acumtiempo,tiempoganador;

        System.out.println("ingrese la cantidad de competidores ");
        competidores=entrada.nextInt();

        Float tiempos [] []= new Float [competidores][acumtiempo]; 
        for (int x=0; x<tiempos.length; x++){
            for (int y=0; y<tiempos.length; y++){
                System.out.println("ingrese el tiempo" + (y+1)+ "del atleta" + (x+1) + " ");
                tiempo=entrada.nextFloat();
                tiempos [x][y]=tiempo;

            }
        }
    }
}
    
