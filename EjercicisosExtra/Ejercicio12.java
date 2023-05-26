package EjercicisosExtra;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String kdena;
        String idena;
        String jdena;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                for (int k = 0; k < 10; k++) {
                    cadena = i + "-" + j + "-" + k;
                    idena = String.valueOf(i);
                    jdena = String.valueOf(j);
                    kdena = String.valueOf(k);

                    if (i == 3) {

                        idena = "E";
                                
                       
//                        continue;
                    }
                    if (j == 3) {

                       jdena = "E";
                       
//                        continue;
                    }
                    if (k == 3) {

                        kdena = "E";
                        
//                        continue;
                    }

                System.out.println(idena + "-" + jdena + "-" + kdena);
                }
            }

        }

    }
}