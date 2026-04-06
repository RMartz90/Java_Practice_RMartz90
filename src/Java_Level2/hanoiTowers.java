package Java_Level2;

public class hanoiTowers {
  
    // Move the discs from  tower1 to tower 3 using tower as helper
    
    public static void hanoiTowers(int discs, int tower1, int tower2, int tower3) {
        // If only 
        if (discs == 1) {
            System.out.println("Move disc of Tower " + tower1 + " to Tower " + tower3);
        } else {
            // 1) Mover n-1 discos de torre1 a torre2 usando torre3 como auxiliar
            hanoiTowers(discs - 1, tower1, tower3, tower2);
            // 2) Mover el disco restante de torre1 a torre3
            System.out.println("Mover disco de Torre " + tower1 + " a Torre " + tower3);
            // 3) Mover los n-1 discos de torre2 a torre3 usando torre1 como auxiliar
            hanoiTowers(discs - 1, tower2, tower1, tower3);
        }
    }

    public static void main(String[] args) {
        int n = 3; // puedes cambiar el número de discos
        System.out.println("Movimientos para " + n + " discos:");
        hanoiTowers(n, 1, 2, 3);
    }
}
