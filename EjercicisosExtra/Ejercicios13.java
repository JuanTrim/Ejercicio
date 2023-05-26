

package EjercicisosExtra;
import java.util.Scanner;

public class Ejercicios13 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
   
        System.out.println("INGRESE EL TAMAÑO DE LA ESCALER");
        int tam = leer.nextInt();
        int n = 3;
        
        
        
        
        for (int i = 1; i < tam + 1; i++) {
            
                System.out.print(1 + ", ");
            
            
                for (int j = 2; j < n; j++) {
                    if(i > 1){
                        System.out.print(j + ", ");
                        n = i + 1;
                    }
                    
                    
                    
            }
             System.out.println("");
            
            
        }
        
        
        
        
        
        
        
    }

}
