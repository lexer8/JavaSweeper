package sweeper;

class Flag {

    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
    }

    private void setFlaggedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }

    private void setClosedToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
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
}
