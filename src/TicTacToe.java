/**
 * TicTacToe
 * UC9 checks whether a player has won by examining
 * rows, columns, and diagonals.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Tests the win-check logic.
     */
    public static void main(String[] args) {
        // Test: X wins via top row
        board[0][0] = 'X'; board[0][1] = 'X'; board[0][2] = 'X';
        board[1][0] = 'O'; board[1][1] = 'O'; board[1][2] = '-';
        board[2][0] = '-'; board[2][1] = '-'; board[2][2] = '-';

        System.out.println("Has X won? " + hasWon('X')); // true
        System.out.println("Has O won? " + hasWon('O')); // false
    }

    /**
     * Checks all possible winning patterns for the given symbol.
     * Input: Player symbol
     * Output: true if win detected.
     */
    static boolean hasWon(char symbol) {

        // Check all 3 rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == symbol &&
                board[row][1] == symbol &&
                board[row][2] == symbol) {
                return true;
            }
        }

        // Check all 3 columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == symbol &&
                board[1][col] == symbol &&
                board[2][col] == symbol) {
                return true;
            }
        }

        // Check main diagonal (top-left → bottom-right)
        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol) {
            return true;
        }

        // Check anti-diagonal (top-right → bottom-left)
        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol) {
            return true;
        }

        return false;
    }
}