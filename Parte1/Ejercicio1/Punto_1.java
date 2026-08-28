//punto 1
import java.util.Scanner;

public class Punto_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su temperatura: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37.5) {
            System.out.println("Alerta: Posible fiebre");
        } else {
            System.out.println("Esta ya normal");
        }
        
        scanner.close();
    }
}