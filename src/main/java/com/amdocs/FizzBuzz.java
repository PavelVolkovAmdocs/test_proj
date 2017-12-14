package com.amdocs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    // Holds the multiples. The code can be scaled up by adding more multiples to the list...
    private static int arrMult [] = {3,5};
    // Tags for multiples to print. The size must be same as arrMult.
    // We do not check the size in this version as both arrays are hardcoded...
    private static String arrLables [] = {"Fizz","Buzz"};

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
    }

    //generic function for finding multiples based on given multiples array.
    //passing multiples as argument to generalize the function...
    protected void findMultiples( int i_arrMult [], int upperBound ){
        for (int i = 1; i <= upperBound; i++ ){
            boolean allMult = true;
            for(int j = 0; j < i_arrMult.length; j++){
                if (i % i_arrMult[j] == 0){
                    resPerMultiple[j].add(i);// same as addLast here
                }
                else{
                    allMult = false;
                }
            }
            // add to combinations and remove from each list ...
            if(allMult){
                resCombined.add(i);
                //remove last from each list
                for(int k = 0; k < i_arrMult.length; k++) {
                    ((LinkedList)resPerMultiple[k]).removeLast();
                }
            }
        }
    }

    protected String getResultCombined (String i_arrLables[]){
        StringBuffer buf = new StringBuffer();
        //print combination:
        for(int j = 0; j < i_arrLables.length; j++) {
            buf.append(i_arrLables[j]);
        }
        buf.append(":");

        Iterator iter = resCombined.iterator();
        while(iter.hasNext()){
            Integer i = (Integer)iter.next();
            buf.append(" " + i);
            if(iter.hasNext())
                buf.append(",");
        }

        return buf.toString();
    }

    protected String getResult(int num, String i_arrLables[]){
        StringBuffer buf = new StringBuffer();
        if(resPerMultiple.length > num){
            buf.append(i_arrLables[num] + ":");
            Iterator iter = resPerMultiple[num].iterator();
            while(iter.hasNext()){
                Integer i = (Integer)iter.next();
                buf.append(" " + i);
                if(iter.hasNext())
                    buf.append(",");
            }

        }
        return buf.toString();
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
                FizzBuzz fb = new FizzBuzz(inpBound);
                fb.findMultiples(arrMult, inpBound);
                System.out.println(fb.getResult(0, arrLables));
                System.out.println(fb.getResult(1, arrLables));
                System.out.println(fb.getResultCombined( arrLables));

                booProceed = false;
            }catch(NumberFormatException nfe){
                System.out.println("ERROR: FizzBuzz upper boundary must be an integer !!!");
            }
        } while(booProceed);
        //System.out.println("Completed...");
    }
}
