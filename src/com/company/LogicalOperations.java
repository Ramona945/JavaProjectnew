package com.company;

public class LogicalOperations {


    public int checkBiggerNumber(int me, int you){
        if (me > you){
            return me;
        }else{
            return you;
        }
    }

    public String correctText(String input){
        if( input.equals("FastTrackIT")){
            return "Learning text comparison";
        }else{
            return"Got to try some more";
        }
    }

    String correct= "FastTrackIT";

       public String correctTextOrNot(String input){
           if(input.equals(correct)){
               return "Learning text comparison";
           }else{
               return "Got to try some more";
           }
       }


    public int verifyNumberEquals(int number) {
        if (number >= 2 && number <= 8) {
            return (number);
        }
        return 0;
    }

    public String verifyNumberAndText(String input, int anyNumber) {
        if (input.equals("FastTrackIT") && anyNumber <= 3) {
            return (input + " " + anyNumber);
        } else if (!input.equals("FastTrackIT") && anyNumber >= 4) {
            return (anyNumber + " " + input);
        }
        return "imposibble";
    }

    public String winterSnow(int a) {
        if (a > 8 || a == 6) {
            return "The amount of snow this winter was(cm):" + a;
        }
        return "The forecast snow is(cm):" + a;

    }

    public String multitudeOfNumbers(int numero) {
        if (numero > 3 && numero != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (numero == 4) {
            return "The number is equal to 4";
        }  else if  (numero < 3) {
            return " The number is lower than 3";
            }
            return " None of them is valid";
        }

    public boolean isNumberEven(int a){
        if ( a%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote( int age){
        if ( age >= 18){
            return true;
        }else {
            return false;
        }
    }

    public int theLargestNumber( int a, int b, int c ) {
        if( a> b && a >c){
            return ( a );

        }else if ( b > a && b > c){
            return ( b );

        }else if (c > a && c > b){
            return ( c );
        }
        return 0;

    }

    public String homework7a(String imput) {
           return imput;
    }

}

