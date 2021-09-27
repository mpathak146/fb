package com.solution.fizzbuzz.core;


import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ActionProcessor {

    //Ordered collection to hold the actions that requires execution in specific order

    private final CopyOnWriteArrayList<Function<Integer,String>> actionList ;

    public ActionProcessor() {
        actionList = new CopyOnWriteArrayList<>();
    }
    public void appendAction(Function<Integer,String> function) {
        this.actionList.add(function);
    }
    public String run(int rollNum) {
        String actString = this
                .actionList
                .parallelStream()
                .map(a -> a.apply(rollNum))
                .collect(Collectors.joining());
        return actString.equals("") ? String.valueOf(rollNum) : actString;
    }
}