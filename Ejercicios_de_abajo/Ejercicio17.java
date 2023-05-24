

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio17 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO");
        int tamaño = leer.nextInt();
        int cont = 0;
        
        
        int vector[] = new int[tamaño];
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = (int) (Math.random() * 10);
            if (vector[i] % 2 == 0){
                vector[i] = vector[i] * 2;
            }else{
                vector[i] = vector[i] * 13; 
            }
            System.out.println(vector[i]);
            
            
        }
        //CANTIDAD DE DIGITOS
        for (int i = 1; i < 6; i++) {
            
            for (int j = 1; j < tamaño; j++) {
                //VALIDA SI ES IGUAL AL FOR DE ARRIBA
                if (String.valueOf(vector[j]).length() == i){
                    cont++;
                    
                }
                
            }
            System.out.println(cont + " DE " + i + " DIGITOS" );
            cont = 0;
        }
            
        }
        
    }


