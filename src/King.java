public class King extends ChessPiece {
    public King(String color) {
        super(color);
    }
    public String getColor() {
        return color;
    }
    private int[][] board;
    @Override
    public boolean canMoveToPosition(int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8 ||
                toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }
        if (line == toLine && column == toColumn) {
            return false;
        }

        if (Math.abs(line - toLine) <= 1 && Math.abs(column - toColumn) <= 1) {
            return true;
        }

        return false;
    }
    @Override
    public char getSymbol() {
        return 'K';
    }
    public boolean isUnderAttack(ChessBoard board, int line, int column) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                ChessPiece piece = board.getPieceAt(i, j);
                if (piece != null && !piece.getColor().equals(this.color)) {
                    if (piece.canMoveToPosition(i, j, line, column)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
