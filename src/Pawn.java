public class Pawn extends ChessPiece {
    public Pawn(String color) {
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

        if (column != toColumn) {
            return false;
        }

        if (color.equals("White")) {
            if (line == 1 && (toLine == 2 || toLine == 3)) {
                return true;
            }

            if (line != 1 && toLine == line + 1) {
                return true;
            }
        } else if (color.equals("Black")) {
            if (line == 6 && (toLine == 5 || toLine == 4)) {
                return true;
            }

            if (line != 6 && toLine == line - 1) {
                return true;
            }
        }

        return false;
    }
    @Override
    public char getSymbol() {
        return 'P';
    }
}

