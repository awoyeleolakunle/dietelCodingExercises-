package TicTacToe;

public class Board {
    private final PositionValue symbol;


    public Board(String symbol) {
        this.symbol = PositionValue.valueOf(symbol);
        Board board = new Board((String) PositionValue.EMPTY.getSymbol());

    }
}

