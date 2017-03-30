
package regex_2;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;


public class Regex_2 {


    public static void main(String[] args) {
            String input = "In my Neighborhoof, theire are cats, dogs, a mouse, a wolf, bears, and humans!";
            
            Pattern p = Pattern.compile("(mouse|cat|dog|wolf|bear|human)");
            Matcher m = p.matcher(input);
            
            List<String> mammals = new ArrayList<String>();
            while (m.find()){
                System.out.println("Found a " + m.group() + ".");
                mammals.add(m.group());
            }
    }
    
}
