package com.solution.fizzbuzz.fb;

import com.solution.fizzbuzz.service.FizzBuzzService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

@SpringBootApplication
public class FbApplication {

	public static void main(String[] args) {

		//SpringApplication.run(FbApplication.class, args);
		FizzBuzzService fizzBuzzService = new FizzBuzzService();
		IntStream
				.rangeClosed(1, 99)
				.forEach(rollNum -> System.out.println(fizzBuzzService.fizzBuzz(rollNum)));

	}

}
