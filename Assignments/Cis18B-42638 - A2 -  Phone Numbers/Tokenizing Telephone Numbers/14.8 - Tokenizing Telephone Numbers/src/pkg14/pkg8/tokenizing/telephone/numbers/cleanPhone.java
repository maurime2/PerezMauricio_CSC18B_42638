/*
Mauricio S. Perez
CSC 18B 42638 - Java Advanced Objects
Date Due: 4/26/17

14.8 - Tokenizing Telephone Numbers- CONT...

    //Class cleanPhone.java//
    This Class takes 10 digit phone number and formats it to (XXX)XXX-XXXX
    format.
    
    By this point, NPA and 10 digits have been confirmed in the string. We need 
    to reformat the string to look like (XXX)XXX-XXXX.

        We will remove:
        -SPACES
        -CHARACTERS
        -PUNCTUATION
        
    Once thats done, we will copy the string with parenthasies and its "-" sign
    so that we can manipulate further.

*/

//Libraries
package pkg14.pkg8.tokenizing.telephone.numbers;
import java.util.Arrays;    //to create arrays in Java

//class cleanPhone Start
public class cleanPhone {
    //Declare global variables
    
    //Method Clean String
    public String cleanString(String phoneNum, String cleanPhoneNum){
        //Declare Variables
        String temp = phoneNum;
        String leftB = "(";
        String rightB = ")";
        String Space = "-";
        
        //Prepare String Array to be manipulated
        temp = temp.replaceAll("[^\\d]", "");   //Removes All Punctuation w/reg expressions.
        System.out.println("String With No Punctuations: "+temp);
        
        //Format String:
            // "(" + AREA CODE + ")"
            cleanPhoneNum = leftB;
            for(int i=0;i<3;i++){
                cleanPhoneNum =cleanPhoneNum+temp.charAt(i);
            }
            cleanPhoneNum = cleanPhoneNum+rightB;
            
            // 3 DIGITS + "-"
            for(int i=3;i<6;i++){
                cleanPhoneNum = cleanPhoneNum+temp.charAt(i);
            }
            cleanPhoneNum = cleanPhoneNum+Space;

            // LAST 4 DIGITS
            for(int i=6;i<10;i++){
                cleanPhoneNum = cleanPhoneNum+temp.charAt(i);
            }
            
        //Return clean string
        return cleanPhoneNum;
    }//end clean string method
    
    
    
    
}//class cleanPhone end
