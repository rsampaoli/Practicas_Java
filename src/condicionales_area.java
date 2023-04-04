import java.awt.HeadlessException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class condicionales_area {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Elige una opcion: \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo");

            int figura = input.nextInt();

            switch (figura) {
                case 1:
                    int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));

                    System.out.println("El area del cuadrado es " + Math.pow(lado, 2));

                    break;

                case 2:
                    int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                    int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                    System.out.println("El area del rectangulo es " + base * altura);

                    break;

                case 3:
                    int base_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                    int altura_triangulo = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));

                    System.out.println("El area del triangulo es " + (base_triangulo * altura_triangulo) / 2);

                    break;

                case 4:
                    int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));

                    System.out.print("El area del circulo es ");
                    System.out.printf("'%1.2f'%n", Math.PI * (Math.pow(radio, 2)));

                    break;

                default:
                    System.out.println("La opcion no es correcta");
            }
        } catch (NumberFormatException | HeadlessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
