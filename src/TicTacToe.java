import java.util.Scanner;

/**
 * TicTacToe
 * UC3 reads a slot number (1–9) entered by the user. This use case
 * focuses only on input handling without validation.
 */
public class TicTacToe {

    /**
     * Entry point of the program. Reads slot input and prints it back
     * to verify correct user input handling.
     */
    public static void main(String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }

    /**
     * Reads an integer slot value from the user.
     * Input: Scanner object
     * Output: Slot number (1–9)
     * Hint: Validation will be added in later use cases.
     */
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        scanner.close();
        return slot;
    }
}