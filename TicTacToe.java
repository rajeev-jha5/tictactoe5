public class TicTacToe {
    public static void main(String[] args) {
        Board board = new Board();
        Player player1 = new Player("Player 1", 'X');
        Player player2 = new Player("Player 2", 'O');
        boolean player1Turn = true;

        System.out.println("Welcome to Tic-Tac-Toe!");
        System.out.println("Player 1: X  Player 2: O");
        System.out.println("Let's start!");

        while (!board.isGameFinished()) {
            Player currentPlayer = player1Turn ? player1 : player2;
            board.displayBoard();
            System.out.println(currentPlayer.getName() + "'s turn.");
            int move = currentPlayer.getMove();
            while (!board.isValidMove(move)) {
                System.out.println("Invalid move. Please try again.");
                move = currentPlayer.getMove();
            }
            board.makeMove(move, currentPlayer.getSymbol());
            player1Turn = !player1Turn;
        }

        board.displayBoard();
        if (board.isWinner(player1.getSymbol())) {
            System.out.println(player1.getName() + " wins!");
        } else if (board.isWinner(player2.getSymbol())) {
            System.out.println(player2.getName() + " wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}