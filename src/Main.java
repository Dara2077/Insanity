import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Insanity!");
        System.out.println(Board.getSpaces());
        System.out.println(Board.getBoard());
        while (!Board.hasWon()){
            System.out.print("Choose a space: ");
            int position = scan.nextInt() -1;
            System.out.print("What is the new position? ");
            int newPosition = scan.nextInt() - 1;
            Move myMove = new Move(position, newPosition);
            myMove.makeMove();
            System.out.println(Board.getSpaces());
            System.out.println(Board.getBoard());
        }
        System.out.println("You win! It took you __ moves!");
    }
}
