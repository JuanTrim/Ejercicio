
package ejercicios_8;
import java.util.Scanner;
        
public class Ejercicio8 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.print("INGRESE UNA NOTA: ");
       int nota = leer.nextInt();
       
       
       while (nota > 10 || nota < 0){
           System.out.println("INGRESE NUEVAMENTE LA NOTA");
           nota = leer.nextInt();
       }
       
        System.out.println(nota + " LA NOTA ES VALIDA ");
        
  
     
               
    }
    // || OR
    // && AND
    // ! NEGACION
}
