import javax.swing.*;

public class entrada_datos2 {
    public static void main(String[] args) {

        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        String edad_input = JOptionPane.showInputDialog("Introduce tu edad por favor");
        int edad_usuario = Integer.parseInt(edad_input);

        System.out.println("Hola " + nombre_usuario + ". Tu edad es " + edad_usuario);
        System.out.println("Y el proximo anio tendras " + (edad_usuario + 1));
    }
}