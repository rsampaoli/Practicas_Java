package poo;

import java.util.*;

public class uso_empleado {
    public static void main(String[] args) {

    }

}

class empleado {

    public empleado(String nomb, double suel, int agno, int mes, int dia) {

        nombre = nomb;
        sueldo = suel;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        alta_contrato = calendario.getTime();
    }

    public String dame_nombre() { // GETTER

        return nombre;
    };

    public double dime_sueldo() { // GETTER
        return sueldo;
    }

    public Date dimeFechaContrato() { // GETTER
        return alta_contrato;
    }

    public void subeSueldo(double procentaje) {

        double aumento = sueldo * procentaje / 100;
        sueldo += aumento;

    }

    private String nombre;
    private double sueldo;
    private Date alta_contrato;
}