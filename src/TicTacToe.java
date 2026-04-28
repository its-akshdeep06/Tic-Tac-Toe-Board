/**
 * TicTacToe
 * UC6 places a player's symbol on the board at the given position.
 * This use case focuses on updating game state.
 */
public class TicTacToe {

    static char[][] board = new char[3][3];

    /**
     * Entry point of the program. Places a sample move
     * and prints the updated cell value.
     */
    public static void main(String[] args) {
        placeMove(0, 0, 'X');
        System.out.println(board[0][0]); // Expected: X
    }

    /**
     * Updates the board by placing the given symbol at
     * the specified row and column.
     * Input: Row, Column, Symbol
     * Hint: Assume the move is already validated.
     */
    static void placeMove(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}