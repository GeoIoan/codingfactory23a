package gr.aueb.cf.ch7;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Typecast from string to int.
 */
public class TypeCastApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String lexeme;
        int num;

        System.out.println("Please insert a num");
        lexeme = in.next();
        num = Integer.parseInt(lexeme);

        System.out.println("Num is " + num);
    }
}
