public class uso_array_2 {
    public static void main(String[] args) {
        String[] paises = new String[7];

        paises[0] = "Arg";
        paises[1] = "Col";
        paises[2] = "Esp";
        paises[3] = "Chl";
        paises[4] = "Ven";
        paises[5] = "Ecu";
        paises[6] = "EEUU";
        // recorrido con bucle normal
        /*
         * for (int i = 0; i < paises.length; i++) {
         * System.out.println(paises[i]);
         * }
         */
        // bucle for nuevo, for each, sabe hasta donde llegar en el array

        for (String elemento : paises) {
            System.out.println(elemento);
        }
    }
}
