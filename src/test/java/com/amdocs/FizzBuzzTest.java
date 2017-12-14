package com.amdocs;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest extends FizzBuzz {
    @Test
    public void testFindMultiples15() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 15;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 3, 6, 9, 12", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 10", fb.getResult(1, arrLables));
        Assert.assertEquals("FizzBuzz: 15", fb.getResultCombined( arrLables));
    }

    @Test
    public void testFindMultiples100() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 100;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100", fb.getResult(1, arrLables));
        Assert.assertEquals("FizzBuzz: 15, 30, 45, 60, 75, 90", fb.getResultCombined( arrLables));
    }

}
