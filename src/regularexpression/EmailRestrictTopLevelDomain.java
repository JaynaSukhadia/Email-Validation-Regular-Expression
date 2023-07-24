package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictTopLevelDomain {
    public static void main(String args[]) {
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("jayna@domain.co.in");
        emails.add("jayna@domain.com");
        emails.add("jayna.name@domain.com");
        emails.add("jayna#@domain.co.in");
        //Add invalid emails in list
        emails.add(".jayna@yahoo.com");
        emails.add("jayna@yahoo.com.");
        emails.add("jayna@yahoo..com");
        emails.add("jayna@yahoo.c");
        emails.add("jayna@yahoo.corporate");
        emails.add("jayna'Sukhadia@domain.com");
        //Regular Expression
        String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        for (String email : emails) {
            //Create instance of matcher
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " : " + matcher.matches() + "\n");
        }
    }
}


