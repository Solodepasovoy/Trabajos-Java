import java.util.Scanner;

public class Punto_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int opcion = 0;

    while (opcion != 3) {
        System.out.println("    Menu de opciones     ");
        System.out.println("1. Llenar arreglo");
        System.out.println("2. Mostrar arreglo");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese 5 números enteros:");
                System.out.println("numero 1: ");
                numeros[0] = scanner.nextInt();
                System.out.println("numero 2: ");
                numeros[1] = scanner.nextInt();
                System.out.println("numero 3: ");
                numeros[2] = scanner.nextInt();
                System.out.println("numero 4: ");
                numeros[3] = scanner.nextInt();
                System.out.println("numero 5: ");
                numeros[4] = scanner.nextInt();
                System.out.println("Arreglo llenado correctamente.");
                break;
            case 2:
                System.out.println("Contenido agregado: ");
                System.out.println("numero 1: " + numeros[0]);
                System.out.println("numero 2: " + numeros[1]);
                System.out.println("numero 3: " + numeros[2]); 
                System.out.println("numero 4: " + numeros[3]);
                System.out.println("numero 5: " + numeros[4]);
                break;
            case 3:
                System.out.println("saliendo");
                break;
           
            }   
        }
        scanner.close();
    }
}

        



