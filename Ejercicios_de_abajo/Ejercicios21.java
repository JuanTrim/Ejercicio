package Ejercicios_de_abajo;

import java.util.Scanner;

public class Ejercicios21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int matriz10[][] = new int[10][10];
        int matrizM[][] = {{1, 26, 36, 47, 5, 6, 72, 81, 95, 10}, {11, 12, 13, 21, 41, 22, 67, 20, 10, 61}, {56, 78, 87, 90, 9, 90, 17, 12, 87, 67}, {41, 87, 24, 56, 97, 74, 87, 42, 64, 35}, {32, 76, 79, 1, 36, 5, 67, 96, 12, 11}, {99, 13, 54, 88, 89, 90, 75, 12, 41, 76}, {67, 78, 87, 45, 14, 22, 26, 42, 56, 78}, {98, 45, 34, 23, 32, 56, 74, 36, 5, 67}, {24, 67, 97, 46, 87, 13, 67, 89, 90, 75}, {21, 68, 78, 98, 90, 67, 12, 14, 22, 26}};
        int matrizP[][] = {{36, 5, 67}, {89, 90, 75}, {14, 22, 26}};
        int matrizAux[][] = new int[3][3];
        showmatriz(matrizP, matrizM);
        verificar(matrizP, matrizM);
        
        
        
        

    }

    public static void verificar(int[][] matrizP, int matrizM[][]) {
        boolean validar = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (matrizM[i][j] == matrizP[0][0]) {
                    if (matrizM[i][j + 1] == matrizP[0][1]) {
                        if (matrizM[i][j + 2] == matrizP[0][2]) {
                            if (matrizM[i + 1][j] == matrizP[1][0]) {
                                if (matrizM[i + 1][j + 1] == matrizP[1][1]) {
                                    if (matrizM[i + 1][j + 2] == matrizP[1][2]) {
                                        if (matrizM[i + 2][j] == matrizP[2][0]) {
                                            if (matrizM[i + 2][j + 1] == matrizP[2][1]) {
                                                if (matrizM[i + 2][j +  2] == matrizP[2][2]) {
                                                    System.out.println("Se encontro en la posicion [" +i + ", " + j + "]");
                                                                validar = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
                   

               

                for (int k = 0; k < 10; k++) {
                        
                }
            
        








        }
        
        
        if(validar == true){
            System.out.println("SE ENCONTRO LA MATRIZP EN LA MATRIZM");
        }else{
            System.out.println("NO SE ENCONTRO");
        }

    }

    public static void showmatriz(int[][] matrizP, int matrizM[][]) {

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizM[i][j] + "]");

            }
            System.out.println("");
        }

        System.out.println("-----------------------------");
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + i + "] " + "[" + j + "]");
            }
            System.out.println("");
        }

    }
}
