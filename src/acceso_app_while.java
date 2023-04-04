import javax.swing.JOptionPane;

public class acceso_app_while {
    public static void main(String[] args) {

        String clave = "Ramiro";
        String pass_ingresada = "";

        while (clave.equals(pass_ingresada) == false) {
            pass_ingresada = JOptionPane.showInputDialog("Introduce la contrasenia");

            if (clave.equals(pass_ingresada) == false) {
                System.out.println("contrasenia incorrecta weon");
            }
        }
        System.out.println("Acceso garantizado");
    }
}
