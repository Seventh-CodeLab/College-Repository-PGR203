public class Minesweeper {
    private String[] board;

    public Minesweeper(String[] strings) {
        this.board = strings;
    }

    public Object[] calculateHints() {
        String[] hintBoard = new String[this.board.length];
        for(int colIndex = 0; colIndex < hintBoard.length; colIndex++) {
            hintBoard[colIndex] = ""; //Set up empty String for concat.
            for (int rowIndex = 0; rowIndex < hintBoard[colIndex].length(); rowIndex++) {
                int mines = 0;

                //Check surrounding cells
                for(int i = -1; i < 2; i++){
                    for(int j = -1; j < 2; j++){
                        try{
                            if(board[colIndex+i].charAt(rowIndex+j) == '*'){
                                mines++;
                            }
                        } catch (ArrayIndexOutOfBoundsException e){
                            //Hackiest way to avoid going out of bounds :)
                        }

                    }
                }

                hintBoard[colIndex] += mines + "";
            }
        }
        return hintBoard;
    }
}
