import java.util.Scanner;

public class Punto_3 {
    public static void main(String[] args) {
        
        Scanner pregunta = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = pregunta.nextInt();

        if (edad >= 18 && edad < 64) {
            System.out.println("Adulto");
        } else if (edad >= 65) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Menor de edad");    
        }
        pregunta.close();
    }
}
