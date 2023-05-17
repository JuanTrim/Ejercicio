
package While;
import java.util.Scanner;


public class Ejercicios_While {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
        System.out.println("INGRESE UN NUMERO");
       int nota = leer.nextInt();
       
       while (nota < 0 || nota > 10) {
           
           System.out.println("LA NOTA ES INVALIDA REINGRESELA");
           nota = leer.nextInt();
       } 
       
        System.out.println(nota + " ESTA NOTA ES VALIDA");
          
           }
    
}
