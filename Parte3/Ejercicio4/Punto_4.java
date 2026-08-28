import java.util.Scanner;

public class Punto_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] estratos = new int[4];
        double[] descuentos = new double[4];

        System.out.println("estratos");
        System.out.print("Ingrese el estrato del cliente 1: ");
        estratos[0] = scanner.nextInt();

        System.out.print("Ingrese el estrato del cliente 2: ");
        estratos[1] = scanner.nextInt();

        System.out.print("Ingrese el estrato del cliente 3: ");
        estratos[2] = scanner.nextInt();

        System.out.print("Ingrese el estrato del cliente 4: ");
        estratos[3] = scanner.nextInt();

        for (int i = 0; i < 4; i++) {
            switch (estratos[i]) {
                case 1:
                case 2:
                    descuentos[i] = 20.0;
                    break;
                case 3:
                case 4:
                    descuentos[i] = 10.0;
                    break;
                case 5:
                case 6:
                    descuentos[i] = 0.0;
                    break;
                
            }
        }

        System.out.println(" RESUMEN DE DESCUENTOS");
        System.out.println("Cliente 1: Estrato " + estratos[0] + " tiene el Descuento: " + descuentos[0] + "%");
        System.out.println("Cliente 2: Estrato " + estratos[1] + " tiene el  Descuento: " + descuentos[1] + "%");
        System.out.println("Cliente 3: Estrato " + estratos[2] + " tiene el Descuento: " + descuentos[2] + "%");
        System.out.println("Cliente 4: Estrato " + estratos[3] + " tiene el Descuento: " + descuentos[3] + "%");

        scanner.close();
    }
}