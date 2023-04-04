import java.util.Scanner;

public class entrada_datos_condicionales {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre por favor");
        int edad_usuario = entrada.nextInt();
        if (edad_usuario < 18) {
            System.out.println("No podes pasar, sos menor");
        } else if (edad_usuario < 40) {
            System.out.println("Adelante senior");
        } else {
            System.out.println("vaya a casa buen hombre");
        }
    }
}