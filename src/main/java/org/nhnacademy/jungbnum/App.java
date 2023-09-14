package org.nhnacademy.jungbnum;

import java.util.Scanner;
import org.nhnacademy.jungbnum.domain.Hexa;
import org.nhnacademy.jungbnum.domain.MyString;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(MyString.class);

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        quiz1(scanner.nextLine());
        quiz2(scanner.nextLine());
    }
    public static void quiz1(String line){

        MyString.printCapitalized( MyString.capitalize(line));
    }
    public static void quiz2(String line){
        int value = 0;
        try {
            for (int i = 0; i < line.length(); i++)
                value = value * 16 + Hexa.hexValue(line.charAt(i));
        }catch (IllegalArgumentException e)
        {
            logger.error(e.toString());
            return;
        }
        logger.info("{}",value);
    }
}
