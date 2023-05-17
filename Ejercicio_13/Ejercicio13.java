

package Ejercicio_13;
import java.util.Scanner;

public class Ejercicio13 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //EJERCICIO 13
        String[] equipo = new String[6];
        
        //EJERCICIO 14
        for (int i = 0; i < 6; i++){
        
            System.out.println("INGRESE EL NOMBRE DEL ALUMNO " + i);
            equipo[i]= leer.nextLine();
            
            
        
    }       
        
        for (int i = 0; i < 6; i++) {
            System.out.println(equipo[i] + " ESTE ES EL ALUMNO " + i);
        }
        
    }

    
}
