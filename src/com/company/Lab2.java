package com.company;

public class Lab2 {
    public static void main(String[] args) {
        System.out.println("The room has a size of:" + " " + sum(2, 8));
        System.out.println("The height of the tree is:" + " " + sub(12.4f, 3));
        System.out.println("The number of shoes is:" + " "+ mult(5,8));
        System.out.println("The account has the amount of:" + " " + div(878d, 23d));


    }

    static int sum(int blue, int orange) {
        int result = blue + orange;
        return result;
    }

    static float sub(float pink, float orange) {
        float result = pink - orange;
        return result;
    }
    static int mult (int blue, int white) {
        int result = blue * white;
        return result;

    }
    static double div ( double blue, double orange) {
        double result = blue / orange;
        return result;
    }












}