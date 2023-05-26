

package EjercicisosExtra;
import java.util.Scanner;




public class Ejercicios11 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE UN NUMERO");
        long num = leer.nextLong();
        long aux = num;
        int cont = 1;
        
        while (num / 10 > 0){
            
                num = num / 10;
                cont++;
            
            
            
        }
        
        
        System.out.println(aux + " TIENE " + cont + " DIGITOS");
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}
