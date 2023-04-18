package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    String color;
    int peso_final;
    boolean asientos_cuero, climatizador;

    public Coche() {
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;
    }

    public String dime_largo() { // METODO GETTER (informa datos, necesita un return para devolver y mostrar el
                                 // dato)
        return " El largo del coche es " + largo;
    }

    public void establece_color() { // METODO SETTER (setea un valor a un dato, lleva void porque no devuelve)
        color = "azul";
    }

    public String dime_color() { // METODO GETTER PARA AVERIGUAR EL COLOR 
        return "El color del conche es " + color; 
    }
}
