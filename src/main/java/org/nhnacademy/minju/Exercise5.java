package org.nhnacademy.minju;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exercise5 {
    private static final Logger logger = LoggerFactory.getLogger(Exercise5.class);

    public static void checkArrayProcessor() {
        double[] array = new double[] {1.23, 2.34, 3.45, 10, -1.3, 8.7};
        logger.info("max : {}", findMax.apply(array));
        logger.info("min : {}", findMin.apply(array));
        logger.info("sum : {}", findSum.apply(array));
        logger.info("avg : {}", findAvg.apply(array));
        logger.info("counter : {}", counter(0).apply(array));
    }

    public static final ArrayProcessor findMax = array -> {
        double max = 0;
        for (double v : array) {
            max = Math.max(v, max);
        }
        return max;
    };

    public static final ArrayProcessor findMin = array -> {
        double min = array[0];
        for (double v : array) {
            min = Math.min(v, min);
        }
        return min;
    };

    public static final ArrayProcessor findSum = array -> {
        double count = 0;
        for (double v : array) {
            count += v;
        }
        return count;
    };

    private static ArrayProcessor findAvg = array -> findSum.apply(array) / array.length;

    private static ArrayProcessor counter(double value) {
        // value occurs in array
        return array -> {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (value == array[i]) {
                    count++;
                }
            }
            return count;
        };
    }

    private static double applyArray(ArrayProcessor arrayProcessor, double[] arr) {
        return arrayProcessor.apply(arr);
    }
}
