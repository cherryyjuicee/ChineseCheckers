package chineseCheckers;

import java.util.ArrayList;

public class Ranges {
    private static Coord size;
    private static ArrayList<Coord> allCoords;

    public static void setSize (Coord _size) {

        size = _size;
        allCoords = new ArrayList<Coord>();

        allCoords.add(new Coord(295, 20));

        allCoords.add(new Coord(275, 55));
        allCoords.add(new Coord(315, 55));

        for (int x = 255; x < 336; x = x + 40)
            allCoords.add(new Coord(x, 90));

        for (int x = 235; x < 356; x = x + 40)
            allCoords.add(new Coord(x, 125));

        for (int x = 55; x < 546; x = x + 39)
                allCoords.add(new Coord(x, 160));

        for (int x = 75; x < 506; x = x + 39)
            allCoords.add(new Coord(x, 194));

        for (int x = 95; x < 506; x = x + 39)
            allCoords.add(new Coord(x, 228));

        for (int x = 115; x < 505; x = x + 39)
            allCoords.add(new Coord(x, 262));

        for (int x = 135; x < 466; x = x + 39)
            allCoords.add(new Coord(x, 296));


        for (int x = 115; x < 505; x = x + 39)
            allCoords.add(new Coord(x, 330));

        for (int x = 95; x < 506; x = x + 39)
            allCoords.add(new Coord(x, 364));

        for (int x = 75; x < 506; x = x + 39)
            allCoords.add(new Coord(x, 398));

        for (int x = 55; x < 546; x = x + 39)
            allCoords.add(new Coord(x, 432));

        for (int x = 235; x < 356; x = x + 40)
            allCoords.add(new Coord(x, 466));

        for (int x = 255; x < 336; x = x + 40)
            allCoords.add(new Coord(x, 500));

        allCoords.add(new Coord(275, 534));
        allCoords.add(new Coord(315, 534));

        allCoords.add(new Coord(295, 568));



    }

    public static Coord getSize () {

        return size;
    }

    public static ArrayList<Coord> getAllCoords () {
        return allCoords;
    }

    static boolean inRange (Coord coord)
    {
        return  coord.x >= 0 && coord.x < size.x &&
                coord.y >= 0 && coord.y < size.y;
    }
}
