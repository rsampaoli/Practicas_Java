import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class array_bidimensional_forEach {
    public static void main(String[] args) {

        int matrix[][] = {
                { 10, 15, 18, 21, 22 },
                { 5, 10, 15, 87, 2 },
                { 1, 3, 8, 1, 2 },
                { 15, 85, 64, 29, 52 }
        };

        // para recorrer el array bidimensional

        for (int[] fila : matrix) {
            System.out.println();
            for (int z : fila) {
                System.out.print(z + " ");
            }
        }

    }

}
