

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio11 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE NUM1");
        int num1 = leer.nextInt();
          System.out.println("INGRESE NUM2");
        int num2 = leer.nextInt();
        int opc = 0;
        String opc2 = "";
        Boolean verif = false;
        do{
            if (opc >= 5){
                System.out.println("ESTA SEGURO QUE DESEA SALIR S/N");
                leer.nextLine();
                opc2 = leer.nextLine();
                System.out.println("_________________________________");
                
                if (opc2.equalsIgnoreCase("S")){
                    System.out.println("SALISTE DEL PROGRAMA");
                    break;
                    
                }else{
                    System.out.println("REANUDASTE EL PROGRAMA");
                }
                
            }
            System.out.println("1. SUMAR");
            System.out.println("2. Restar");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            
            System.out.println("SELECCIONE UNA OPCIÓN");
            opc = leer.nextInt();
            
            switch(opc){
            case 1:
           System.out.println("LA Resta DE LOS NUMEROS ES: " + (num1 + num2));
            break;
            case 2:
            System.out.println("LA Resta DE LOS NUMEROS ES: " + (num1 - num2));
            break;
            case 3:
            System.out.println("LA MULTIPLICACIÓN DE LOS NUMEROS ES: " + (num1 * num2));
            break;
            case 4:
            System.out.println("LA DIVIDISIÓN DE LOS NUMEROS ES: " + (num1 / num2));
            break;
                
                
            
        }
            
        }while(!opc2.equalsIgnoreCase("S"));
            
        
        
    }

  
}
