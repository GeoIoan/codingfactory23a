package gr.aueb.cf.ch7;

public class SubstringDemo {

    public static void main(String[] args) {
        String s = "Athens Uni of Economics and Bus";

        for (int i = 0; i < s.length() - 1; i++) {
            System.out.println(s.substring(i, i + 2));
        }


    }
}
