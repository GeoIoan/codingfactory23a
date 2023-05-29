package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν πρέπει να ανάψουν τα
 * φώτα ενος αυτοκινήτου με βάση
 * τρεις μεταβλητές. Αν βρέχει και
 * ταυτοχρόνα ισχύει ένα τουλάχιστον
 * απο τα επόμενα: είναι σκοτάδι ή τρέχουμε
 * (speed > 100). Τις τιμές αυτές
 * τις λαμβάνουμε απο το χρήστη.
 */
public class LightsOnApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        boolean isRunning = false;
        int speed = 0;
        boolean lightOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining (true/false)");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark (true/false)");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed(int)");
        speed = in.nextInt();

        isRunning = (speed > MAX_SPEED);
        lightOn = isRaining && (isDark || isRaining);

        System.out.println("Lights on" + lightOn);
    }
}
