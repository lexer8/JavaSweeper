package sweeper;

class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
    }

    void start() {
        bombMap = new Matrix(Box.ZERO);
        placeBomb();
    }

    Box get(Coord coord){
        return bombMap.get(coord);
    }

    void placeBomb(){
        bombMap.set(Ranges.getRandomCoord(), Box.BOMB);
    }
}
