/**
 * TicTacToe
 * UC10 checks whether the game has ended in a draw
 * by ensuring no empty cells remain on the board.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests draw detection logic.
     */
    public static void main(String[] args) {

        // Test 1: Full board — should be a draw
        board[0][0] = 'X'; board[0][1] = 'O'; board[0][2] = 'X';
        board[1][0] = 'X'; board[1][1] = 'O'; board[1][2] = 'O';
        board[2][0] = 'O'; board[2][1] = 'X'; board[2][2] = 'X';
        System.out.println("Test 1 (full board)  → isDraw: " + isDraw()); // true

        // Test 2: One empty cell — not a draw yet
        board[2][2] = '-';
        System.out.println("Test 2 (one empty)   → isDraw: " + isDraw()); // false

        // Test 3: Entirely empty board — not a draw
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = '-';
        System.out.println("Test 3 (empty board) → isDraw: " + isDraw()); // false
    }

    /**
     * Traverses the board to check for any remaining empty cells.
     * Output: true if draw, false otherwise.
     */
    static boolean isDraw() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == '-')
                    return false;   // found an empty cell — game still ongoing
        return true;                // no empty cell found — board is full
    }
}