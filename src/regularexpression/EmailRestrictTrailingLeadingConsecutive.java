package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictTrailingLeadingConsecutive {

    //Trailing  : dot (.) not provided before Local name and domain name

    // Leading  :

    // Consecutive  : Not started and ended with domain name

    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();

        emails.add("javaTpoint@domain.co.in");
        emails.add("javaTpoint@domain.com");
        emails.add("javaTpoint.name@domain.com");
        emails.add("javaTpoint#@domain.co.in");
        emails.add("java'Tpoint@domain.com");
        //Add invalid emails in list
        emails.add(".javaTpoint@yahoo.com");
        emails.add("javaTpoint@domain.com.");
        emails.add("javaTpoint#domain.com");
        emails.add("javaTpoint@domain..com");
        //Regular Expression
        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        //Compile regular expression to get the pattern
        Pattern pattern = Pattern.compile(regex);
        //Iterate emails array list
        for(String email : emails){
            //Create instance of matcher
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches()+"\n");
        }
    }
}
