package Ejercicios.Parte2.Ejercicio5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>(List.of());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 8 nombres: ");
        for (int i = 0; i < 8; i++) {
            String nombre = scanner.nextLine();
            nombres.add(nombre);
        }
        System.out.println("Ahora, que nombre quieres buscar?");
        String nombreBuscado = scanner.nextLine();
        if (nombres.contains(nombreBuscado)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}