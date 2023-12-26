public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        // NOTE: while x is less than 3, print DooBee on the same line
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee"); 
            x++;
        }

        // NOTE: once x has a value of 3, add Do to the same line
        if(x == 3){
            System.out.print("Do"); 
        }
    }
}