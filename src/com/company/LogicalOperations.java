package com.company;

public class LogicalOperations {


    public int checkBiggerNumber(int me, int you) {
        if (me > you) {
            return me;
        } else {
            return you;
        }
    }

    public String correctText(String input) {
        if (input.equals("FastTrackIT")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    String correct = "FastTrackIT";

    public String correctTextOrNot(String input) {
        if (input.equals(correct)) {
            return "Learning text comparison";
        } else {
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
        } else if (numero < 3) {
            return " The number is lower than 3";
        }
        return " None of them is valid";
    }

    public boolean isNumberEven(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public int theLargestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            return (a);

        } else if (b > a && b > c) {
            return (b);

        } else if (c > a && c > b) {
            return (c);
        }
        return 0;

    }

    public String homework7a(String imput) {
        return imput;
    }


    public void printListNumbersUntilHoundred(int unNumar) {
        for (int i = unNumar; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void printSirDeNumereDescrescator(int a) {

        for (int i = a; i >= -100; i--) {
            System.out.println(i);
        }
    }

    public void numaratoareIntreDouaNumere(int prime, int sec) {
        for (int i = prime; i < sec; i++) {
            System.out.println(i);
        }
    }

    public void celMaiMareNumar(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.println(i);
        }
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }

    public void numerePare(int prim, int sec) {
        for (int i = prim; i <= sec; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void numerePareSec(int prim, int sec) {
        for (int i = prim; i <= sec; i += 2) {
            System.out.println("Test numere pare " + i);
        }

    }

    public void numereImpare(int prim, int sec) {
        for (int i = prim; i <= sec; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    int sum = 0;

    public void sumaNumerelor(int unNumar) {
        for (int i = unNumar; i <= 100; i++) {
            sum = sum + i;
        }
        System.out.println("Suma numerelor este: " + sum);

    }

    int suma = 0;

    public void mediaNumerelor(int unNumar) {
        for (int i = unNumar; i <= 100; i++) {
            suma = suma + i;
        }
        System.out.println("Media numerelor este " + suma / 5f);

    }

    public void stelute() {
        for (int i = 1; i <= 7; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("" + "\n");

        }
    }


    public void crescator(int l) {
        while (l <= 100) {
            System.out.println(l);
            l++;
        }
    }

    public void descrescator(int a) {
        while (a >= -100) {
            System.out.println(a);
            a--;
        }
    }

    public void printDintreNumere(int first, int second) {

        while (first < second) {
            System.out.println(first);
            first++;
        }
    }

    public void celMaiMareNr(int e, int q) {
        int i = e;
        do {
            System.out.println(i);
            i++;
        } while (i <= q) ;

        int j = q;
        do {
            System.out.println(j);
            j++;
        } while(j <= e);

    }
    public void numerePareWhile(){
    int i = 1;
        while(i<= 100) {
        if (i % 2 == 0) {
            System.out.println(i);
        }
        i++;

       }
    }

    public void numereImpareWhile(){
        int i = 1;
        while(i<= 100) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;

        }
    }





















}



