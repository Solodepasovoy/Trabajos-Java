import java.util.Scanner;

public class Punto_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] productos = {"Manzanas", "Pan", "Leche"};
        int[] cantidades = {5, 0, 3};

        int opcion = 0;

        while (opcion != 3) {
            System.out.println("Inventario");
            System.out.println("1. Vender producto");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("nombre del producto ");
                    String nombreBuscar = scanner.nextLine();

                    if (nombreBuscar.equalsIgnoreCase(productos[0])) {
                        if (cantidades[0] > 0) {
                            cantidades[0]--;
                            System.out.println("Venta realizada.quedan " + productos[0]+ " unidades de " + ": " + cantidades[0] + "que habian ");
                        } else {
                            System.out.println("Agotado");
                        }
                    } else if (nombreBuscar.equalsIgnoreCase(productos[1])) {
                        if (cantidades[1] > 0) {
                            cantidades[1]--;
                            System.out.println("Venta realizada.quedan " + productos[1]+ " unidades de " + ": " + cantidades[1] + "que habian ");
                        } else {
                            System.out.println("Agotado");
                        }
                    } else if (nombreBuscar.equalsIgnoreCase(productos[2])) {
                        if (cantidades[2] > 0) {
                            cantidades[2]--;
                            System.out.println("Venta realizada.quedan " + productos[2]+ " unidades de " + ": " + cantidades[2] + "que habian ");
                        } else {
                            System.out.println("Agotado");
                        }
                    } else {
                        System.out.println("No existe");
                    }
                    break;

                case 2:
                    System.out.println("inventario total");
                    System.out.println("1. " + productos[0] + ": " + cantidades[0] + " unidades");
                    System.out.println("2. " + productos[1] + ": " + cantidades[1] + " unidades");
                    System.out.println("3. " + productos[2] + ": " + cantidades[2] + " unidades");
                    break;

                case 3:
                    System.out.println("acabo");
                    break;

                default:
                    System.out.println("mal");
                    break;
            }
        }

        scanner.close();
    }
}