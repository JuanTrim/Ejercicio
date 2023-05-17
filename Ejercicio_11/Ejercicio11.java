
package Ejercicio_11;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();

        
        System.out.println("NUEVA FRASE " + decodificarVocales(frase) );
        
        
        
        
        
        
        
       
        
        
    }
    
    
    public static String decodificarVocales (String frase){
        String nuevaFrase;
        int Ncaracteres = frase.length();
        nuevaFrase = frase;
        
        for (int i = 0; i < Ncaracteres; i++) {
           String letra = nuevaFrase.substring(i,i);
          
            switch(letra){
                case "a":
                    nuevaFrase.replace(nuevaFrase.charAt(i),'@'  );
                    System.out.println("");
                break;
                case "e":
                   nuevaFrase.substring(i,i+1).equals("@") ;
                break;
                case "i":
                    nuevaFrase.substring(i,i+1).equals("@") ;
                break;
                case "o":
                    nuevaFrase.substring(i,i+1).equals("@") ;
                break;
                case "u":
                    nuevaFrase.substring(i,i+1).equals("@") ;
                break;
            }
            
        }
         
        
     
        
        return nuevaFrase;
    }
    
}
