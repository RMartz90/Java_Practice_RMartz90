package Java_Level2;

public class FibonacciIterative {
    public static void main(String[] args) {
        int n = 10;

        // Primeros dos números de la secuencia
        int a = 0, b = 1;

        // Generamos n números
        for (int i = 0; i < n; i++) {
            // Imprimimos el número actual
            System.out.print(a + " ");

            // Calculamos el siguiente valor
            int next = a + b;

            // Movemos los valores:
            // b pasa a ser el nuevo a
            // next pasa a ser el nuevo b
            a = b;
            b = next;
        }
    }
}