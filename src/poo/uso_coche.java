package poo;

public class uso_coche {
    public static void main(String[] args) {

        Coche mi_coche = new Coche();

        mi_coche.establece_color("Negro");
        mi_coche.configura_asientos("no");

        System.out.println(mi_coche.dime_color());
        System.out.println(mi_coche.dime_datos_generales());
        System.out.println(mi_coche.dime_asientos());
    }
}
