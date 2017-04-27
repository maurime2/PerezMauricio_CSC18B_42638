/*
Mauricio S. Perez
CSC 18B 42638 - Java Advanced Objects
Date Due: 4/26/17

14.8 - Tokenizing Telephone Numbers- CONT...

    //Class npaCheck.java//
    This Class Checks that NPA dose not start with 0 or 1
    
    I will Follow the AREA CODE FAQS from:
    http://www.area-codes.com/area-code-faq.asp
    
    They are as follows:
    
    "NPA" stands for Number Plan Area, commonly called Area Code. "NXX" refers to
    the three digits of a phone number immediately following the area code, 
    also called the �exchange� or the �Central Switching Office Designation.

    In the number (555) 222-3333, the NPA is �555� and the NXX is "222".

    The "N" numbers, or the first number of the NPA and of the NXX, can be any
    number from 2-9; 0 and 1 are reserved for special purposes. All the 
    remaining numbers, or "X" numbers, can be any number from 0-9.

    The last four digits of a phone number are called the 
    "Subscriber Line Identifier", or "SLID", and can be any number from 0-9

*/

//Libraries
package pkg14.pkg8.tokenizing.telephone.numbers;

//npaCheck Start
public class npaCheck {
    //Declare Local Variables
    
        //Method Check First Digit
         public boolean firstDigit(String phoneNum, boolean vNPA){
            //Decalre local Variables
            int count = 0;  //Keeps count of first digit
            int num = 0;

            //Prompt first check in input 
            System.out.println("Checking for first digit in: "+ phoneNum);
            
                /*
                //Length of String and Boolean Check
                System.out.println("Length of String: "+phoneNum.length()); 
                System.out.println("Boolean is: "+valid); 
                */
            
            //Search for first digit
            for(int i=0; (i<phoneNum.length()) && ((vNPA == false) && (count == 0) ) ; i++)
            {   //NPA CHECK FOR 0 or 1
                System.out.print("\nChar at "+i+": ");    
                    //num holds the int value of char in string phoneNum
                    num = (int) phoneNum.charAt(i);    
                    
                    //check num holds number between 0-9
                    if(num >= 48 && num <= 57){
                        //if 0 or 1, vNPA should be false
                        if(num == 48 || num == 49 ){
                        System.out.println("NOT OK: First Number is "+phoneNum.charAt(i)+"\nPlease try Again!!!\n");
                        vNPA=false;
                        }
                        else
                        {
                        System.out.println("OK: First Number is "+phoneNum.charAt(i));
                        vNPA=true;
                        }
                    //first number found, increment count to 1
                    count++;
                    }
                    else{
                        //this is a character
                        System.out.print("THIS IS A CHARACTER: "+phoneNum.charAt(i));
                    }

            }//End CHeck for first digit for loop
            
            
            return vNPA;
        }
    
}//npaCheck end

