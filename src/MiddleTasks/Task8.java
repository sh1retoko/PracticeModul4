package MiddleTasks;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        Separator separator = new Separator(new int[] {1, 2, 3, 4, 5 ,6 ,7 , 8, 9, 10});
    }
}

class Separator {
    int[] array;

    public Separator(int[] array) {
        this.array = array;
    }

    int[] even() {
        int k = 0, now = 0;

        for (int i : array) {
            if (i % 2 == 0) {
                k++;
            }
        }

        int[] evenes = new int[k];

        for (int i = 0; i < evenes.length; i++) {
            if (array[i] % 2 == 0) {
                evenes[now] = array[i];
                now += 1;
            }
        }
        return evenes;
    }

    int[] odd() {
        int k = 0, now = 0;

        for (int i : array) {
            if (i % 2 != 0) {
                k++;
            }
        }

        int[] odds = new int[k];

        for (int i = 0; i < odds.length; i++) {
            if (array[i] % 2 != 0) {
                odds[now] = array[i];
                now += 1;
            }
        }

        return odds;
    }
}
