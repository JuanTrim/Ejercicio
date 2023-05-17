package Switch;
import java.util.Scanner;
public class Ejercicio_Switch {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tipoMotor;
        
        System.out.println("INGRESE EL NUMERO DEL TIPO DE MOTOR");
        tipoMotor = leer.nextInt();
        
        switch (tipoMotor) {
        
        case 1:
            System.out.println("La bomba es una bomba de agua");
            break;
        case 2:
            System.out.println("La bomba es una bomba de gasolina ");
            break;
        case 3:
            System.out.println("La bomba es una bomba de hormigon");
            break;
        case 4:
            System.out.println("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println("EL TIPO DE MOTOR DE ESTE NUMERO NO ES VALIDO");
        
        
        
    }
    }
    
}
