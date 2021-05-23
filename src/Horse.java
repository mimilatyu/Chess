public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if(chessBoard.checkPos(line) && chessBoard.checkPos(column) && chessBoard.checkPos(toLine) && chessBoard.checkPos(toColumn) &&
                !(line == toLine && column == toColumn) &&
                chessBoard.board[toLine][toColumn]==null || !chessBoard.board[toLine][toColumn].color.equals(this.color)) {
            if( (Math.abs(line - toLine)+Math.abs(column - toColumn)) ==3 ) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String getSymbol() {
        return "H";
    }


}
