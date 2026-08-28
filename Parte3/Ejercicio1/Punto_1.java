public class Punto_1 {
    public static void main(String[] args) {
        
        Double[] Jose = {5.0, 4.7, 4.0, 3.5, 2.0};

        for (int i = 0; i < Jose.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + Jose[i]);

            if (Jose[i] >= 4.5 && Jose[i] <= 5.0) {
                System.out.println("Excelente");
            } else if (Jose[i] >= 4.0 && Jose[i] < 4.5) {
                System.out.println("Muy bien");
            } else if (Jose[i] >= 3.5 && Jose[i] < 4.0) {
                System.out.println("Bien");
            } else if (Jose[i] >= 3.0 && Jose[i] < 3.5) {
                System.out.println("Regular");
            } else {
                System.out.println("Insuficiente");
                break;
            }
        }

        

    }
    
}