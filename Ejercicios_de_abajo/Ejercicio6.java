

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio6 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        if (num % 2 == 0){
            System.out.println("EL NUMERO ES PAR");
        }else{
            System.out.println("El NUMERO ES IMPAR");
        }
    }

}
