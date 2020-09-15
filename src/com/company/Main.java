package com.company;

public class Main {

    public static void main(String[] args) {


        Calculator mathematicalOp =new Calculator();
        LogicalOperations logicalOp =new LogicalOperations();

        System.out.println(mathematicalOp.medAllNr(2,3,6));
        System.out.println(mathematicalOp.calculated(10,20));
        System.out.println(mathematicalOp.otherNumber(22,2));
        System.out.println(mathematicalOp.fever(-5,8,6));
        System.out.println(mathematicalOp.hour(55,9,9));
        System.out.println(mathematicalOp.operation(20, -3, 5, 8));
        System.out.println(mathematicalOp.juice(5,15,3,2,8,3));

        System.out.println(logicalOp.homework7a("Hello"+"\n"+"Ramona"));
        System.out.println(mathematicalOp.rest(9,2));

        firstModel();
        secondModel();

    }

    public static void firstModel(){
        System.out.println("     J      a     V       V     a      ");
        System.out.println("     J     a a     V     V     a a     ");
        System.out.println("J    J    aaaaa     V   V     aaaaa    ");
        System.out.println("  JJ    a       a     V     a       a  ");

    }

    static public void secondModel(){

        System.out.println(" +\"\"\"\"\"\"\"+ ");
        System.out.println("[|  o o  |]");
        System.out.println(" |   ^   | ");
        System.out.println(" |  '-'  | ");
        System.out.println(" +_______+ ");

    }


}
















