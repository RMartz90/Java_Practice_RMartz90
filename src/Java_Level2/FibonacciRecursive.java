package Java_Level2;

public class FibonacciRecursive {

    public static int fib(int n) {
        // Caso base: cuando n es 0 o 1
        if (n <= 1) return n;

        // Llamada recursiva:
        // fib(n-1) + fib(n-2)
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}
