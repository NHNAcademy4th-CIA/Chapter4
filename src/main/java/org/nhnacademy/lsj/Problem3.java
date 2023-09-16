package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem3 {


    private static final Logger logger = LoggerFactory.getLogger(Problem3.class);

    public static void problem3() {

        Scanner sc = new Scanner(System.in);

        int diceSum = sc.nextInt();

        logger.info("총 시도 횟수는 {}", printNumber(diceSum));

    }

    public static int printNumber(int diceSum) {

        if (!(diceSum >= 2 && diceSum <= 12)) {
            throw new IllegalArgumentException("잘못된 입력입니다. 입력은 오직 2-12의 숫자만 가능합니다");
        }

        int count = 0;

        int num1;
        int num2;
        do {
            num1 = (int) (Math.random() * 6 + 1);
            num2 = (int) (Math.random() * 6 + 1);
            count++;
        } while (num1 + num2 != diceSum);

        return count;


    }

}
