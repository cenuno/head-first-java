public class Loopy {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Before the loop");

        while (x < 4) {
            System.out.println("In the loop");
            System.out.println("the value of x is: " + x);
            // NOTE: add one to the variable
            x++;
        }
        System.out.println("After the loop");
    }
}