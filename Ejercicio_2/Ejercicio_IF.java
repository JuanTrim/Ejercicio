
package Ejercicio_2;
import java.util.Scanner;

public class Ejercicio_IF {

  
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("INGRESE EL NUM1");
        num1 = leer.nextInt();
        System.out.println("INGRESE EL NUM2");
        num2 = leer.nextInt();
        
        
       if(num1 > 25){
           System.out.println(num1 + " ES MAYOR A 25");
       }
       if(num2 > 25){
           System.out.println(num2 + " ES MAYOR A 25");
       }
       
    }
    
}
