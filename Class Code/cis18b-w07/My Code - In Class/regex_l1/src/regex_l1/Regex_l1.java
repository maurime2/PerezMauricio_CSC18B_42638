package regex_l1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class Regex_l1 {


    public static void main(String[] args) {
        List<String> input = new ArrayList<String>();
        input.add("1");
        input.add("22");
        input.add("333");
        input.add("4444");
        input.add("55555");
        
        String regex = "\\d(3,5)";
        
        for(String num : input){
            if(num.matches(regex)){
            //Method 1
             System.out.println("found good (3 to 5  digits numbers): " + num);
            }
            
            //Method 2
            if(Pattern.matches(regex, num)){
                System.out.println("Found good (3 to 5 digit numbers)"+num);
            }
        }
    }
    
}
