package com.company;

public class Main {

    public static void main(String[] args) {

        isPerfectNumber(28);
    }

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {

            System.out.println("Number has to be greater than 0");
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {

                sum += i;

                if (sum == number) {

                    System.out.println(number + " Is a perfect Number");
                    return true;
                }
            }
        }

        System.out.println(number + " Isn't a perfect Number");
        return false;
    }
}
