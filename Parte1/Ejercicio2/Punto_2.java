import java.util.Scanner;

public class Punto_2 {
    public static void main(String[] args) {
       
        Scanner paridad = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int determinar = paridad.nextInt();

        if (determinar % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
        paridad.close();
    }
}