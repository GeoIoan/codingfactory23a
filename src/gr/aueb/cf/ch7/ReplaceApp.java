package gr.aueb.cf.ch7;

/**
 * Replaces substring
 */
public class ReplaceApp {
    public static void main(String[] args) {
        String title = "Coding Factory";
        String dashedTitle;

        dashedTitle = title.replace("o", "e");
        System.out.println(dashedTitle);
    }
}
