import javax.swing.JOptionPane;

public class uso_array_3 {
    public static void main(String[] args) {
        String paises_mundo[] = new String[10];

        for (int i = 0; i < paises_mundo.length; i++) {
            paises_mundo[i] = JOptionPane.showInputDialog("Introduce el pais");
        }
        for (String e : paises_mundo) {
            System.out.println("pais: " + e + ".");
        }
    }
}
