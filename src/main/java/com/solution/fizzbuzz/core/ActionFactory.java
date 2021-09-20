package com.solution.fizzbuzz.core;

import java.util.function.Function;


public class ActionFactory {

    /* An operation either divide by 3, 5 etc. will have different messages associated
       that will be represented by the instance of this functional interface    */

    private static Function<Integer,String> function;

    public static Function<Integer,String> divideBy(Integer divisor,String message) {
        function = n -> n % divisor == 0 ? message : ""; //An action ready to be applied to an Integer
        return function;
    }
}