package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * ο Frog βρίσκεται στη θέση x και θέλει να φτάσει στη
 * θέση c (ή σε θέση μεγαλύτερη απο τη θέση c). o frog
 * jumps a fixed distance D.
 *
 * Βρίσκει το ελάχιστο αριθμό jumps που ο small frog
 * πρέπει να κάνει ώστε να φτάσει στο στόχο του ή να το ξεπεράσει
 *
 * Για παράδειγμα, αν έχουμε
 * χ = 10
 * Y = 10
 * d =30
 *
 * Τότε ο small frog θα χρειασεί 3 jumps, γιατι:
 * Startsw at 10, kαι μετα το 1o jump πάει στη θέση 10 + 30 + 40
 * Στο 2ο jump παει 40 + 30 = 70
 * και στο 3ο jump, παει 70 + 30 = 100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        int y;
        int d;
        int jumps = 0;

        System.out.println("Please insert x y and jumps");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();


        for (int i = x; i < y; i = i + d) {
            jumps++;
        }

        System.out.println("Jumps : " + jumps);
    }
}
