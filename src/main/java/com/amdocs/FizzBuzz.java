package com.amdocs;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    // Holds the multiples. The code can be scaled up by adding more multiples to the list...
    private int arrMult [] = {3,5};
    // Tags for multiples to print. The size must be same as arrMult.
    // We do not check the size in this version as both arrays are hardcoded...
    private String arrLables [] = {"Fizz","Buzz"};

    // we will use LinedList as an optimal collection
    // for iterations and appending to the tail
    private List resPerMultiple [] = null;
    // this is to hold results for combinations of multiples...
    private List resCombined = new LinkedList();

    //default constructor ...
    public FizzBuzz() {
    }

    // public constructor...
    protected FizzBuzz(int upperBound){
        System.out.println("FizzBuzz Results");
        System.out.println("==============================");

        //initialize List array as LinkedLists
        resPerMultiple = new List[upperBound];
        for (int i = 0; i < upperBound; i++){
            resPerMultiple [i] = new LinkedList<Integer>();
        }
        findMultiples(arrMult, upperBound);
    }

    //generic function for finding multiples based on given multiples array.
    //passing multiples as argument to generalize the function...
    protected void findMultiples( int i_arrMult [], int upperBound ){
        for (int i = 1; i < upperBound; i++ ){
            for(int j = 0; j < i_arrMult.length; j++){
                boolean allMult = true;
                if (i % i_arrMult[j] == 0){
                    resPerMultiple[j].add(i);
                }
                else{
                    allMult = false;
                }
                // add to combinations and remove from each list ...
                if(allMult){

                }
            }
        }
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
