package Ejercicios.Parte2.Ejercicio1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Integer> numeroslista = new ArrayList<>(List.of());
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            numeroslista.add(numero);
        }
        scanner.close();
        System.out.println("Los números ingresados son: " + numeroslista);
    }
}