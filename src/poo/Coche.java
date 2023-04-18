package poo;

public class Coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso;
    private String color;
    private int peso_final;
    private boolean asientos_cuero, climatizador;

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

    public String dime_datos_generales() { // NETODO GETTER
        return "La plataforma del vehículo tiene " + ruedas + " ruedas." + " Mide " + largo / 1000
                + " metros, con un ancho de " + ancho + " CM" + ". Y un peso de plataforma de " + peso + " KG";
    }

    public void establece_color(String color_coche) { // METODO SETTER (setea un valor a un dato, lleva void porque no
                                                      // devuelve)
        /* color = "azul"; */
        color = color_coche;
    }

    public String dime_color() { // METODO GETTER PARA AVERIGUAR EL COLOR
        return "El color del coche es " + color;
    }

    public void configura_asientos(String asientos_cuero) { // METODO SETTER
        if (asientos_cuero == "si") {
            this.asientos_cuero = true;
        } else {
            this.asientos_cuero = false;
        }
    }

    public String dime_asientos() { // METODO GETTER
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "EL coche tiene asientos de serie";
        }
    }
}
