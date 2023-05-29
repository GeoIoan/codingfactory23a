package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει τον μέσο όρο της βαθμολογίας
 * ενος μαθητή. Παρέχονται τα total και
 * count.
 */
public class AverageApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int average = 0;

        System.out.println("Please provide total and count");
        total = in.nextInt();
        count = in.nextInt();

        if (count == 0 || total < 0) {
            System.out.println("Invalid count or total");
            System.exit(1);
        }

//        if (count < 0) {
//            System.out.println("Invalid total");
//            System.exit(1);
//        }

        average = total / count;

        if (average > 10) {
            System.out.println("Invalid average");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Eisai fvtia brocoloco");
        } else if (average >= 7) {
            System.out.println("Timios eisai vouno mou");
        } else if (average >= 5) {
            System.out.println("psilo fail");
        } else if (average >= 3) {
            System.out.println("fail");
        }
    }
}
