/**
 * TicTacToe
 * UC4 converts a user-entered slot number (1–9) into corresponding
 * row and column indices of a 2D array.
 */
public class TicTacToe {

    /**
     * Entry point of the program. Demonstrates slot-to-index conversion
     * using a sample slot value.
     */
    public static void main(String[] args) {
        int slot = 7;
        System.out.println("Row: " + getRowFromSlot(slot));
        System.out.println("Column: " + getColFromSlot(slot));
    }

    /**
     * Converts slot number into row index using zero-based indexing.
     * Input: Slot number (1–9)
     * Output: Row index (0–2)
     */
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    /**
     * Converts slot number into column index using modulo operation.
     * Input: Slot number (1–9)
     * Output: Column index (0–2)
     */
    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }
}