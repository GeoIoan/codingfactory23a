package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα διψήφιο ακέραιο
 * και βρίσκουμε το άθροισμα των δύο ψηφίων.
 */
public class IntTwoDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int leftDigit = 0;
        int rightDigit = 0;
        int sumofDigits = 0;

        System.out.println("Please insert a num with two digits");
        num = in.nextInt();

        leftDigit = num / 10;
        rightDigit = num % 10;

        sumofDigits = leftDigit + rightDigit;

        System.out.println("Sum:" + sumofDigits);
    }
}
