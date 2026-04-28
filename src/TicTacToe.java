import java.util.Random;

/**
 * TicTacToe
 * UC7 allows the computer to make a random valid move
 * by reusing slot conversion and validation logic.
 */
public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };
    static char computerSymbol = 'O';

    /**
     * Entry point of the program. Triggers the computer move.
     */
    public static void main(String[] args) {
        computerMove();
    }

    /**
     * Generates random slot values until a valid move is found,
     * then places the computer symbol on the board.
     */
    static void computerMove() {
        Random random = new Random();
        int row, col;

        do {
            int slot = random.nextInt(9) + 1;   // generates 1–9
            row = getRowFromSlot(slot);
            col = getColFromSlot(slot);
        } while (!isValidMove(row, col));

        placeMove(row, col, computerSymbol);
        System.out.println("Computer placed '" + computerSymbol + "' at row " + row + ", col " + col);
    }

    // ── Reused from UC4 ──────────────────────────────────────────
    static int getRowFromSlot(int slot) {
        return (slot - 1) / 3;
    }

    static int getColFromSlot(int slot) {
        return (slot - 1) % 3;
    }

    // ── Reused from UC5 ──────────────────────────────────────────
    static boolean isValidMove(int row, int col) {
        if (row < 0 || row > 2) return false;
        if (col < 0 || col > 2) return false;
        return board[row][col] == '-';
    }

    // ── Reused from UC6 ──────────────────────────────────────────
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}