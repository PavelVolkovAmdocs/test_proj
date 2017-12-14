package com.amdocs;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest extends FizzBuzz {
    @Test
    public void testFind2Multiples15() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 15;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 3, 6, 9, 12", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 10", fb.getResult(1, arrLables));
        Assert.assertEquals("FizzBuzz: 15", fb.getResultCombined( arrLables));

        fb.clean();
    }

    @Test
    public void testFind2Multiples0Negative() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 0;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz:", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz:", fb.getResult(1, arrLables));
        Assert.assertEquals("FizzBuzz:", fb.getResultCombined( arrLables));

        fb.clean();
    }


    @Test
    public void testFindNoMultiples15Negative() throws Exception {
        int arrMult [] = {};
        final int upper = 15;
        String arrLables [] = {};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("", fb.getResult(0, arrLables));
        Assert.assertEquals("", fb.getResult(1, arrLables));
        Assert.assertEquals("", fb.getResultCombined( arrLables));

        fb.clean();
    }

    @Test
    public void testFind2Multiples100() throws Exception {
        int arrMult [] = {3,5};
        final int upper = 100;
        String arrLables [] = {"Fizz","Buzz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 10, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100", fb.getResult(1, arrLables));
        Assert.assertEquals("FizzBuzz: 15, 30, 45, 60, 75, 90", fb.getResultCombined( arrLables));

        fb.clean();
    }

    @Test
    public void testFind3Multiples20() throws Exception {
        int arrMult [] = {2,5,10};
        final int upper = 20;
        String arrLables [] = {"Fizz","Buzz","Shmaz"};

        FizzBuzz fb = new FizzBuzz(upper);
        fb.findMultiples(arrMult, upper);

        Assert.assertEquals("Fizz: 2, 4, 6, 8, 12, 14, 16, 18", fb.getResult(0, arrLables));
        Assert.assertEquals("Buzz: 5, 15", fb.getResult(1, arrLables));
        Assert.assertEquals("Shmaz:", fb.getResult(2, arrLables));
        Assert.assertEquals("FizzBuzzShmaz: 10, 20", fb.getResultCombined( arrLables));

        fb.clean();
    }

}
