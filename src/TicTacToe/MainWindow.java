package TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private static final int WIN_WIDTH = 500;
    private static final int WIN_HEIGHT = 500;
    private static final int POSX = 650;
    private static final int POSY = 350;
    private Settings settings;
    private GameMap gameMap;


    MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Крестики-Нолики");
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setLocation(POSX, POSY);
        setResizable(false);
        settings = new Settings(this);
        gameMap = new GameMap();

        JButton btnStart = new JButton("Начать Игру");
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                settings.setVisible(true);
            }
        });

        JButton btnExit = new JButton("Выход");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(btnStart);
        panel.add(btnExit);
        add(panel, BorderLayout.SOUTH);
        add(gameMap);

        setVisible(true);

    }
    void startGame( int mode,int fieldSizeX,int fieldSizeY,int winLength){
       gameMap.startNewGame(mode,fieldSizeX, fieldSizeY, winLength);
    }
}
