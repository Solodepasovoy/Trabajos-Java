package Ejercicios.Parte2.Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listadenumeros = new ArrayList<>(List.of(2, 1, 6, 5, 3));
        int mayor = listadenumeros.get(0);
        for (int i = 0; i < listadenumeros.size(); i++) {
;       if (listadenumeros.get(i) > mayor) {
                mayor = listadenumeros.get(i);
            }
        }
        System.out.println("El numero mayor es: " + mayor);
    }
}