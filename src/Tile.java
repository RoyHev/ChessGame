// A Single chess tile. Total of 64 tiles in a chess board.
public abstract class Tile {

    int tileCoordinate;

    Tile(int tileCoordinate){
        this.tileCoordinate = tileCoordinate;
    }

    public abstract boolean isTileOccupied();

    public abstract Piece getPiece();

}
