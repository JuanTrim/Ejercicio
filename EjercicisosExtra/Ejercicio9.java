

package EjercicisosExtra;
import java.util.Scanner;

public class Ejercicio9 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NUM1");
        int num1 = leer.nextInt();
        System.out.println("INGRESE NUM2");
        int num2 = leer.nextInt(); 
        int cont = 0;
        int aux = num1;
        
        
        while (num1 >= num2){
            aux = num1 - num2;
            num1 = aux;
            cont++;
            
            
            
        }
        
        System.out.println("RESIDUO "  + num1 );
        System.out.println("COCIENTE " + cont  );
        
       
        
        
        
        
        
        
        
        
        
    }

}
