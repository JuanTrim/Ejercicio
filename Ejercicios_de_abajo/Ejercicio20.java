package Ejercicios_de_abajo;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int sumaDiagonal1 = 0;
        int sumaDiagonal2 = 0;
        int sumaFilas = 0;
        int sumaColumnas = 0;
        boolean validar = true;
        inputmatriz(matriz, 3, 3);
        showmatriz(matriz, 3, 3);
        int prueba = prueba(matriz, 3, 3);

        for (int i = 0,k = 2; i < 3; i++, k--) {
            sumaDiagonal2 = matriz[i][k] + sumaDiagonal2;
            sumaColumnas = 0;
            sumaFilas = 0;
            for (int j = 0; j < 3; j++) {
                
                sumaFilas = matriz[i][j] + sumaFilas;
                sumaColumnas = matriz[j][i] + sumaColumnas;
                
                if (i == j) {
                    sumaDiagonal1 = matriz[i][j] + sumaDiagonal1;
                }

            }
            if (sumaFilas != prueba || sumaColumnas != prueba){
                validar = false;
                break;
            }
         
            
           

        }
        
        
       
        
        
        
        
        
        System.out.println(" SumaFilas: "+ sumaFilas + " SumaDiagonal1: "+ sumaDiagonal1 + " SumaDiagonal2: "+ sumaDiagonal2 + " SumaColumnas " + sumaColumnas );
        
        
        if (sumaFilas != prueba || sumaDiagonal1 != prueba || sumaDiagonal2 != prueba) {
                validar = false;
                System.out.println("El cuadrado no es magico");
               
            }else{
            System.out.println("El cuadrado es magico");
            
        }
         

    }

    public static void inputmatriz(int[][] matriz, int filas, int columnas) {
        Scanner leer = new Scanner(System.in);
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            do{
                System.out.println("INGRESE UN NUMERO ENTRE 1 y 9" + "POSICIÓN " + i + " ," + j);
                matriz[i][j] = leer.nextInt();
            }while(matriz[i][j] < 1 || matriz[i][j] > 10);
            
        }
    }

    

    }

    public static void showmatriz(int[][] matriz, int filas, int columnas) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + i + ", " + j + "]");

            }
            System.out.println("");
        }

    }

    public static int prueba(int[][] matriz, int filas, int columnas) {
        Scanner leer = new Scanner(System.in);
        int prueba = 0;
        for (int i = 0; i < filas; i++) {
            prueba = prueba + matriz[0][i];

        }
        return prueba;
    }

}
