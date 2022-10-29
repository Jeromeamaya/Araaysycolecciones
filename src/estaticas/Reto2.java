package estaticas;
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);

        int competidores;
        String nombres;
        Float tiempo,promtiempo,acumtiempo,tiempoganador;

        System.out.println("ingrese la cantidad de competidores ");
        competidores=entrada.nextInt();

        Float tiempos [] []= new Float [competidores][]; 
        for (int i=0;i<tiempos.length;i++){
            System.out.println(" ingrese el nombre  del competidor " + (i+1));
            nombres=entrada.next();

            System.out.println(" ingrese el tiempo del competidor "+ (i+1));
            tiempo=entrada.nextFloat();
        
            System.out.println("el competidor " + nombres + " tuvo un tiempo de  " + tiempo);
        }
    }
}