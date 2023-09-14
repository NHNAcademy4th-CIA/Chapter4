package org.nhnacademy.jungbnum;

import java.util.Scanner;
import org.nhnacademy.jungbnum.domain.MyString;

/**
 * Hello world!
 */
public class App {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        quiz1(scanner.nextLine());
    }
    public static void quiz1(String line){

        MyString.printCapitalized( MyString.capitalize(line));
    }
}
