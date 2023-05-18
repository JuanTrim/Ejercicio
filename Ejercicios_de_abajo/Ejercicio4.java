

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio4 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        int grados = leer.nextInt();
        
        System.out.println( grados + " Centigrados en Farenheit son: " + (32 + (9 * grados / 5)));
    }

}
