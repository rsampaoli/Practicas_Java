public class uso_arrays {
    public static void main(String[] args) {

        int[] mi_array = new int[5];
        int mi_array_2[] = { 3, 4, -15, 34, 32 };

        mi_array[0] = 5;
        mi_array[1] = 15;
        mi_array[2] = 44;
        mi_array[3] = 3333;
        mi_array[4] = 54423;

        // asignando valores a cada espacio de la matriz/array/vector

        System.out.println(mi_array[3]);

        // para imprimir todos los valores de la matriz/array/vector

        for (int i = 0; i < mi_array.length; i++) {
            System.out.println("valor del indice " + i + " es " + mi_array[i]);
        }

    }

}
