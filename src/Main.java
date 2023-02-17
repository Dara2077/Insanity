import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Insanity!");
        System.out.println("\u001B[37m" + Board.getSpaces());
        Board.printBoard();
        while (!Board.hasWon()){
            System.out.print("Choose a space: ");
            int position = scan.nextInt() -1;
            System.out.print("What is the new position? ");
            int newPosition = scan.nextInt() - 1;
            Move myMove = new Move(position, newPosition);
            myMove.makeMove();
            System.out.println("\u001B[37m" + Board.getSpaces());
            Board.printBoard();
            Board.checkWin();
        }
        System.out.println("\u001B[37m" + "You win! It took you " + Move.getMoveCount() + " moves!");
    }
}
