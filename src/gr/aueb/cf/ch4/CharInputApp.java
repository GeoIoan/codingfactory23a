package gr.aueb.cf.ch4;

import java.io.IOException;

/**
 * Διαβάζει έναν char με την
 * System.in.read()
 */
public class CharInputApp {

    public static void main(String[] args) throws IOException {
        char intputChar = ' ';

        System.out.println("Please insert an ASCII char");
        intputChar = (char) System.in.read();

        System.out.println("char: " + intputChar);

    }
}
