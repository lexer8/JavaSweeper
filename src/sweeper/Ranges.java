package sweeper;

public class Ranges {

    private static Coord size;

    static void setSize(Coord size) {
        Ranges.size = size;
    }

    public static void setSize(int cols, int rows) {
        Coord size = new Coord(cols, rows);
        setSize(size);
    }

    public static Coord getSize() {
        return size;
    }
}
