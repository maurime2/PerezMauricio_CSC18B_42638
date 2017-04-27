/*
Mauricio S. Perez
CSC 18B 42638 - Java Advanced Objects
Date Due: 4/26/17

14.8 - Tokenizing Telephone Numbers- CONT...

    //Class gThanTen.java//
    This Class Will Check that the string inputed is atleast greater than 10
    Digits (0-9) in the form xxx xxx xxxx, before checking anything else.

    NPA IS ALREADY CHECKED, FIRST DIGIT SHOULD NOT BE 0 or 1

    If 10 digits not present, program will return a valid false causing main to
    loop at input again.

    
    
*/

//Libraries
package pkg14.pkg8.tokenizing.telephone.numbers;

//gThanTen Class Start
public class gThanTen {
    //Declare Variables
    
    //Check for ten figits in phoneNum
    public boolean tenDigit(String phoneNum, boolean valid){
        //Decalre local Variables
        int count = 0;    //Keeps count of digits
        int num = 0;     //checks whats in the string char of phoneNum
        int tenD = 0;   //
        
        //Check if string is atleast 10 digits long
        //Search for first digit
        if(phoneNum.length() >=10 ){
            for(int i=0; (i<phoneNum.length()) && ((valid == false) && (count <= 10) ) ; i++)
            {       num = (int) phoneNum.charAt(i);    
                    
                    //check num holds number between 0-9
                    if(num >= 48 && num <= 57){
                        System.out.print("Number: "+(count+1)+" = "+phoneNum.charAt(i)+"\n");
                        count++;
                    }
                    
                    //check if count == 10
                    if(count == 10){
                        valid = true;
                    }               
            }//End CHeck for first digit for loop
            
        }//End If greater than 10 if statement
            //When their are not 10 digits, valid = false
            if(count != 10){
                System.out.println("There are only "+ count +" digits in this Phone Number!!!");
                System.out.println("You need 10.\nPlease try again\n");
                valid = false;
            }
        
        //return valid or invalid
        return valid;
    }
}//gThanTen Class End
