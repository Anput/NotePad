package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AdderTest {

    @Test
            public void add_whenOneInputIsZero_shouldReturnOtherNumber(){


                //Given
                Adder adder = new Adder();

                //When
                int result = adder.add(0,7);

                //Should
                Assertions.assertEquals(7, result);

    }



}