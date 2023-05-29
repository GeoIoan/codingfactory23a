package gr.aueb.cf.ch7;

/**
 * Concatenates two or more strings.
 */
public class ConCatApp {

    public static void main(String[] args) {
        String title = "Dr.";
        String firstname = "Athan.";
        String lastname = "Androutso";
        String fullname;
        String titledFullName;

        fullname = title + firstname + lastname;
        titledFullName = title.concat(firstname.concat(lastname));

        System.out.println(fullname);
        System.out.println(titledFullName);

    }
}
