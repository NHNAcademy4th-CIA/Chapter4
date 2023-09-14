package org.nhnacademy.jungbnum.domain;

public class Hexa {
    public static int hexValue(char number){
        number= Character.toUpperCase(number);
        switch (number){
            case '1': case '2': case '3': case '4': case '5': case '6': case '7': case '8': case '9':
                return Character.getNumericValue(number);
            case 'A': case 'B': case 'C': case'D': case 'E': case'F':
                return number-32;
        }
        throw new IllegalArgumentException("16진수가 아닌수가 있습니다");
    }
}
