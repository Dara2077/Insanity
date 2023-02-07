import java.util.ArrayList;

public class Move {

    private int initialPosition;
    private int newPosition;
    public Move (int initialPosition, int newPosition){
        this.initialPosition = initialPosition;
        this.newPosition = newPosition;
    }

    private boolean isRed(){
        if (Board.getBoard().get(initialPosition).equals("R")){
            return true;
        }
        return false;
    }

    public boolean validMove(){
        boolean test1 = false;
        boolean test2 = false;
        //Test 1
        if (isRed()){
            test1 = newPosition > initialPosition;
        }
        else{
            test1 = newPosition < initialPosition;
        }
        if (Board.getBoard().get(newPosition).equals("-")){
            test2 = true;
        }
        return test1 && test2;
    }

    public void makeMove(){
        if (validMove()){
            String character = "";
            Boolean isRed = isRed();
            if (isRed){
                character = "R";
            }
            else{
                character = "B";
            }
            ArrayList<String> tempBoard = Board.getBoard();
            tempBoard.add(newPosition, character);
            if (isRed){
                tempBoard.remove(initialPosition);
            }
            else{
                tempBoard.remove(initialPosition + 1);
            }
            Board.setBoard(tempBoard);

            //Have to see if it matches win condition by comparing aray lists
        }
    }
}
