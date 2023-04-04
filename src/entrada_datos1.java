import java.util.Scanner;

public class entrada_datos1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("introducte tu nombre");
        String nombre_usuario = entrada.nextLine();
        System.out.println("introduce tu edad por favor");
        int edad_usuario = entrada.nextInt();
        System.out.println("hola " + nombre_usuario + " el a;o que viene tendras " + (edad_usuario + 1) + " a;os");
    }
}