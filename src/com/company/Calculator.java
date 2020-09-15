package com.company;

public class Calculator {
    public float medAllNr(float mic, float mare, float mixt ){
        float result = (mic + mare + mixt)/ 3;
        return result;
    }

    public String calculated(int a,int b){
        int result = ( a + b);
        return "Suma numerelor este: "+ result;
    }

    public String otherNumber(int d, int e){
        int result = ( d / e);
        return "Rezultatul impartirii este: " + result;
    }

    public int fever(int m,int s, int f){
        int result = (m + s * f);
        return result;
    }

    public int hour(int o, int u, int r){
        int result = ((o + u) %r);
        return result;
    }

    public String operation(int a, int b, int c, int d){
        int result =(a + b * c / d);
        return "Rezultatul operatiei este : " + result;
    }

    public int juice(int e,int r, int t, int y, int u,int i){
        int result =(e + r / t * y - u % i);
        return result;
    }



    public String rest(int alb, int negru) {
        int result = alb % negru;
        return "RestResult= " + result;
    }

    public int sum(int blue, int orange) {
        int result = blue + orange;
        return result;
    }

    public float sub(float pink, float orange) {
        float result = pink - orange;
        return result;
    }
    public int mult (int blue, int white) {
        int result = blue * white;
        return result;

    }
    public double div ( double blue, double orange) {
        double result = blue / orange;
        return result;
    }

}
