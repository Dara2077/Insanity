import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private static ArrayList<String> board = new ArrayList<>(Arrays.asList("R", "R", "R", "R", "-", "-", "B", "B", "B", "B"));
    private final static ArrayList<Integer> SPACES = new ArrayList(Arrays.asList("\u001B[37m" + 1, "\u001B[37m" + 2, "\u001B[37m" + 3, "\u001B[37m" + 4, "\u001B[37m" + 5, "\u001B[37m" + 6, "\u001B[37m" + 7, "\u001B[37m" + 8, "\u001B[37m" + 9, "\u001B[37m" + 10));
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

    public static void printBoard(){
        ArrayList<String> tempBoard = new ArrayList<String>();
        for (int i = 0; i < board.size(); i++){
            String tempChar = "";
            if (board.get(i).equals("R")){
                tempChar = "\u001B[31m" + "R";
            }
            else if (board.get(i).equals("B")){
                tempChar = "\u001B[34m" + "B";
            }
            else{
                tempChar = "\u001B[37m" + "-";
            }
            tempBoard.add(tempChar);
        }
        System.out.println(tempBoard);
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
