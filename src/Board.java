import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private static ArrayList<String> board = new ArrayList<>(Arrays.asList("R", "R", "R", "R", "-", "-", "B", "B", "B", "B"));
    private static boolean win = false;
    public Board(){
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

    public static boolean checkWin(){
        ArrayList<String> copy = new ArrayList<String>();
        ArrayList<String> win = new ArrayList<>(Arrays.asList("R", "R", "R", "R", "-", "-", "B", "B", "B", "B"));
        boolean check = true;
        for (int i = 0; i < copy.size(); i ++){
            if (!copy.get(i).equals(win.get(i))){
                check = false;
            }
        }
        return check;
    }
}
