package com.amdocs;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest extends FizzBuzz {
    @Test
    public void testFindMultiples() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 15;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 3, 6, 9, 12", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 10", fb.getResult(1, arrLables));
    }

}
