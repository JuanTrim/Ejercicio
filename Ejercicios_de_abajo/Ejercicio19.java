

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio19 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int matriz[] [] = new int [3] [3];
        int matriz2 [][] = new int [3] [3];
        boolean verificar = true;
        llenar2matriz(matriz,matriz2,3,3);
        mostrar2matriz(matriz,matriz2,3,3);
        
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] != matriz2[j][i]){
                    verificar = false;
                }
                    
                
            }
        }
        
        if (verificar == false){
            System.out.println("LAS MATRICES NO SON ANTISIMETRICAS");
        }else{
            System.out.println("LAS MATRICES SON ANTISIMETRICAS");
        }
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    public static void llenar2matriz( int matriz[][],int matriz2[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                matriz2[j] [i] = (int) (Math.random() * 10);
            }
            
        }
    }
    public static void mostrar2matriz( int matriz[][],int matriz2[][], int filas, int columnas){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
            
        }
        System.out.println("---------------------------------------");
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz2[i][j]);
            }
            System.out.println("");
            
        }
    }
    
    

}
