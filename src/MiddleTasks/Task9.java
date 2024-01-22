package MiddleTasks;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        ToTable toTable = new ToTable(new int[] {1, 2, 3, 4, 5, 6}, 3, 2);
        int[][] a = toTable.resize();

        ToLine toLine = new ToLine(new int[][] {{1, 2}, {3, 4}, {5, 6}});
        int[] b = toLine.resize();

    }
}

class ToTable {
    int[] date;
    int x, y;

    public ToTable(int[] date, int x, int y) {
        this.date = date;
        this.x = x;
        this.y = y;
    }

    int[][] resize() {
        int[][] res = new int[x][y];
        int start = 0;

        for (int i = 0; i < x; i++) {
            for (int j = start; j < start + y; j++) {
                res[i][j - start] = date[j];
            }
            start += y;
        }

        return res;
    }
}

class ToLine {
    int[][] date;

    public ToLine(int[][] date) {
        this.date = date;
    }

    int[] resize(){
        int[] res = new int[date.length * date[0].length];
        int start = 0;

        for (int[] datum : date) {
            for (int j = 0; j < datum.length; j++) {
                res[start + j] = datum[j];
            }
            start += datum.length;
        }
        return res;
    }
}
