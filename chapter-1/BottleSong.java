public class BottleSong {
    public static void main(String[] args) {
        int bottlesNum = 10;
        String noun = "bottles";
        String adjective = "green";

        while (bottlesNum > 0) {
            // NOTE: rewrite noun
            if (bottlesNum == 1) {
                noun = "bottle";
            }
            System.out.println(bottlesNum + " " + adjective + " " + noun + " hanging on the wall.");
            System.out.println(bottlesNum + " " + adjective + " " + noun + " hanging on the wall.");
            System.out.println("If 1 green bottle should accidentally fall,");
            // NOTE: reduce the number of bottles by one
            bottlesNum--;
            // NOTE: rewrite noun
            if (bottlesNum == 1) {
                noun = "bottle";
            } else if (bottlesNum == 0) {
                noun = "bottles";
            }
            System.out.println("There'll be " + bottlesNum + " " + adjective + " " + noun + " hanging on the wall.\n");
        }
    }
}