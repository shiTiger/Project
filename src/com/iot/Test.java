package com.iot;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //(023-86387823) 023-86187623
        String regex = "[abc]+";
        Pattern pattern = Pattern.compile(regex);
       Matcher matcher =  pattern.matcher("abcabc");
       int i = 0;
       while (matcher.find(i)){
           System.out.println(matcher.start()+">>>>>>>"+matcher.end()+"========="+matcher.group());
           i++;
       }
    }
}
