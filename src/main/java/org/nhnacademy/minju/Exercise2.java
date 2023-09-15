package org.nhnacademy.minju;

import java.util.Scanner;

public class Exercise2 {
    public static int toHex() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int value = 0;

        for (int i = 0; i < str.length(); i++) {
            value = value * 16 + hexValue(str.charAt(i));
        }
        return value;
    }

    private static int hexValue(char ch) {
        if (ch >= '0' && ch <= '9') {
            return ch - '0';
        }

        switch (Character.toLowerCase(ch)) {
            case 'a':
                return 10;
            case 'b':
                return 11;
            case 'c':
                return 12;
            case 'd':
                return 13;
            case 'e':
                return 14;
            case 'f':
                return 15;
            default:
                throw new IllegalArgumentException("out of range");
        }
    }
}
