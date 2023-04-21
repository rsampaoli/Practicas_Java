package poo;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class uso_coche {
    public static void main(String[] args) {

        Coche mi_coche = new Coche();

        mi_coche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche"));
        mi_coche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
        mi_coche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?"));

        System.out.println(mi_coche.dime_color());
        System.out.println(mi_coche.dime_datos_generales());
        System.out.println(mi_coche.dime_asientos());
        System.out.println(mi_coche.dime_climatizador());
        System.out.println(mi_coche.dime_peso_coche());
        System.out.println("El precio final del coche es " + mi_coche.precio_coche() + " Euros");
    }
}
