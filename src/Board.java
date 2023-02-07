import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private static ArrayList<String> board;
    private static boolean win = false;
    public Board(){
        String[] initial = {"R", "R", "R", "R", "-", "-", "B", "B", "B", "B"};
        ArrayList<String> board = new ArrayList<>(Arrays.asList(initial));
    }

    public static void setBoard(ArrayList<String> newBoard){
        board = newBoard;
    }

    public static ArrayList<String> getBoard(){
        return board;
    }

    public static boolean hasWon(){
        return win;
    }
}
