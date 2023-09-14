package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem2 {

    private static final Logger logger = LoggerFactory.getLogger(Problem2.class);
    public static void problem2() {

        Scanner sc = new Scanner(System.in);
        int value=0;

        String str=sc.nextLine();


        for(int i=0;i<str.length();i++){
            value=value*16+hexValue(str.charAt(i));
        }

        logger.info("정답 값 : {}",value);


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
