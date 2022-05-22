package com.company;

import  java.util.Scanner;

public class FourTask {
    public static void main(String[] args) {

        int mid1, mid2, mid3;
        int user = 0;
        int i = 0;
        int j = 2;
        mid1 = (int) (Math.random() * 3 + 1);
        mid2 = (int) (Math.random() * 3 + 1);
        mid3 = (int) (Math.random() * 3 + 1);
        int nRandom = Integer.parseInt(String.valueOf(mid1) + String.valueOf(mid2) + String.valueOf(mid3));
        System.out.println(nRandom);
        System.out.println("Програма загадала трьозначне число на пром.[1;3], спробуйте його відгадати за " + j + " спроби.");
        while (i != 2) {
            i++;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть трьозначне число на проміжку [1;3] :");
            if (sc.hasNextInt()) {
                user = sc.nextInt();
                if (user <= 99) {
                System.out.println("Ви ввели не трьохзначне число або літери.У вас залишилось спроб: " + (2 - i));
                } else if (user >= 1000) {
                    System.out.println("Ви ввели не трьохначне число або літери.У вас залишилось спроб: " + (2 - i));
                } else {
                    if (nRandom == user) {
                        System.out.println("Вітаємо, Ви вгадали!");
                        break;
                    } else {
                        System.out.println("Ви не вгадали! У вас залишилось спроб:" + (2 - i));
                    }
                }
            } else {
                System.out.println("Ви ввели не цифри.У вас залишилось спроб: " + (2 - i));
            } j--;
        }
    }
}


