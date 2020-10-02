package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ReadFromKeyboard {

    public int getInt(){
        int number = 0;
        boolean repeat = true;
        while (repeat){
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = scan.nextInt();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid provided value");
            }
        }
        return number;
    }



        public float getFloat(){
            float number = 0;
            boolean repeat = true;
            while (repeat){
                try {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("Please enter a number: ");
                    number = scan.nextFloat();
                    repeat = false;
                }catch (InputMismatchException e){
                    System.out.println("Invalid provided value");
                }
            }
            return number;
        }

    public double getDouble(){
        double number = 0;
        boolean repeat = true;
        while (repeat){
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = scan.nextDouble();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid provided value");
            }
        }
        return number;
    }

    public long getLong(){
        long number = 0;
        boolean repeat = true;
        while (repeat){
            try {
                Scanner scan = new Scanner(System.in);
                System.out.println("Please enter a number: ");
                number = scan.nextLong();
                repeat = false;
            }catch (InputMismatchException e){
                System.out.println("Invalid provided value");
            }
        }
        return number;
    }






















    }
