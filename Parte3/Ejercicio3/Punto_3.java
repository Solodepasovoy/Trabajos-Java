import java.util.Scanner;

public class Punto_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] tallas = new char[6];

        int contadorS = 0;
        int contadorM = 0;
        int contadorL = 0;

        System.out.println("Ingrese las 6 tallas:");

        System.out.print("Talla 1: ");
        tallas[0] = scanner.next().charAt(0);

        System.out.print("Talla 2: ");
        tallas[1] = scanner.next().charAt(0);

        System.out.print("Talla 3: ");
        tallas[2] = scanner.next().charAt(0);

        System.out.print("Talla 4: ");
        tallas[3] = scanner.next().charAt(0);

        System.out.print("Talla 5: ");
        tallas[4] = scanner.next().charAt(0);

        System.out.print("Talla 6: ");
        tallas[5] = scanner.next().charAt(0);

        for (int i = 0; i < 6; i++) {
            switch (tallas[i]) {
                case 'S':
                    contadorS++;
                    break;
                case 'M':
                    contadorM++;
                    break;
                case 'L':
                    contadorL++;
                    break;
            }
        }

        System.out.println("Talla S: " + contadorS);
        System.out.println("Talla M: " + contadorM);
        System.out.println("Talla L: " + contadorL);

        if (contadorL == 0) {
            System.out.println("Falta stock de talla grande");
        }

        scanner.close();
    }
}