

package Ejercicios_de_abajo;
import java.util.Scanner;

public class Ejercicio14 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LOS EUROS");
        double euros = leer.nextDouble();
        double[] divisas = {1.28611,129.852,0,86};
        convertidorDeEuros(euros,divisas,leer);
     
        
        
        
    }
public static void convertidorDeEuros(double euros, double[] divisas , Scanner leer ){
    
    System.out.println("INGRESE A LA MONEDA QUE QUIERE HACER EL CAMBIO");
    leer.nextLine();
    String opc = leer.nextLine();
    
    switch (opc){
        case "DOLARES":
            System.out.println("SU CAMBIO EN DOLARES ES DE: " + euros * divisas[0]);
            break;
        case "YENES":
            System.out.println("SU CAMBIO EN YENES ES DE: " + euros * divisas[1]);
            break;
        case "LIBRAS":
            System.out.println("SU CAMBIO EN LIBRAS ES DE: " + euros * divisas[2]);
            break;
    }
    Default:
    System.out.println("LA DIVISA ESCOGIDA ES INCORRECTA");
    
    

}
}


