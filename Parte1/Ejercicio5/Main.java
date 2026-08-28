package Ejercicios.Parte1.Ejercicio5;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        String libre = "Ese dia es un dia habil";
        String ocupado ="Es fin de semana, no puedo";
        String triste = "Pon un valor valido";
        System.out.println("Pon una fecha de los 7 dias de la semana, del 1 al 7, siendo 1 el lunes y el 7 el domingo");
        Scanner teclado = new Scanner(System.in);
        int dia = teclado.nextInt();
        switch (dia) {
            case 1:  
                  System.out.println(libre);        
                break;
            case 2:            
                break;
            case 3:  
                System.out.println(libre);           
                break;
            case 4:   
                System.out.println(libre);          
                break;
            case 5:   
                System.out.println(libre);          
                break;
            case 6:    
            System.out.println(ocupado);         
                break;
            case 7:     
                System.out.println(ocupado);        
                break;
        
            default:
                System.out.println(triste); 
                break;
        }
    }
}