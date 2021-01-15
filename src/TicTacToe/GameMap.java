package TicTacToe;

import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {
    public static final int HVSAI=0;
    public static final int HVSH=1;

    GameMap() {
        setBackground(Color.BLACK);
        setVisible(true);
    }



    void startNewGame(int mode, int fieldSizeX, int fieldSizeY, int winLength){
        System.out.println("mode "+mode+ " "+
                "fieldSizeX "+fieldSizeX+" "+
                "fieldSizeY "+fieldSizeY+" "+
                "winLength " + winLength);
    }
}
