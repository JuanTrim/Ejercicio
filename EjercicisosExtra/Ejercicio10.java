

package EjercicisosExtra;
import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        
        int numazar = num1 * num2;
        int numintento = 0;
        while (numintento != numazar){
        System.out.println("INGRESAR NUMERO PARA DESCUBRIR EL NUMERO MULTIPLICADO");
        numintento = leer.nextInt();
        }
        
        
        
        System.out.println("ACERTASTE");
        
        
       
                
        
        
        
        
        
        
        
        
        
        
        
    }

}
