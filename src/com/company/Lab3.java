package com.company;

public class Lab3 {
    public static void main(String[] args) {
        LogicalOperations everithing = new LogicalOperations();

        int biggest = everithing.checkBiggerNumber(101,100);
        System.out.println("The bigger number is: " + biggest);

        System.out.println(everithing.correctText("FastTrackIT"));
        System.out.println(everithing.correctTextOrNot("FastTrackit"));
        System.out.println(everithing.verifyNumberEquals(8));
        System.out.println(everithing.verifyNumberAndText("FastTrackIT",3));
        System.out.println(everithing.winterSnow(7));
        System.out.println(everithing.multitudeOfNumbers(4));
        System.out.println(everithing.isNumberEven(521));
        System.out.println(everithing.isEligibleToVote(18));

        int largest = everithing.theLargestNumber(0,-4,-2);
        System.out.println("The bigger number is: " + largest);

    }


}










