package org.nhnacademy.minju;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise8 {
    /**
     * 덧셈 퀴즈 10문제
     * 문제 - 답 입력 후 다시 문제-답으로 출력
     * 정답 -> 정답, 오답 -> 정답
     * 점수(각 10점)
     */
    private static final Logger logger = LoggerFactory.getLogger(Exercise8.class);

    public static void quiz() {
        int[][] quizList = createQuiz();
        int[] answer = administerQuiz(quizList);
        gradeQuiz(quizList, answer);
    }

    private static int[][] createQuiz() {
        // 퀴즈 생성
        int[][] quizList = new int[10][2];

        for (int i = 0; i < 10; i++) {
            quizList[i][0] = (int) (Math.random() * 100) + 1;
            quizList[i][1] = (int) (Math.random() * 100) + 1;
        }
        return quizList;
    }

    private static int[] administerQuiz(int[][] quizList) {
        // 퀴즈 관리(console)
        Scanner scanner = new Scanner(System.in);
        int[] answer = new int[10];
        for (int i = 0; i < quizList.length; i++) {
            logger.info("quiz {} : {} + {} = ?", (i + 1), quizList[i][0], quizList[i][1]);
            answer[i] = scanner.nextInt();
        }
        return answer;
    }

    private static void gradeQuiz(int[][] quizList, int[] userAnswer) {
        // 점수
        int count = 0;
        for (int i = 0; i < quizList.length; i++) {
            int answer = quizList[i][0] + quizList[i][1];
            if (answer == userAnswer[i]) {
                logger.info("정답입니다. 답은 {} 입니다.", answer);
                count++;
                continue;
            }
            logger.info("오답입니다. 정답은 {} 입니다.", answer);
        }
        logger.info("문제 당 10점, 총 {}점입니다.", count * 10);
    }
}
