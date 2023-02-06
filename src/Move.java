public class Move {
    public Move (int position, int numSpaces){


    }

    private boolean isRed(int position){
        if (Board.getBoard().substring(position, position + 1).equals("R")){
            return true;
        }
        return false;
    }

    public int newPosition(int position, int numSpaces){
        int position2 = 0;
        if (isRed(position)){
            position2 = position + numSpaces;
        }
        else{
            position2 = position - numSpaces;
        }
        return position2;
    }

    public int newBoard()
}
