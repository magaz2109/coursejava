package lesson4;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    static char[][] map;
    static Scanner scanner = new Scanner(System.in);
    static char HUMAN = 'x';
    static char COMPUTER = '0';
    static char EMPTY = '_';
    static Random rnd = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(HUMAN)) {
                System.out.println("WIN HUMAN!");
                break;
            }
            if (isMapFull()) {
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(COMPUTER)) {
                System.out.println("WIN COMPUTER!");
                break;
            }
            if (isMapFull()) {
                break;
            }
        }
        System.out.println("GAME OVER");
    }

    public static boolean checkWin(char dot) {
        if (map[0][0] == dot && map[0][1] == dot && map[0][2] == dot) {
            return true;
        }
        if (map[1][0] == dot && map[1][1] == dot && map[1][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[2][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][0] == dot && map[2][0] == dot) {
            return true;
        }
        if (map[0][1] == dot && map[1][1] == dot && map[2][1] == dot) {
            return true;
        }
        if (map[0][2] == dot && map[1][2] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[0][0] == dot && map[1][1] == dot && map[2][2] == dot) {
            return true;
        }
        if (map[2][0] == dot && map[1][1] == dot && map[0][2] == dot) {
            return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rnd.nextInt(3);
            y = rnd.nextInt(3);
        } while (!isCellValid(x, y));
        map[y][x] = COMPUTER;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        if (map[y][x] == EMPTY) {
            return true;
        }
        return false;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("ENTER THE CELL:");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = HUMAN;

    }

    public static void initMap() {
        map = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.println();
        System.out.println("  1 2 3");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}