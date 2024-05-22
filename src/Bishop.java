public class Bishop extends ChessPiece {
    public Bishop(String color) {
        super(color);
    }
    public String getColor() {
        return color;
    }
    public boolean canMoveToPosition(int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8 ||
        toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }

        if (line == toLine && column == toColumn) {
            return false;
        }

        if (Math.abs(line - toLine) == Math.abs(column - toColumn)) {
            return true;
        }
        return false;
    }

    @Override
    public char getSymbol() {
        return 'B';
    }
}
