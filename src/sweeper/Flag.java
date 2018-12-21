package sweeper;

class Flag {

    private Matrix flagMap;
    private int totalFlaged;
    private int totalClosed;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
        totalFlaged = 0;
        totalClosed = Ranges.getSquare();
    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
        totalClosed--;
    }

    int getTotalFlaged() {
        return totalFlaged;
    }

    int getTotalClosed() {
        return totalClosed;
    }

    private void setFlaggedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
        totalFlaged++;
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
        totalFlaged--;
    }

    void toggleFlaggedToBox(Coord coord) {

        switch (flagMap.get(coord)) {
            case FLAGED: {
                setClosedToBox(coord);
                break;
            }
            case CLOSED: {
                setFlaggedToBox(coord);
                break;
            }
        }
    }

    void setFlagedToLastClosedBoxes() {
        for (Coord coord : Ranges.getAllCoords()){
            if (Box.CLOSED == flagMap.get(coord)){
                setFlaggedToBox(coord);
            }
        }
    }

    void setBombedToBox(Coord coord) {
        flagMap.set(coord, Box.BOMBED);
    }
}
