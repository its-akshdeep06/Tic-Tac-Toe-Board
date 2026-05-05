/**
 * TicTacToe
 * UC8 controls the continuous game loop and alternates
 * turns until the game ends.
 */
public class TicTacToe {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    // --- Assumed to exist from UC1–UC7 ---
    static char[][] board = new char[3][3];
    static char humanSymbol;
    static char computerSymbol;

    /**
     * Entry point of the program. Demonstrates the structure
     * of a continuous game loop.
     */
    public static void main(String[] args) {
        initializeBoard();
        tossAndAssignSymbols();
        displayTossResult();
        printBoard();

        startGameLoop();
    }

    /**
     * UC8 Core: Runs the game loop, alternating turns between human
     * and computer until a win or draw condition is detected.
     */
    static void startGameLoop() {
        int totalMoves = 0; // tracks filled cells to detect draw

        while (!gameOver) {

            if (isHumanTurn) {
                System.out.println("\n>> Your turn (" + humanSymbol + ")");
                humanMove();
            } else {
                System.out.println("\n>> Computer's turn (" + computerSymbol + ")");
                computerMove();
            }

            totalMoves++;
            printBoard();

            // Check win
            if (checkWin(isHumanTurn ? humanSymbol : computerSymbol)) {
                if (isHumanTurn) {
                    System.out.println("🎉 You win!");
                } else {
                    System.out.println("💻 Computer wins!");
                }
                gameOver = true;

            // Check draw
            } else if (totalMoves == 9) {
                System.out.println("🤝 It's a draw!");
                gameOver = true;

            // Switch turn
            } else {
                isHumanTurn = !isHumanTurn;
            }
        }

        System.out.println("Game Over. Thanks for playing!");
    }

    // -------------------------------------------------------
    // Stub placeholders — implemented in UC3–UC7
    // -------------------------------------------------------

    static void initializeBoard() { /* UC1 */ }
    static void tossAndAssignSymbols() { /* UC2 */ }
    static void displayTossResult() { /* UC2 */ }
    static void printBoard() { /* UC1 */ }
    static void humanMove() { /* UC3 */ }
    static void computerMove() { /* UC4/UC5 */ }

    static boolean checkWin(char symbol) { /* UC6 */ return false; }
}