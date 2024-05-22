public class Queen extends ChessPiece {
    public Queen(String color) {
        super(color);
    }

    public String getColor() {
        return color;
    }

    @Override
    public boolean canMoveToPosition(int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8 ||
                toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8) {
            return false;
        }
        if (line == toLine && column == toColumn) {
            return false;
        }

        if (line == toLine || column == toColumn ||
                Math.abs(line - toLine) == Math.abs(column - toColumn)) {
            return true;
        }

        return false;
    }

    public char getSymbol() {
        return 'Q';
    }
}
