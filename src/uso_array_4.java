public class uso_array_4 {
    public static void main(String[] args) {
        int num_aleatorio[] = new int[150];

        for (int i = 0; i < num_aleatorio.length; i++) {
            num_aleatorio[i] = (int) Math.round(Math.random() * 100);
        }

        for (int e : num_aleatorio) {
            System.out.print("Numero " + e + ". ");
        }
    }
}
