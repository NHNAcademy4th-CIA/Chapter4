package org.nhnacademy.lsj;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem8 {

    private static final Logger logger = LoggerFactory.getLogger(Problem8.class);

    public static void problem8() {

        Quiz[] question = getQuizArray();
        int[] answer = getAnswerArray(question);
        printQuizResult(question,answer);

    }

    public static void printQuizResult(Quiz[]question,int[]answer){ // 퀴즈 결과 출력
        int count=0;
        for(int i=0;i<question.length;i++){
            if(question[i].getAnswer()==answer[i]){
                logger.info("{}번 문제 정답입니다.",i+1);
                count++;
                continue;
            }
            logger.info("{}번 문제 틀렸습니다. 정답은 {}입니다.",i+1,question[i].getAnswer());
        }
        logger.info("최종 점수는 {}점 입니다.",count);
    }
    public static Quiz[] getQuizArray() { // 퀴즈 배열 생성
        Quiz[] quizs = new Quiz[10];

        for (int i = 0; i < 10; i++) {
            quizs[i] = new Quiz(); // 생성자 통해서 알아서 만들어짐
        }
        return quizs;
    }



    public static int[] getAnswerArray(Quiz[]question){ // 사용자가 퀴즈 정답 입력
        Scanner sc= new Scanner(System.in);

        int []answer= new int[10];

        for(int i=0;i< question.length;i++){
            logger.info("{}",question[i]);
            answer[i]=sc.nextInt();
        }
        return answer;
    }


}

class Quiz {

    private int number;
    private int number2;

    public int getAnswer() {
        return answer;
    }

    private int answer;

    public Quiz() { // 퀴즈 생성 서브루틴
        this.number = (int) (Math.random() * 200) + 1;
        this.number2 = (int) (Math.random() * 200) + 1;
        this.answer = this.number + this.number2;
    }

    @Override
    public String toString() {
        return "퀴즈입니다 " + this.number + " + " + this.number2 + " 값을 입력해 주세요";
    }
}
