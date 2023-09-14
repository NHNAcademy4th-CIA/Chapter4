package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem1 {


    private static final Logger logger = LoggerFactory.getLogger(Problem1.class);

    public static void problem1(){

        Scanner sc = new Scanner(System.in);

        String str=sc.nextLine();
        System.out.println(printCapitalized(str));


    }


    public static String printCapitalized(String str){


        if(Character.isLetter(str.charAt(0))){

            str=Character.toUpperCase(str.charAt(0))+str.substring(1);
            return str;
        }
        else{
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }

    }


}
