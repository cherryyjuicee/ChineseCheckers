import javax.swing.*;
import java.awt.*;
import java.util.*;
import chineseCheckers.*;
import chineseCheckers.Box;

public class ChineseCheckers extends JFrame
{
    private Game game;

    private JPanel panel;
    private final int COLS = 600;
    private final int ROWS = 600;

    public static void main(String[] args)
    {
        new ChineseCheckers();
    }

    private ChineseCheckers ()
    {
        game = new Game (COLS, ROWS);
        game.start();
        setImages();
        initPanel();
        initFrame();
    }

    private void initPanel ()
    {
        panel = new JPanel()
        {
            @Override
            protected void paintComponent (Graphics g)
            {
                super.paintComponent(g);
                g.drawImage((Image) Box.BOARD.image, 0, 0, this);
                for (Coord coord : Ranges.getAllCoords())
                {
                    g.drawImage((Image) game.getBox(coord).image, coord.x, coord.y, this);
                }
            }
        };

        panel.setPreferredSize(new Dimension(620, 620));
        add(panel);
    }

    private void initFrame ()
    {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Китайские шашки");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void setImages ()
    {
        for (Box box : Box.values())
            box.image = getImage(box.name());
    }

    private Image getImage (String name)
    {
        String filename = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(filename));
        return icon.getImage();
    }
}
