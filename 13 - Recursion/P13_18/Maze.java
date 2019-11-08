package P13_18;

import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author billy
 */
public class Maze {

    char[][] map = {
        {'*', 'S', '*', '*', '*', '*', '*', '*', '*'},
        {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
        {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'},
        {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'},
        {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'},
        {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
        {'*', '*', '*', ' ', '*', ' ', '*', ' ', '*'},
        {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
        {'*', '*', '*', '*', '*', '*', '*', 'F', '*'},};

    java.awt.Point start = new java.awt.Point();

    public Maze() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                if (map[y][x] == 'S') {
                    start.x = x;
                    start.y = y;
                }
            }
        }
        System.out.println(solveMaze(start.x, start.y));
    }

    public boolean solveMaze(int x, int y) {
        output();
        System.out.println();
        if (reachedEnd(x, y)) {
            return true;
        } else if (deadEnd(x, y)) {
            start.x = x;
            start.y = y;
            return false;
        } else {
            map[y][x] = '.';
            start.y = y;
            start.x = x;

            if (y - 1 >= 0 && solveMaze(x, y - 1)) {
                return true;
            } else if (x + 1 < map[0].length && solveMaze(x + 1, y)) {
                return true;
            } else if (y + 1 < map.length && solveMaze(x, y + 1)) {
                return true;
            } else if (x - 1 >= 0 && solveMaze(x - 1, y)) {
                return true;
            } else {
                map[y][x] = 'X';
                start.x = x;
                start.y = y;
                return false;
            }
        }
    }

    public boolean reachedEnd(int x, int y) {
        return map[y][x] == 'F';
    }

    public boolean deadEnd(int x, int y) {
        return ".*".indexOf(map[y][x]) != -1;
    }

    public void output() {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(map[y][x]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        new Maze();
    }

}
