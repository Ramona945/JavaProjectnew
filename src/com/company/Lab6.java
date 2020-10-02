package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab6 {
    public static void main(String[] args) {
        LogicalOperations op = new LogicalOperations();


        List<Integer> secList = new ArrayList<Integer>();
        secList.add(5);
        secList.add(9);
        secList.add(7);
        secList.add(2);

        op.addInList(secList,4);
        System.out.println(secList);
        System.out.println("________________");

        List<String> firtList = new ArrayList<String>();
        firtList.add("Ioana");
        firtList.add("Andrei");
        firtList.add("Alin");
        firtList.add("Cristi");

        op.listOfElements(firtList);
        System.out.println("________________");

        List<Integer> thirdList = new ArrayList<Integer>();
        thirdList.add(9);
        thirdList.add(35);
        thirdList.add(74);
        thirdList.add(3);

        op.listAllTheElemets(thirdList,1);
        System.out.println("________________");


        List<Integer>forthList = new ArrayList<Integer>();
        forthList.add(1);
        forthList.add(2);
        forthList.add(3);
        forthList.add(4);

        op.listReverse(forthList);
        System.out.println("________________");

        List<String>fifthList = new ArrayList<String>();
        fifthList.add("5 Pears ");
        fifthList.add("7 Bananas ");
        fifthList.add("4 Kiwis ");
        fifthList.add("1 Ananas ");

        op.addStringToList(fifthList, 0, " 2 kg Cherries");
        System.out.println( fifthList);
        System.out.println("________________");

        List<Integer>listElements= Arrays.asList(6,7,5,8,14,34,76,37,55);
        op.showListAndElements(listElements);
        System.out.println("________________");

        List<Integer>randomElements= new ArrayList<Integer>();
        randomElements.add(66);
        randomElements.add(44);
        randomElements.add(33);
        randomElements.add(87);
        randomElements.add(55);
        randomElements.add(34);
        op.theLargestNumberFromTheList(randomElements);
        System.out.println("________________");


        List<Integer>listCuNumere= Arrays.asList(3,56,34,25,26,84,22,8,1,9,62);




















        

    }
}
