package org.nhnacademy.lsj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Problem5 {

    private static final Logger logger = LoggerFactory.getLogger(Problem5.class);

    public static void problem5(){
        double[] arr = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0,5.0};
        logger.info("최대 값 {}",checkResult(findMax(),arr));
        logger.info("최소 값 {}",checkResult(findMin(),arr));
        logger.info("배열 값 합계 {}",checkResult(sum(),arr));
        logger.info("배열의 평균 값 {}",checkResult(average(),arr));
        logger.info("{}가 배열 값과 일치하는 횟수{}",5.0,checkResult(counter(5),arr));
    }

    public static double checkResult(ArrayProcessor arrayProcessor, double[] arr) {
        return arrayProcessor.apply(arr);
    }

    public static ArrayProcessor findMax() {

        return (array) -> {
            double max = -987654321;

            for (int i = 0; i < array.length; i++) {
                max = Math.max(max, array[i]);
            }

            return max;
        };
    }

    public static ArrayProcessor findMin() {

        return (array) -> {
            double min = 987654321;

            for (int i = 0; i < array.length; i++) {
                min = Math.min(min, array[i]);
            }
            return min;
        };
    }

    public static ArrayProcessor sum() {
        return (array) -> {
            double sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        };
    }

    public static ArrayProcessor average() {
        return (array) -> {
            double sum = 0;

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum/ array.length;
        };
    }

    public static ArrayProcessor counter(double num) {

        return (array) -> {

            int count = 0;

            for (int i = 0; i < array.length; i++) {
                if (num == array[i]) {
                    count++;
                }
            }
            return count;
        };
    }


}

@FunctionalInterface
interface ArrayProcessor {
    double apply(double[] array);
}
