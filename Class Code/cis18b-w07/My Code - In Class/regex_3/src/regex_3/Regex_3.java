
package regex_3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class Regex_3 {

    public static void main(String[] args) {
        String input = 
          "User clientId=23421. Some more text clientId=33432. This clientNum=100";

        Pattern p = Pattern.compile("(clientId=)(\\d+)");
        Matcher m = p.matcher(input);

        StringBuffer result = new StringBuffer();
        while (m.find()) {
                System.out.printf("m.group(1)=%s, m.group(2)=%s%n", m.group(1)+ m.group(2));
                System.out.println("Masking: " + m.group(2));
                m.appendReplacement(result, m.group(1) + "***masked***");
        }
        m.appendTail(result);
        System.out.println(result);
	}
    }