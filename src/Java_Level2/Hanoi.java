package Java_Level2;

public class Hanoi {

    public static void solve(int n, char from, char to, char aux) {

        // Caso base: solo un disco
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }

        // Paso 1: mover n-1 al auxiliar
        solve(n - 1, from, aux, to);

        // Paso 2: mover el disco grande
        System.out.println("Move disk " + n + " from " + from + " to " + to);

        // Paso 3: mover n-1 al destino
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        solve(3, 'A', 'C', 'B');
    }
}
