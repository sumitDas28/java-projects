package com.github.sumitdas28.solid.singleresp.good;

public class Validation {

    public static boolean isValid(Pair pair){

        String firstNum = pair.getFirstNum();
        String secondNum = pair.getSecondNum();

        if(firstNum==null){
            return false;
        }

        try{
            Integer.parseInt(firstNum);
        } catch (NumberFormatException nfe){
            return false;
        }

        if(secondNum==null){
            return false;
        }

        try{
         Integer.parseInt(secondNum);
        } catch (NumberFormatException nfe){
            return false;
        }

        return true;
    }
}
