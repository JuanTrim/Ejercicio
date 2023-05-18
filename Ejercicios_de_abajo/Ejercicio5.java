

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double numero = leer.nextDouble();
         
        System.out.println("El doble de su numero es: " + (numero * 2));
        System.out.println("El Triple de su numero es: " + (numero * 3));
        System.out.println("El doble de su numero es: " + Math.sqrt(numero)) ;
        
    }

}
