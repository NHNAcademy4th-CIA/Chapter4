package org.nhnacademy.minju;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise4 {

    /**
     * 주어진 합계를 10000번 얻음
     * -> 합계[0]번은 n번 구름
     * 합계[1]은 m번 구름
     * ...
     * 총합 / 3이 나온 횟수
     */
    private static final Logger logger = LoggerFactory.getLogger(Exercise4.class);

    public static void averageNumberOfRolls() {
        logger.info("Total on Dice         Average Number of Rolls");
        logger.info("-------------         -----------------------");
        for (int i = 2; i <= 12; i++) {
            logger.info("     {}                  {}", i, totalTimes(i));
        }
    }

    /**
     * @param target sum of dice
     * @return avg roll
     */
    private static double totalTimes(int target) {
        double sum = 0;
        for (int i = 0; i < 10000; i++) {
            sum += Exercise3.snakeEyes(target);
        }
        return sum / 10000;
    }
}
