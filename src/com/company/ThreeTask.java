package com.company;

public class ThreeTask {
    public static void main(String[] args) {

        int n = (int)Math.round((Math.random() * 102));

        if (n > 99 && n < 1000) {
            System.out.println("Число " + n + " має довжину 3 цифри.");
        } else if (n < 100 && n > 9) {
            System.out.println("Число " + n + " має довжину 2 цифри.");
        } else if (n < 10) {
            System.out.println("Число " + n + " має довжину 1 цифра.");
        }
    }
}