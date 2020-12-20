package homework_3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static int mapSize = 5;
    public static int winSize = 4;
    public static final char HUMAN = 'X';
    public static final char COMPUTER = 'O';
    public static final char EMPTY_FIELD = '_';

    public static char[][] map = new char[mapSize][mapSize];
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void initMap() {
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = EMPTY_FIELD;
            }
        }
    }

    public static void printMap() {
        System.out.println("# 1 2 3 4 5");
        for (int i = 0; i < mapSize; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < mapSize; j++) {
                System.out.print(map[i][j] +"|");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Ваш ход: ");
            System.out.println("Строка:");
            x = scanner.nextInt() - 1;
            System.out.println("Столбец");
            y = scanner.nextInt() - 1;
        } while (!isValidCell(y, x) || !isEmptyCell(y, x));
        map[y][x] = HUMAN;
    }

    public static void computerTurn() {
        int x, y;
        do {
            System.out.println("Ход компьютера");
            x = random.nextInt(mapSize);
            y = random.nextInt(mapSize);
        }
        while (!isEmptyCell(y, x));
        map[y][x] = COMPUTER;


    }

    public static boolean checkWin(char symbol) {
        for (int i = 0; i < mapSize-winSize+1; i++) {
            for (int j = 0; j < mapSize-winSize+1; j++) {
                if (checkLines(symbol, i, j)||checkDiagonal(symbol, i, j)) {
                    return true;
                }

            }
        }

        return false;
    }

    private static boolean checkLines(char symbol, int vertical, int horizontal) {
        boolean x, y;
        for (int i = vertical; i < winSize + vertical; i++) {
            x = true;
            y = true;
            for (int j = horizontal; j < winSize + horizontal; j++) {
                x &= (map[i][j] == symbol);
                y &= (map[j][i] == symbol);

            }
            if (x || y)
                return true;

        }
            return false;
    }

    private static boolean checkDiagonal(char symbol, int diagonalMain, int diagonalAuxiliary) {
        boolean diagonalA=true;
        boolean diagonalB=true;
        for (int i = 0; i < winSize; i++) {
            diagonalA&=(map[i+diagonalMain][i+diagonalAuxiliary]==symbol);
            diagonalB&=(map[winSize-i-1+diagonalMain][i+diagonalAuxiliary]==symbol);

        }

        if (diagonalA||diagonalB){
            return true;}
        return false;
    }


    public static boolean isFullMap() {
        for (int y = 0; y < mapSize; y++) {
            for (int x = 0; x < mapSize; x++) {
                if (map[y][x] == EMPTY_FIELD)
                    return false;
            }
        }
        return true;
    }

    public static boolean isValidCell(int y, int x) {
        return x >= 0 && x < mapSize && y >= 0 && y < mapSize;
    }

    public static boolean isEmptyCell(int y, int x) {
        return map[y][x] == EMPTY_FIELD;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN)){
                System.out.println("Вы победили!");
                break;
            }
            if (isFullMap()){
                System.out.println("Ничья!!!");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(COMPUTER)){
                System.out.println("Компьютер победил!!!");
                break;
            }
            if (isFullMap()){
                System.out.println("Ничья!!!");
                break;
            }


        }
    }
}
