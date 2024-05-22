public class Horse extends ChessPiece {
    public Horse(String color) {
        super(color);
    }
    public String getColor() {
        return color;
    }
    public boolean canMoveToPosition(int line, int column, int toLine, int toColumn) {
        if (line < 0 || line >= 8 || column < 0 || column >= 8 ||
        toLine < 0 || toLine >= 8 || toColumn < 0 || toColumn >= 8){
            return false;
        }

        if (line == toLine && column == toColumn) {
            return false;
        }

        int[][] possibleMoves = {
                {2, 1}, {2, -1}, {-2, 1}, {-2, -1},
                {1, 2}, {1, -2}, {-1, 2}, {-1, -2}
        };

        for (int[] move : possibleMoves) {
            if (line + move[0] == toLine && column + move[1] == toColumn) {
                return true;
            }
        }
        return false;
    }
    @Override
    public char getSymbol() {
        return 'H';
    }
}

