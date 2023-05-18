

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        
        System.out.println("Su frase en mayusculas: " + frase.toUpperCase() );
        System.out.println("Su frase en minusculas: " + frase.toLowerCase());
    }

}
