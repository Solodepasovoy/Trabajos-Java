package Ejercicios.Parte1.Ejercicio4;
import java.util.Scanner;

class main {
    public static void main(String[] args){
        System.out.println("Pon un numero para operar");
        Scanner tecladodos = new Scanner(System.in);
        double numero= tecladodos.nextInt();
        System.out.println("Ahora elige una operacion: 1 para multiplicar, 2 para sumar, 3 para restar, 4 para dividir");
        Scanner teclado = new Scanner(System.in);
        int operacion = teclado.nextInt();
        System.out.println("Ahora coloca otro numero");
        Scanner tecladouno = new Scanner(System.in);
        double numerodos= tecladouno.nextInt();
        double resultado = 0;
        switch (operacion) {
            case 1:
                resultado = numero * numerodos;
                break;
            case 2:
                resultado = numero + numerodos;
                break;
            case 3:
                resultado = numero - numerodos;
                break;
            case 4:
                resultado =numero / numerodos;
                break;
            default:
                System.out.println("Porfavor ingresa un operando adecuado");
                break;
        }
        System.out.println("El resultado es ");
        System.out.println(resultado);
    }
    
}