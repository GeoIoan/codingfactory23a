package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Διαβάζει απο το stdin το
 * start value, end value, step
 * και εκτυπώνει το πληθός των
 * επαναλήψεων.
 */
public class ForFlexApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int startValue;
        int endValue;
        int step;
        int iteration = 0;

        System.out.println("Provide start, step , end values");
        startValue = in.nextInt();
        endValue = in.nextInt();
        step = in.nextInt();

        for (int i = startValue; i <= endValue; i = i + step) {
            iteration++;
            System.out.print(i + " ");
        }

        System.out.println("Iterations " + iteration);
    }
}
