package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcept2App {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum;
        final int MAGIC_NUM = 12;

        while (true) {
                System.out.println("Please insert num");

                if (in.hasNextInt()) {
                    inputNum = in.nextInt();
                } else {
                    in.nextLine();
                    System.out.println("Error.Please insert valid int");
                    continue;
                }
                if (inputNum == MAGIC_NUM) {
                    System.out.println("Great mf");
                    break;
                }
        }
        System.out.println("Thans for playing mf");
    }
}
