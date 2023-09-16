package org.nhnacademy.lsj;

import java.util.Scanner;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem1 {


    private static final Logger logger = LoggerFactory.getLogger(Problem1.class);

    public static void problem1(){

        Scanner sc = new Scanner(System.in);

        StringTokenizer stk = new StringTokenizer(sc.nextLine());
        logger.info(printCapitalized(stk));

    }


    public static String printCapitalized(StringTokenizer str){


        String word;
        String answer="";
        while(str.hasMoreTokens()){
            word=str.nextToken();
            if(Character.isLetter(word.charAt(0))){ // 만약 문자면
                answer+=Character.toUpperCase(word.charAt(0))+word.substring(1)+" ";
                continue;
            }
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
        return answer;
    }


}
