package chineseCheckers;

public class Game {

    Matrix oBlackMap;

    public Game (int cols, int rows){
        Ranges.setSize(new Coord (cols, rows));
    }

    public void start ()
    {
        oBlackMap = new Matrix(Box.O_BLANK);

        oBlackMap.set(new Coord(295, 20), Box.O_BLACK);

        oBlackMap.set(new Coord(275, 55), Box.O_BLACK);
        oBlackMap.set(new Coord(315, 55), Box.O_BLACK);

        for (int x = 255; x < 336; x = x + 40)
            oBlackMap.set(new Coord(x, 90), Box.O_BLACK);


        for (int x = 235; x < 356; x = x + 40)
            oBlackMap.set(new Coord(x, 125), Box.O_BLACK);


        for (int x = 235; x < 356; x = x + 40)
            oBlackMap.set(new Coord(x, 466), Box.O_GREEN);

        for (int x = 255; x < 336; x = x + 40)
            oBlackMap.set(new Coord(x, 500), Box.O_GREEN);

        oBlackMap.set(new Coord(275, 534), Box.O_GREEN);
        oBlackMap.set(new Coord(315, 534), Box.O_GREEN);

        oBlackMap.set(new Coord(295, 568), Box.O_GREEN);
    }

    public Box getBox (Coord coord)
    {
        return oBlackMap.get(coord);
    }
}
