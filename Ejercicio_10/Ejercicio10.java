
package Ejercicio_10;
import java.util.Scanner;

public class Ejercicio10 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       int num1, num2, num3, num4, aux;
       num1 = 0;
       num2 = 0;
       num3 = 0;
       num4 = 0;
           
               
        for (int i = 0; i < 4; i++) {
            do{
                
                System.out.println("INGRESAR UN NUMERO");
                 aux = leer.nextInt();
                  switch (i){
                case 0:
                    num1 = aux;
                break;
                case 1:
                    num2 = aux;
                break;
                case 2:
                    num3 = aux;
                break;
                case 3:
                    num4 = aux;
                break;
                  }
                           
            } while (aux < 0 && aux > 20 );
            
            
            
           
            
        }
        for (int i = 0; i < 4; i++) {
               switch (i){
                case 0:
                    System.out.print(num1 + " ");
                    for (int j = 0; j < num1; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                break;
                case 1:
                    System.out.print(num2 + " ");
                    for (int j = 0; j < num2; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                break;
                case 2:
                   System.out.print(num3 + " ");
                    for (int j = 0; j < num3; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                    
                break;
                case 3:
                    System.out.print(num4 + " ");
                    for (int j = 0; j < num4; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                break;
                    
            
               }      
        
        }
       
       
    }
    
}
