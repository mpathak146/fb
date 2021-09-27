package com.solution.fizzbuzz.fb;


import com.solution.fizzbuzz.service.FizzBuzzService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class FizzBuzzServiceTest {

    FizzBuzzService fizzBuzzService;
    @BeforeEach
    public void setup()
    {
        fizzBuzzService =new FizzBuzzService();
    }

    @Test
    public void multiples_Of_3_To_Return_Fizz() {

        assertThat(fizzBuzzService.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzzService.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void multiples_Of_5_To_Return_Buzz() {
        assertThat(fizzBuzzService.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzzService.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void multiples_Of_5_And_3_To_Return_FizzBuzz() {
        assertThat(fizzBuzzService.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzzService.fizzBuzz(30), is("FizzBuzz"));
    }
    @Test
    public void Non_Multiples_Of_3_5_Should_Return_the_NumberAsString(){
        assertThat(fizzBuzzService.fizzBuzz(4), is("4"));
        assertThat(fizzBuzzService.fizzBuzz(7), is("7"));
    }
    @Test
    public void IntegerNumberLessThan1ShouldReturnException() {
        IllegalArgumentException e1 = Assertions.assertThrows(IllegalArgumentException.class,
                ()-> fizzBuzzService.fizzBuzz(0));
        IllegalArgumentException e2 = Assertions.assertThrows(IllegalArgumentException.class,
                ()->{fizzBuzzService.fizzBuzz(-1);});
        IllegalArgumentException e3 = Assertions.assertThrows(IllegalArgumentException.class,
                ()->{fizzBuzzService.fizzBuzz(-15);});
    }
}
