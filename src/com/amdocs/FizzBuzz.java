package com.amdocs;

import java.util.Scanner;

public class FizzBuzz {
    // public constructor...
    public FizzBuzz(int upperBound) {
        System.out.println("FizzBuzz Results");
        System.out.println("==============================");
        System.out.println(upperBound);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sUserInput = "";
        boolean booProceed = true;
        do  {
            System.out.println("Enter FizzBuzz upper boundary:");
            sUserInput = in.next();
            try{
                Integer inpBound = Integer.parseInt(sUserInput);
                new FizzBuzz(inpBound);
                booProceed = false;
            }catch(NumberFormatException nfe){
                System.out.println("ERROR: FizzBuzz upper boundary must be an integer !!!");
            }
        } while(booProceed);
        //System.out.println("Completed...");
    }
}
