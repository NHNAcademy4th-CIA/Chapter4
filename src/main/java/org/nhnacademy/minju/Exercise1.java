package org.nhnacademy.minju;

import java.util.Scanner;

public class Exercise1 {

    public static StringBuilder printCapitalized() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        char[] ch = scanner.nextLine().toCharArray();

        sb.append(Character.toUpperCase(ch[0]));
        for (int i = 1; i < ch.length; i++) {
            if (!Character.isLetter(ch[i - 1])) {
                sb.append(Character.toUpperCase(ch[i]));
            } else {
                sb.append(ch[i]);
            }
        }
        return sb;
    }
}
