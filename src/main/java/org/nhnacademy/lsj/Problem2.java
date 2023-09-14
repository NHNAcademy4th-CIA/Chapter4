package org.nhnacademy.lsj;

import java.util.Scanner;

public class Problem2 {

    public static void problem2() {

        Scanner sc = new Scanner(System.in);
        int value=0;

        String str=sc.nextLine();


        System.out.println(str);

        for(int i=0;i<str.length();i++){
            value=value*16+hexValue(str.charAt(i));
            System.out.println(value);
        }

        //System.out.println(value);


    }

    public static int hexValue(char ch) {

        if(ch>='0'&&ch<='9'){
            return ch-48;
        }


        switch (ch) {
            case 'A':
                return 10;
            case 'a':
                return 10;
            case 'B':
                return 11;
            case 'b':
                return 11;
            case 'C':
                return 12;
            case 'c':
                return 12;
            case 'D':
                return 13;
            case 'd':
                return 13;
            case 'E':
                return 14;
            case 'e':
                return 14;
            case 'F':
                return 15;
            case 'f':
                return 15;
            default:
                throw new IllegalArgumentException("16진수 수가 아닙니다.");
        }

    }

}
