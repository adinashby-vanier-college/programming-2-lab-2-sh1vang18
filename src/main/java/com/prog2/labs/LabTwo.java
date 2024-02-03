package com.prog2.labs;

/**
 * @author adinashby
 *
 */
public class LabTwo {

    /**
     * Write your test code below in the main (optional).
     *
     */
    public static void main(String[] args) {

    }

    /**
     * Please refer to the README file for question(s) description
     */
    public double calcAmountOfShipping(double costOfPurchase) {

        double cost = 0;
        if (costOfPurchase <= 20) {
            cost = 5.99;
        } else if (costOfPurchase > 20 && costOfPurchase <= 65) {
            cost = 10.99;
        } else if (costOfPurchase > 65) {
            cost = 15.99;
        }

        return cost;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public String findPrimeNumbersUptoInput(int input) {

        String ans = "";
        for (int i = 0; i <= input; i++) {
            if (isPrime(i) && i == 2) {

                ans += i;

            } else if (isPrime(i)) {
                ans += " " + i;
            }
        }

        return ans;
    }

    /**
     *
     * @param numberOfRows
     * @return
     */
    public String generateShape(int numberOfRows) {

        int num = 1;
        String ans = "";

        for (int i = 1; i <= numberOfRows; i++) {

            for (int j = 1; j <= i; j++) {
                ans += (num + " ");
                num++;
            }
            ans = ans.trim();
            ans += "\n";
        }
        
       
        return ans.trim();
    }

    /**
     * 4) Complete the Account class (see inside the class for instruction).
     *
     */
}
