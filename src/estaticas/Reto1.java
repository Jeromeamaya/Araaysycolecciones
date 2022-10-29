package estaticas;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        Float nota; 
        int cantidad;
        float promedio=0,resultado=0;
        System.out.println("ingresa la cantidad de notas " );
        cantidad= entrada.nextInt();
        Float notas []= new Float [cantidad];
        for (int i=0;i<notas.length;i++){
            System.out.println("ingresa la nota ");
            nota=entrada.nextFloat();
            promedio= promedio + nota;
            resultado=(promedio/cantidad);
        }
        System.out.println(" el promedio de la nota es " + resultado );
        if (resultado<3){
            System.out.println("Reprobaste");
        }
        else if (resultado==3 || resultado<4){
            System.out.println("Pasaste Raspando");
        }    
        else if (resultado>=4.0){
            System.out.println("Felicitaciones ");
        }    
    }
}
