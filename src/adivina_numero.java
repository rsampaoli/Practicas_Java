import java.util.Scanner;

public class adivina_numero {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int num_random = (int) (Math.random() * 100);
            int numero_ingresado = 0;
            int intentos = 0;

            System.out.println("Introduce un numero porfas");

            while (num_random != numero_ingresado) {
                intentos = intentos + 1;
                numero_ingresado = input.nextInt();
                if (num_random < numero_ingresado) {
                    System.out.print("Mas bajo");
                } else if (num_random > numero_ingresado) {
                    System.out.print("Mas alto");
                }
                System.out.println(", vuelve a ingresar un numero");
            }
            System.out.println("Correcto. Los has conseguido en " + intentos + " intentos");
        }
    }
}
