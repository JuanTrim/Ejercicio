
package Ejercicio_9;
import java.util.Scanner;
public class Ejercicio9 {


    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num, cont, suma;
      cont = 0;
      suma = 0;        
               
       do{
           System.out.println("INGRESE EL NUMERO" + cont );
           num = leer.nextInt();
           
           cont = cont + 1;
           
           if (num == 0){
               System.out.println("SE CAPTURO EL NUMERO 0");
               
               break;
           } else if (num < 0) {
               System.out.println("NO INGRESES NUMEROS NEGATIVOS");
               
               continue;
           } else if (num > 0) {
                suma = num + suma;
               continue;
           }
           
       }while (cont < 20);
       
        System.out.println("LA SUMA DE LOS NUMEROS ES DE: " + suma);
    }
    
   
    
}
