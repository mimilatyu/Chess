public class Pawn extends ChessPiece{
    public Pawn(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
       if (chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn) &&
               !(line == toLine && column == toColumn) &&
               chessBoard.board[toLine][toColumn]==null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) {
           if(color.equals("White")) {
               if(line==1 && (toLine - line==1 || toLine - line==2) && column==toColumn){
                   return true;
               }
               else if(line!=1 && toLine - line ==1 && column==toColumn){
                   return true;
               } else {return false;}
           } else {
               if(line==6 && (line - toLine==1 || line - toLine==2) && column==toColumn) {
                   return true;
               }
               else if(line!=6 && line - toLine==1 && column==toColumn){
                   return true;
               } else {return false;}
           }
       } else {return false;}
    }

    @Override
    public String getSymbol() {
        return "P";
    }
}
