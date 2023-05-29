package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ελεχγχει ισότητα ανισότητα
 * στους floating points.
 */
public class DoubleComparedApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b1 = 0.9999;
        double b2 = 1.0001;
        final double EPSILON = 0.005;

        System.out.println("Please insert two doubles");
        b1 = in.nextDouble();
        b2 = in.nextDouble();

        if (Math.abs(b2-b1) <= EPSILON) {
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
    }
}
