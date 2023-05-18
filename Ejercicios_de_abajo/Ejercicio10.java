

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio10 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero limite positivo");
       
        int num = leer.nextInt();
        int suma = 0;
        while(suma < num){
            System.out.println("INGRESE UN NUMERO");
            suma = (leer.nextInt() + suma);
            
            
        }
        
        System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS SUPERO EL LIMITE de " + num + " La suma es: " + suma );
        
    }

}
