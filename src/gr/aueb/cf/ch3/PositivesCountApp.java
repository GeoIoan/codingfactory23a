package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει το πλήθος των θετικών αριθμών
 * που δίνει ο χρήστης
 */

public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int possitiveCount = 0;

        System.out.println("Please give a num (int)");
        num = in.nextInt();

        while (num >= 0) {
            possitiveCount++;
            System.out.println("Please give a num(int)");
            num = in.nextInt();
        }

        System.out.println("Positive-count" + possitiveCount);
    }
}
