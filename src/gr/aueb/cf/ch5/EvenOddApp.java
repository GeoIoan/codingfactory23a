package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * θα αποφασίζει αν ενας int
 * είναι άρτιος ή περιτός.
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please provide num");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);
    }

    /**
     * Evaluates wether n  is even or not.
     * @param n   the number (int) to evaluate
     * @return  true if n is even and false otherwise
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
