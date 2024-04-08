import java.util.Scanner;

public class Player {
    private String name;
    private char symbol;
    private Scanner scanner;

    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getMove() {
        System.out.print("Enter your move (0-8): ");
        return scanner.nextInt();
    }
}
