

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio7 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }

}
