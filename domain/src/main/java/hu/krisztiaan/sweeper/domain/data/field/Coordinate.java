package hu.krisztiaan.sweeper.domain.data.field;

/**
 * Created by krisz on 2015. 10. 13..
 */
public class Coordinate {
    private final int x, y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
