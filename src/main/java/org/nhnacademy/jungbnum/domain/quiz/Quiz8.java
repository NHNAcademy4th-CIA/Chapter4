package org.nhnacademy.jungbnum.domain.quiz;

import java.beans.Expression;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quiz8 {
    private Logger logger = LoggerFactory.getLogger(Quiz8.class);
    private Scanner scanner = new Scanner(System.in);
    public Quiz8(){
        int answer = 0;
        for(int i=0;i<10;i++)
        {
            Expressiona expression = new Expressiona();
            logger.info("{} = ",expression.print());
            if(expression.compare(scanner.nextInt()))
            {
                answer+=10;
            }
        }
        logger.info("당신의 점수는 ? {}",answer);
    }
}
class Expressiona{
    private int leftValue;
    private int rightValue;
    private int answer;
    public Expressiona(){
        leftValue=(int)(Math.random()*100)+1;
        rightValue=(int)(Math.random()*100)+1;
        answer=leftValue+rightValue;
    }
    public String print()
    {
        return leftValue + " + " + rightValue;
    }
    public boolean compare(int playerAnswer){
        return answer ==playerAnswer;
    }
}