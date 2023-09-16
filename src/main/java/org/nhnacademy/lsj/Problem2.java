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
            case 'a':
                return 10;
            case 'B':
            case 'b':
                return 11;
            case 'C':
            case 'c':
                return 12;
            case 'D':
            case 'd':
                return 13;
            case 'E':
            case 'e':
                return 14;
            case 'F':
            case 'f':
                return 15;
            default:
                throw new IllegalArgumentException("16진수 수가 아닙니다.");
        }

    }

}
