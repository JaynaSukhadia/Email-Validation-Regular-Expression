package regularexpression;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRestrictionOnUserName {

    public static void main(String args[]){
        ArrayList<String> emails = new ArrayList<String>();
        emails.add("jayna@domain.co.in");
        emails.add("jayna@domain.com");
        emails.add("jayna-sukhadia#@domain.co.in");
        emails.add("jayna_sukhadia@domain.com");
        emails.add("jayna@domaincom");
        //Add invalid emails in list
        emails.add("@yahoo.com");
        emails.add("06jayna#domain.com");
        //Regular Expression
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
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
