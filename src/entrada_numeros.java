import javax.swing.*;

public class entrada_numeros {
    public static void main(String[] args) {
        // se recibe el numero en formato string, se pasa a double y se opera, el format
        // es para decidir cuantos decimales mostrar.

        String numero1 = JOptionPane.showInputDialog("Introduce un numero por favor");
        double numero2 = Double.parseDouble(numero1);
        System.out.print("La raiz de " + numero2 + " es ");
        System.out.printf("'%1.2f'%n", Math.sqrt(numero2));
    }
}