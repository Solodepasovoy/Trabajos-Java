package Ejercicios.Parte2.Ejercicio3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Integer> listavacia = new ArrayList<>(List.of());
        List<Integer> pares = new ArrayList<>(List.of());
        List<Integer> impares = new ArrayList<>(List.of());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 numeros enteros: ");
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            listavacia.add(numero);
        }
        for (int i = 0; i < listavacia.size(); i++) {
            if (listavacia.get(i) % 2 == 1){
                impares.add(listavacia.get(i));
            } else {
                pares.add(listavacia.get(i));
            }
        }
        System.out.println("Numeros pares: " + pares);
        System.out.println("Numeros impares: " + impares);
    }
}