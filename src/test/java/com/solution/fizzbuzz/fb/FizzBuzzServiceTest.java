package com.solution.fizzbuzz.fb;


import com.solution.fizzbuzz.service.FizzBuzzService;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class FizzBuzzServiceTest {

    FizzBuzzService fizzBuzzService =new FizzBuzzService();

    @Test
    public void multiples_Of_3_To_Return_Fizz() {

        assertThat(fizzBuzzService.fizzBuzz(102), is("Fizz"));
    }

    @Test
    public void multiples_Of_5_To_Return_Buzz() {
        assertThat(fizzBuzzService.fizzBuzz(55), is("Buzz"));
    }

    @Test
    public void multiples_Of_5_And_3_To_Return_FizzBuzz() {
        assertThat(fizzBuzzService.fizzBuzz(15), is("FizzBuzz"));

    }
    @Test
    public void multiples_Of_None_Of_3_5_Should_Return_Same_Value() {

        assertThat(fizzBuzzService.fizzBuzz(4), is("4"));
    }
}
