import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Insanity!");
        while (!Board.hasWon()){
            System.out.print("Choose a space: ");
            int position = scan.nextInt();
            System.out.print("What is the new position? ");
            int newPosition = scan.nextInt() - 1;
            Move myMove = new Move(position, newPosition);
        }
    }
}
