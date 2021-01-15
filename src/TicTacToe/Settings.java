package TicTacToe;

import javafx.scene.control.Slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Settings extends JFrame {
    private static final int WIN_WIDTH = 350;
    private static final int WIN_HEIGHT = 270;
    private static final int MIN_LENGTH_FIELD = 3;
    private static final int MAX_LENGTH_FIELD = 10;
    private static final int MIN_LENGTH_WIN = 3;
    private static final String FIELD_LENGTH_TEXT = "Размер Поля ";
    private static final String LENGTH_WIN_TEXT = "Выигрышная Длина ";
    private MainWindow mainWindow;
    private JRadioButton humVsAi;
    private JRadioButton humVsHum;
    private JSlider sliderFieldSize;
    private JSlider sliderWinSize;


    Settings(MainWindow mainWindow) {
        setTitle("Настройки Игры");
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setResizable(false);
        this.mainWindow = mainWindow;
        Rectangle gameWindowsBounds = mainWindow.getBounds();
        int posX = (int) gameWindowsBounds.getCenterX() - WIN_WIDTH / 2;
        int posY = (int) gameWindowsBounds.getCenterY() - WIN_HEIGHT / 2;
        setLocation(posX, posY);
        setLayout(new GridLayout(10, 1));
        JButton btnGame = new JButton("Начать Игру");
        btnGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnStartGame();
            }
        });

        addGameModeSettings();
        addFieldSizeControl();
        add(btnGame);


    }

    private void addGameModeSettings() {
        add(new JLabel("Выберите Режим Игры"));
        humVsAi = new JRadioButton("Человек Vs Компьютер", true);
        humVsHum = new JRadioButton("Человек Vs Человек");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(humVsAi);
        buttonGroup.add(humVsHum);

        add(humVsAi);
        add(humVsHum);


    }

    private void addFieldSizeControl() {
        JLabel fieldLength = new JLabel(FIELD_LENGTH_TEXT + MIN_LENGTH_FIELD);
        JLabel winLength = new JLabel(LENGTH_WIN_TEXT + MIN_LENGTH_WIN);

        sliderFieldSize = new JSlider(MIN_LENGTH_FIELD, MAX_LENGTH_FIELD, MIN_LENGTH_FIELD);
        sliderFieldSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int currentValue = sliderFieldSize.getValue();
                fieldLength.setText(FIELD_LENGTH_TEXT + currentValue);
                sliderWinSize.setMaximum(currentValue);
            }
        });
        sliderWinSize = new JSlider(MIN_LENGTH_WIN, MIN_LENGTH_FIELD, MIN_LENGTH_FIELD);

        sliderWinSize.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                winLength.setText(LENGTH_WIN_TEXT + sliderWinSize.getValue());
            }
        });
        add(new JLabel("Выберите Размер Поля:"));
        add(fieldLength);
        add(sliderFieldSize);
        add(new JLabel("Выберите Выигрышную Позицию:"));
        add(winLength);
        add(sliderWinSize);

    }

    private void btnStartGame() {
        int gameMode;
        if (humVsAi.isSelected()){
            gameMode=GameMap.HVSAI;
        }
        else if (humVsHum.isSelected()){
            gameMode=GameMap.HVSH;
        }else {
            throw new RuntimeException("Неизвестный режим игры");
        }
        int fieldSize=sliderFieldSize.getValue();
        int winSize= sliderWinSize.getValue();

        mainWindow.startGame(gameMode,fieldSize,fieldSize,winSize);
        setVisible(false);
    }
}