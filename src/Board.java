public class Board {
    private static String board;
    public Board(){
        board = "RRRR--BBBB";
        System.out.println(board);
    }

    public static void setBoard(String newBoard){
        board = newBoard;
    }

    public static String getBoard(){
        return board;
    }
}
