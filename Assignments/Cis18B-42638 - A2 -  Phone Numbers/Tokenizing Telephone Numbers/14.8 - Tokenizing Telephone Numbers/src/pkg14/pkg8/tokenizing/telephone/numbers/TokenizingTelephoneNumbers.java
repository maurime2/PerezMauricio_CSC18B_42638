/*
Mauricio S. Perez
CSC 18B 42638 - Java Advanced Objects
Date Due: 4/26/17

14.8 - Tokenizing Telephone Numbers


	Write an application that inputs a telephone number as a string 
        in the form of (555) 555-5555. 

        The application should use the String class method "split" 
        to extract the area code as a token, 
        the first three digits of the phone number as a token, 
        and the last four digits of the phone number as a token as well. 

        The seven digits of the phone number should be concatenated into 
        one string. 

        Both the area code and the phone number should be printed. 

        Remember that you will need to change the delimiter characters during 
        the tokenization process.
 */
package pkg14.pkg8.tokenizing.telephone.numbers;
import java.util.Scanner;       //This library will alow us to scan into console

//TokenizingTelephoneNumbers Class Start
public class TokenizingTelephoneNumbers {

    //MAIN START
    public static void main(String[] args) {
        
        //Declare Local Variables
        Scanner input = new Scanner (System.in);  //creates a scanner "input"
        String phoneNumbOrig;                   //This Will store the 
                                               //original Phone Number from 
                                              //the user
        String phoneNumbClean = null;  //Cleaned up version of original Pohone Number
                                      //to look like "(XXX)XXX-XXXX" format
        String areaCode=null;      //Area Code NPA ('Numbering Plan Areas' or Area Code)
        String phoneP1=null;      //First 3 Digits of Phone Number
        String phoneP2=null;     //Last 4 DIgits of Phone Number
        boolean valid = false;  //Valid or invalid phone number
        boolean vNPA = false;  //Valid or invalid NPA (Area Code)
        
        //Declare Objects
        npaCheck npaObject = new npaCheck();    // Checks for valid NPA
                
        gThanTen gThanTenObject = new gThanTen();    //Checks that user input
                                                    //atleast 10 numerical 
                                                   //digits
        cleanPhone cleanPhoneObject = new cleanPhone();//Removes everything but
                                                      // the first 10 digits 
                                                     //of the string inputed

        split splitObject = new split();
        
        
        //Prompt User For Phone Number untill valid:
        //10 DIGIT VALIDATION
        do{ //10 DIGIT VALIDATION WILL LOOP UNTIL valid==TRUE.
            System.out.println("14.8 - Tokenizing Telephone Numbers");
            System.out.println("************************************");
            //USER Inputs Number
            
            //NPA VALIDATION
            do{     //NPA VALIDATION WILL LOOP UNTIL vNPA==TRUE
            System.out.println("Input a Phone Number: Area Code Cannot "
                    + "Start with 0 or 1");
            System.out.print("(xxx) xxx - xxxx: ");
            phoneNumbOrig=input.nextLine();
            System.out.println("You Input: "+phoneNumbOrig );
            
            
                //Check that first digit is not a 0 or a 1 in the NPA
                vNPA = npaObject.firstDigit(phoneNumbOrig, vNPA);
            }while(vNPA==false);

                //NPA VALID Confirmed
                System.out.println("NPA not 0 or 1 \n");
            
            //10 DIGIT VALIDATION: Check for atleast 10 digits
            valid = gThanTenObject.tenDigit(phoneNumbOrig, valid);
        }while(valid==false);
        //PHONE NUMBER FOUND AND VALID!!!
        //10 Digits VALID Confirmed:
        System.out.println("There are 10 digits in your phone number\n");
        
        //CLEAN THE STRING
        phoneNumbClean = cleanPhoneObject.cleanString(phoneNumbOrig, phoneNumbClean);

        //RETURN string as (XXX)XXX-XXXX format, store in phoneNumbClean
        System.out.println("Your Phone Number is: "+ phoneNumbClean);

        //Return as tokens using "split" class:
        splitObject.splitTokens(phoneNumbClean);

    }//MAIN END
    
}//TokenizingTelephoneNumbers END
