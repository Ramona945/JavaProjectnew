package com.company;

public class Main {

    public static void main(String[] args) {

        homework7a();

        System.out.println("RezSecMethod =" + " " + add(2,8));
        System.out.println("RezThrdMethod =" + " " + divid(22,7));
        System.out.println("RezFourthMethod" + "\n" + "a.=" + " " + addmult (-5 , 8 , 6));
        System.out.println("b.=" + " " + addmod (55 , 9, 9));
        System.out.println("c.=" + " " + amd (20, -3, 5, 8));
        System.out.println("d.="+ " " + ssmdm(5,15,3,2,8,3));

        homework3();
        firstModel();
        System.out.println(" Result = " + " " + media (9.5f,8.2f,6 ));
        secondModel();
        System.out.println("RestResult =" + " " +rest (5,2) );



    }
    public static void homework3() {

        System.out.println("1. Hello \n" + "Ramona");
        System.out.println("2. Rezultatul este" + " " + (2 + 8));
        System.out.println("3. Rezultatul este" + " " + (22 / 7f));
        System.out.println("4. Rezultatele sunt: \n" + "a." + " " + (-5 + 8 * 6));
        System.out.println("b." + " " + (55 + 9) % 9);
        System.out.println("c." + " " + (20 + -3 * 5 / 8));
        System.out.println("d." + " " + (5 + 15 / 3 * 2 - 8 % 3));

        // write your code here
    }

    public static void homework7a() {

        System.out.println("1. Hello \n" +
                "Ramona");

    }
    static int add (int sky, int moon) {
        int result = sky + moon;
        return result;
    }

    static float divid ( float stars, float galaxy){
        float result = stars / galaxy;
        return result;
    }

    static int addmult ( int one, int two, int three){
        int result = one + two * three;
        return result;
    }

    static int addmod (int balloon, int color, int box ){
        int result = ( balloon + color) % box;
        return result;

    }

    static int amd ( int mai, int iun, int iul, int aug ) {
        int result = mai + iun * iul / aug;
        return result;
    }

    static int ssmdm ( int monday, int tuesday, int wednesday, int thursday, int friday, int saturday){
        int result = monday + tuesday / wednesday * thursday - friday % saturday;
        return result;
    }


    public static void firstModel(){
        System.out.println("     J      a     V       V     a      ");
        System.out.println("     J     a a     V     V     a a     ");
        System.out.println("J    J    aaaaa     V   V     aaaaa    ");
        System.out.println("  JJ    a       a     V     a       a  ");

    }

    static float media(float mic, float mare, float mixt ){
        float result = (mic + mare + mixt)/ 3;
        return result;
    }

    static public void secondModel(){

        System.out.println(" +\"\"\"\"\"\"\"+ ");
        System.out.println("[|  o o  |]");
        System.out.println(" |   ^   | ");
        System.out.println(" |  '-'  | ");
        System.out.println(" +_______+ ");

    }

    static int rest(int alb, int negru){
        int result = alb % negru;
        return result;
    }










    public static void learnToCode(){
        int a, b, c, ageOfIulian;
        a = 15;
        b = 5;
        c = 10;
        ageOfIulian = a + b + c;
        int dayOfMonth = 3;
        int monthOfYear = 9;
        int year = 2020;
        System.out.println("Adunarea este egala cu:" + " " + (a + b + b));
        System.out.println("Varsta Alinei = " + ageOfIulian + " " + "ani");
        System.out.println("Ioana este nascuta in anul " + " " + (year - monthOfYear + dayOfMonth));
        System.out.println("4. Rezultatele sunt: \n" +
                "a." + " " + (-5 + 8 * 6) + "\n" + "b." + " " + ((55 + 9) % 9) + "\n" + "c." + " " + (20 + -3 * 5 / 8) + "\n"
                + "d " + " " + (5 + 15 / 3 * 2 - 8 % 3));

    }
}
















