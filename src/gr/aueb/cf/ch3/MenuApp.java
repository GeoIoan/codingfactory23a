package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει επαναληπτικά ένα menu επιλογών
 * μέχρι ο χρήστης να επιλέξει έξοδο.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε ένα απο τα παρακάτω");
            System.out.println("1. Εισαγωγή προιοντος");
            System.out.println("2.Διαγραφή προιοντος");
            System.out.println("3.Έξοδος");
            System.out.flush();
            choice = in.nextInt();
        } while (choice != 3);
    }
}
