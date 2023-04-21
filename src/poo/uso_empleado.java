package poo;

import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class uso_empleado {
    public static void main(String[] args) {

        int cantEmpleados = Integer.parseInt(JOptionPane.showInputDialog("cuantos empleados hay en la empresa?"));
        empleado[] mis_empleados = new empleado[cantEmpleados];
        for (int i = 0; i < mis_empleados.length; i++) {
            mis_empleados[i] = new empleado(JOptionPane.showInputDialog("nombre de empleado"),
                    Integer.parseInt(JOptionPane.showInputDialog("dime su sueldo")),
                    Integer.parseInt(JOptionPane.showInputDialog("anio de ingreso")),
                    Integer.parseInt(JOptionPane.showInputDialog("mes de ingreso")),
                    Integer.parseInt(JOptionPane.showInputDialog("dia de ingreso")));
        }
        ;
        for (empleado e : mis_empleados) {
            e.subeSueldo(Integer.parseInt(JOptionPane.showInputDialog("cuanto les quieres subir el sueldo?")));
        }

        for (int i = 0; i < mis_empleados.length; i++) {
            System.out.println("Nombre " + mis_empleados[i].dame_nombre() + " Sueldo: " + mis_empleados[i].dime_sueldo()
                    + " Fecha de ingreso " + mis_empleados[i].dimeFechaContrato());
        }
    }
}

class empleado {

    public empleado(String nomb, double suel, int agno, int mes, int dia) {
        nombre = nomb;
        sueldo = suel;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        alta_contrato = calendario.getTime();
    };

    public String dame_nombre() { // GETTER

        return nombre;
    };

    public double dime_sueldo() { // GETTER
        return sueldo;
    };

    public Date dimeFechaContrato() { // GETTER
        return alta_contrato;
    };

    public void subeSueldo(double procentaje) { // SETTER

        double aumento = sueldo * procentaje / 100;
        sueldo += aumento;
    };

    private String nombre;
    private double sueldo;
    private Date alta_contrato;
}