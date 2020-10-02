package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {

//        int[] arr ={1,2,3,4,5};
//
//        Scanner scan = new Scanner(System.in);
//
//        try{
//            System.out.println(arr[scan.nextInt()]);
//        }catch (ArrayIndexOutOfBoundsException exeption){
//            System.out.println("Index is not in array!");
//        }catch (InputMismatchException e){
//            System.out.println("Not a valid number provided");
//        }

        ReadFromKeyboard read = new ReadFromKeyboard();
        int i = read.getInt();
        System.out.println("x este : " + i);
        System.out.println("------------------");
        float f = read.getFloat();
        System.out.println("y este : "+f );
        System.out.println("------------------");
        double d = read.getDouble();
        System.out.println("d este: "+d);
        System.out.println("------------------");
        long l = read.getLong();
        System.out.println("l este "+l);



















    }
}





