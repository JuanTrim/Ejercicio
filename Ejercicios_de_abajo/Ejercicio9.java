

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        
        
        if(frase.substring(0, 1).equalsIgnoreCase("A")){
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
    }
    }

}
