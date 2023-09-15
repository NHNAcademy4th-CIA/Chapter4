package org.nhnacademy.minju;

import java.util.Scanner;

public class Exercise3 {

    public static int targetDiceNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 1 && number <= 12) {
            return snakeEyes(number);
        } else {
            throw new IllegalArgumentException("가능한 총계가 아닙니다.");
        }
    }

    public static int snakeEyes(int target) {
        int count = 0;
        int random1;
        int random2;

        do {
            count++;
            random1 = (int) (Math.random() * 6) + 1;
            random2 = (int) (Math.random() * 6) + 1;
        } while (random1+random2 != target);
        return count;
    }
}
