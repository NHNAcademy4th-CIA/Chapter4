package org.nhnacademy.minju;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Exercise1 {

    public static StringBuilder printCapitalized() {
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        String temp;
        while (st.hasMoreTokens()) {
            temp = st.nextToken();
            if (Character.isLetter(temp.charAt(0))) {
                sb.append(Character.toUpperCase(temp.charAt((0)))).
                        append(temp.substring(1)).append(" ");
                continue;
            }
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return sb;
    }
}
