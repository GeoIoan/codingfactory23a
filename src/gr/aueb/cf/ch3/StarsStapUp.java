package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει start, end και step
 * και εκτυπώνει αντίστοιχα αστεράκια
 */
public class StarsStapUp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = 0;
        int end = 0;
        int step = 0;
        int i = 0;

        System.out.println("Please inser start , end value and step");
        start = in.nextInt();
        end = in.nextInt();
        step = in.nextInt();

        i = start;
        while (i <= end) {
            System.out.println("*");
            i = i + step;
        }
    }

}
