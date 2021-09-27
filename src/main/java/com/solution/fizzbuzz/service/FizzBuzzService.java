package com.solution.fizzbuzz.service;


import com.solution.fizzbuzz.core.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.Function;

@Service
public class FizzBuzzService {


    public ActionProcessor processor=new ActionProcessor();

    private Properties prop = new Properties();

    public FizzBuzzService() {
        configureService(processor, prop);
    }

    private void configureService(ActionProcessor actionProcessor, Properties properties) {
        try (InputStream input = FizzBuzzService.class.getClassLoader().getResourceAsStream("application.properties")) {

            properties.load(input);
            Function<Integer,String> divideBy3= ActionFactory.divideBy(3,properties.getProperty("db3")); //configurable messages to print
            Function<Integer,String> divideBy5= ActionFactory.divideBy(5,properties.getProperty("db5"));
            actionProcessor.appendAction(divideBy3); //load the actions to fire on calls
            actionProcessor.appendAction(divideBy5);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String fizzBuzz(Integer number) throws IllegalArgumentException{
        if(number>0) return processor.run(number);
        throw new IllegalArgumentException();
    }
}
