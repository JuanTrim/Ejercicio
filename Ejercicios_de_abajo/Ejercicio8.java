

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio8 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE");
        String frase = leer.nextLine();
        
        if(frase.length() == 8){
            System.out.println("TIENE 8 CARACTERES ES CORRECTO");
        }else{
            System.out.println("NO TIENE 8 CARACTERES ES INCORRECTO");
}
    }

}
