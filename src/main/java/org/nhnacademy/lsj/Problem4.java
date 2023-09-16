package org.nhnacademy.lsj;

import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem4 {

    private static final Logger logger = LoggerFactory.getLogger(Problem4.class);
    public static void problem4() {


        double[] tryCount = new double[13];
        double[] diceRollCount = new double[13];

        int num;
        int count;

        for (int i = 0; i < 10000; i++) {
            num = (int) (Math.random() * 11) + 2;
            count = Problem3.printNumber(num); // num만드는데 걸린 트라이 횟수

            diceRollCount[num]++; // num 값을 가지는 주사위가 나온 횟수
            tryCount[num] += count; // num 값을 가지는 주사위를 만들기 위해 시도한 횟수
        }

        for (int i = 2; i <= 12; i++) {
            logger.info("주사위 합계는 {}  평균 롤 수는  {}",i,tryCount[i]/diceRollCount[i]);
        }
    }


}


// total 합 / 3이 나온횟수

