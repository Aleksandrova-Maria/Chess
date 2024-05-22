public abstract class ChessPiece {
    protected String color;
    protected boolean check;
    public ChessPiece(String color){
        this.color = color;
        this.check = true;
    }
    public String getColor(){
        return color;
    }
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        return (line == toLine || column == toColumn);
    }
    public abstract boolean canMoveToPosition(int line, int column, int toLine, int toColumn);
    public char getSymbol() {
        return 'S';
    }
}
