package com.amdocs;

import org.junit.Test;

public class FizzBuzzTest extends FizzBuzz {
    @Test
    public void testFindMultiples() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 15;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);
    }

}
