public class Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        while (x > 0) {
            if (x > 2) {
                System.out.print("a");
                System.out.print("-");
            } else if (x == 2) {
                System.out.print("b c");
                System.out.print("-");
            } else if (x == 1) {
                System.out.print("d");
            }
            // NOTE: subtract one from x
            x--;
        }
    }
}