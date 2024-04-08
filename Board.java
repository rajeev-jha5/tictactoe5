import java.util.Arrays;

public class Board {
    private char[] cells;
    private static final int SIZE = 9;

    public Board() {
        cells = new char[SIZE];
        Arrays.fill(cells, ' ');
    }

    public boolean isValidMove(int move) {
        return move >= 0 && move < SIZE && cells[move] == ' ';
    }

    public void makeMove(int move, char symbol) {
        cells[move] = symbol;
    }

    public boolean isWinner(char symbol) {
        // Check rows, columns, and diagonals for a win
        return (cells[0] == symbol && cells[1] == symbol && cells[2] == symbol) ||
               (cells[3] == symbol && cells[4] == symbol && cells[5] == symbol) ||
               (cells[6] == symbol && cells[7] == symbol && cells[8] == symbol) ||
               (cells[0] == symbol && cells[3] == symbol && cells[6] == symbol) ||
               (cells[1] == symbol && cells[4] == symbol && cells[7] == symbol) ||
               (cells[2] == symbol && cells[5] == symbol && cells[8] == symbol) ||
               (cells[0] == symbol && cells[4] == symbol && cells[8] == symbol) ||
               (cells[2] == symbol && cells[4] == symbol && cells[6] == symbol);
    }

    public boolean isGameFinished() {
        for (char cell : cells) {
            if (cell == ' ') {
                return false;
            }
        }
        return true;
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i += 3) {
            System.out.println("| " + cells[i] + " | " + cells[i + 1] + " | " + cells[i + 2] + " |");
            System.out.println("-------------");
        }
    }
}
