import java.io.Console;

/**
* A participant in the guess game
*
* @author Cristian Nuno
*/
class Player {
    // create an instance variable that will store the player's guess
    int number;

    /**
     * Prompt participant for their guess, which is then used to update the participant's number
     */
    public void guess() {
        // create instance of Console class
        Console c = System.console();

        // prompt user for input
        String inputString = c.readLine("I'm guessing: ");

        // cast string to int
        Integer inputInt = Integer.parseInt(inputString);

        // set value of number as the input int
        this.number = inputInt;
    }
}