package org.nhnacademy.jungbnum.domain;

import java.text.CharacterIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyString {
    private static Logger logger = LoggerFactory.getLogger(MyString.class);
    private MyString(){}
    public static List<String> capitalize(String line){
        StringTokenizer stringTokenizer= new StringTokenizer(line);
        List<String> list = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()){
            list.add(stringTokenizer.nextToken());
        }
        return list;

    }
    public static void printCapitalized(List<String> capitalize)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for(String word:capitalize)
        {
            char[] cArray = word.toCharArray();
            if(Character.isLetter(cArray[0]))
                cArray[0]=Character.toUpperCase(cArray[0]);
            stringBuilder.append(String.valueOf(cArray)).append(" ");
        }
        logger.info("{}",stringBuilder);

    }
}
