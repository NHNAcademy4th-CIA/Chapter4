package org.nhnacademy.jungbnum.domain.quiz;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz3 {
    private Logger logger = LoggerFactory.getLogger(Quiz3.class);

    private Scanner scanner = new Scanner(System.in);
    public Quiz3(){
        int select = scanner.nextInt();
        try {
            logger.info("선택한{}가 나올떄까지 던진 주사위 횟수 : {}", select, DiceGame.matchSum(select));
            logger.info("snakeEye가 나올떄까지 던진 주사위 횟수 : {}", DiceGame.isSnakeEye());
        }catch (IllegalArgumentException e)
        {
            logger.error(e.toString());
        }
    }
}
class DiceGame {
    private static Logger logger = LoggerFactory.getLogger(Quiz3.class);

    private DiceGame() {
    }

    private static int minValue = 1;
    private static int maxValue = 12;

    private static int snakeEye = 2;

    public static int isSnakeEye() {
        int count = 0;
        while (Dice.roll() + Dice.roll() != snakeEye) {
            count++;
        }
        return count;
    }

    public static int matchSum(int selectNumber) {
        int count = 0;
        if(!isSelectNumber(selectNumber)){
            throw new IllegalArgumentException(minValue+"~"+maxValue+" 값만 입력해주세요");
        }
        while ((Dice.roll()+Dice.roll())!=selectNumber)
        {

            count++;
        }
        return count;
    }
    private static boolean isSelectNumber(int selectNumber){
        return  minValue < selectNumber && maxValue >= selectNumber;

    }

    public static int[] probability(){
        int[] arr = new int[12];
        for(int i=0;i<10000;i++)
        {
            int sum = Dice.roll()+Dice.roll();
            arr[sum-1]++;
        }
        return arr;
    }
    public static void print(){
        logger.info("Total On Dice     Average Number of Rolls");
        logger.info("-------------     -----------------------");
        int[] results = probability();
        int i=1;
        DecimalFormat df = new DecimalFormat("#.####");

        for (int result:results)
        {
            if(i==1){
                i++;
                continue;
            }
            logger.info("       {}               {}",i,df.format(result/100.0));
            i++;
        }
    }
}

class Dice {
    private static final int DICE_EYE = 6;
    private static Random random = new Random();

    private Dice() {
    }

    public static int roll() {
        return random.nextInt((DICE_EYE))+1;
    }

}