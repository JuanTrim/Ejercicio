

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE: ");
        String frase;
        int contCorrectos = 0;
        int contIncorrectos = 0;
       
        do{
           frase = leer.nextLine();
           if(frase.length() == 5 && frase.substring((frase.length() - 1), frase.length()).equalsIgnoreCase("O") && frase.substring(0, 1).equalsIgnoreCase("X")){
                contCorrectos++;
                
                
                
            }else if(frase.equals("&&&&&")){
                
            }else{
                contIncorrectos++;
            }
        }while (!frase.equals("&&&&&"));
        

        System.out.println("LA CANTIDAD DE LECTURAS CORRECTAS ES: " + contCorrectos );
        System.out.println("LA CANTIDAD DE LECTURAS INCORRECTAS ES: " + contIncorrectos );
    }

}
