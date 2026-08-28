package Ejercicios.Parte2.Ejercicio4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double nota = 0;
        double notafinal = 0;
        List<Double> calificaciones = new ArrayList<>(List.of());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 5 calificaciones: ");
        for (int i = 0; i < 5; i++) {
            double calificacion = scanner.nextDouble();
            calificaciones.add(calificacion);
        }
        for (int i = 0; i < calificaciones.size(); i++){
            nota += calificaciones.get(i);
            notafinal = nota / calificaciones.size();
        }

        if (notafinal >= 3.0) {
            System.out.println("Aprobado con: " + notafinal);
        } else {
            System.out.println("Reprobado, tuviste una nota por debajo de 3.0");
        }
    }
}