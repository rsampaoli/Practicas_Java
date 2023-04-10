import javax.swing.JOptionPane;

public class ciclo_for {

    public static void main(String[] args) {

        boolean arroba = false;

        String mail = JOptionPane.showInputDialog("introduce tu mail por favor");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arroba = true;
            }
        }
        if (arroba == true) {
            System.out.println("es correcto");
        } else {
            System.out.println("introduzca un mail valido por favor");
        }
    }
}
