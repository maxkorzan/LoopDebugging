import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {
        //declare vars
        Scanner keyboard = new Scanner(System.in);
        String userInput = "c";

        //loop prompt+repeat until user enters blank
        while (!(userInput.equals(""))) {
            System.out.print("Enter value: ");
            userInput = keyboard.nextLine();
            System.out.println(userInput);
        }

    }
    //It depends. If you're using nextLine(),
    // a blank line will be read in as an empty String.
    // This means that if you were to store the blank line in a String variable,
    // the variable would hold "". It will NOT store " " or however many spaces were placed.
    // If you're using next() then it will not read blank lines at all.
    // They are completely skipped.
}
