package com.company;

public class twoTask {
    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        double c = (a * a + b * b);
        double S  = 0.5 * a * b;

        System.out.println("Плоша прямокутного трикутника: " + Math.round(S) + " см.");

        double P = a + b + Math.sqrt(c);
        System.out.println("Периметр прямокутного трикутника: " + Math.round(P) + " см." );

    }
}
