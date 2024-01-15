/**
* Define the rules of the guess game 
*
* @author Cristian Nuno
*/
class GuessGame {
    // create three instance variables for the three Player objects
    // NOTE: every time game is played, three new players are created
    Player p1;
    Player p2;
    Player p3;

    public void startGame() {
        // create three Player objects and assign them to the three instance variables
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // declare three variables to hold the players' guesses
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        // declare three variables to hold the correctness of the players' guesses
        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        // create target number that players must guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while (true) {
            System.out.println("Number to guess is " + targetNumber);

            // call each player's guess method
            p1.guess();
            p2.guess();
            p3.guess();

            // store the results
            guessP1 = p1.number;
            guessP2 = p2.number;
            guessP3 = p3.number;

            // share results
            System.out.println("Player 1 guessed " + guessP1);
            System.out.println("Player 2 guessed " + guessP2);
            System.out.println("Player 3 guessed " + guessP3);

            /**
             * Check each player's guess to see if it matches the target number.
             * 
             * When a player's guess matches, set their IsRight variable to true
             */
            if (guessP1 == targetNumber) {
                p1IsRight = true;
            } else if (guessP2 == targetNumber) {
                p2IsRight = true;
            } else if (guessP3 == targetNumber) {
                p3IsRight = true;
            }

            // as long as someone is right, end the game
            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1IsRight);
                System.out.println("Player two got it right? " + p2IsRight);
                System.out.println("Player three got it right? " + p3IsRight);
                System.out.println("Game is over. Play again sometime soon!");
                break;
            } else {
                System.out.println("No luck this time. Players will have to try again!");
            }
        }
    }
}
