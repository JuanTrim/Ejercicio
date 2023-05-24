

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio16 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
         int tamaño = leer.nextInt();
        int vector[] = new int[tamaño];
        
        
        
        
        for (int i = 0; i < tamaño; i++) {
            
            vector[i] =(int) (Math.random() * 10);
            System.out.println(vector[i] + " POSICIÓN " + i);
            
            
        }
        System.out.println("INGRESE EL NUMERO QUE QUIERE BUSCAR EN EL VECTOR");
        int numbuscar = leer.nextInt();
        int cont = 0;
        
        for (int i = 0; i <tamaño; i++) {
            if (vector[i] == numbuscar){
                System.out.println(numbuscar + " SE ENCUENTRA EN LA POSICION " + i);
                cont++;
            }
           
            
        } if (cont == 0){
                System.out.println(numbuscar + " NO SE ENCUENTRA EN EL VECTOR");
            }
        
        
        
        
        
        
    }

}
