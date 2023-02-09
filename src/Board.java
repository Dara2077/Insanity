import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private static ArrayList<String> board = new ArrayList<>(Arrays.asList("R", "R", "R", "R", "-", "-", "B", "B", "B", "B"));
    private final static ArrayList<Integer> SPACES = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
    private final static ArrayList<String> WIN = new ArrayList(Arrays.asList("B", "B", "B", "B", "-", "-", "R", "R", "R", "R"));
    private static boolean win = false;
    public Board(){
    }

    public static void setBoard(ArrayList<String> newBoard){
        board = newBoard;
    }

    public static ArrayList<String> getBoard(){
        return board;
    }

    public static ArrayList<Integer> getSpaces(){
        return SPACES;
    }

    public static boolean hasWon(){
        return win;
    }

    public static void checkWin(){
        boolean won = true;
        for (int i = 0; i < board.size(); i ++){
            if (board.get(i) != WIN.get(i)){
                won = false;
            }
        }
        if (won){
            win = true;
        }
   }

}
