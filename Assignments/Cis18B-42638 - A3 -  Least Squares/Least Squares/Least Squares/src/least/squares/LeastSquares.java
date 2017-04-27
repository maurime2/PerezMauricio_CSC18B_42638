/*
Mauricio S. Perez
CSC 18B 42639 - Java Advanced Objects
Date Due: 4/26/17

    //Class LeastSquares.java//

DIRECTORIES: (ON MY COMPUTER)
C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\another_test.txt
C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\data.txt

Least Squares
********************************************************************************
Least Square Lines Equation - Text File I/O

Suppose we have a text file: "data.txt" & "another_test.txt".

"data.txt" has the following table:

Temperature (celsius)	Resistance (ohms)
20.0	761
31.5	817
50.0	874
71.8	917
91.3	1018

Write a Java console application or (GUI application that utilizes the 
JFileChooser control), that does the following:

1. Prompt the user for the name of the text file
2. Opens the text file and reads in the ordered pair data 
    (which is stored in the text file in the format of:  xxx.xxxxx yyy.yyyy
    where there is a space between the numeric values and 
    a carriage return/line feed after the last numeric value on each line).
3. While looping through the read ordered pairs, have variables for the following:
    a. keep count of the number of ordered pairs processed
    b. sum of the x values
    c. sum of the y values
    d. sum of the square of the x values
    e. sum of the products of x and y
4. After the ordered pairs have been read in, close the file.
5. Compute the regression coefficients m and b for the equation of 
    the least squares line equation, where 
    "m" is the slope and 
    "b" is the y-intercept.
        (SEE SLOPE EQUATION PNG FOR EQUATION)

    you can find the y-intercept by subtracting from the average of y, 
    the product of the slope and average of x.
6. The output to the terminal screen must be:  
        Equation of least squares line: y = 3.33658x + 700.82837

7. The data file named another_test.txt, should have the output 
    to the terminal screen:  
        Equation of least squares line: y = -0.07926x + 754.90472

This assignment is due through the Assignment Submission tool, 
    no later than 4/26/2017 at 11:59PM, Early Bird Bonus submission before 
    11:59PM on 4/21/2017.
 */
package least.squares;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

//Class LeastSquares START
public class LeastSquares {

    //MAIN START
    public static void main(String[] args) {
        //Declare Local Variables
        Scanner input = new Scanner (System.in);    //creates a scanner "input"
        String textFile = null;
        double x = 0;
        double y = 0;
        double sumX=0;
        double sumY=0;
        double sumXX=0;
        double sumXY=0;
        double avgX=0;
        double avgY=0;
        double slope=0;
        double b=0;
      
      
        //Declare Objects
        ReadTextFile ReadTextFileObject = new ReadTextFile();//Reads in Text File
        
        //Prompt the user for the name of the text file
        System.out.print("LeastSquares\n");
        System.out.print("***********************************************\n");
        //Print Sample Directorys of my computer to user
        /*
            DIRECTORIES: (ON MY COMPUTER)
            C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\another_test.txt
            C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\data.txt
        */
        System.out.print("DIRECTORIES: (ON MY COMPUTER)");
        System.out.print("\nC:\\Users\\Executor\\Desktop\\Least Squares\\Least Squares\\src\\least\\squares\\another_test.txt\n");
        System.out.print("C:\\Users\\Executor\\Desktop\\Least Squares\\Least Squares\\src\\least\\squares\\data.txt\n");
        System.out.print("***********************************************\n");
        //Prompt user for Directory
        System.out.print("Input The File Path Name: ");
        textFile=input.nextLine();
        System.out.print("***********************************************\n");
        
        //Reads In text
        ReadTextFileObject.readText(textFile, x, y, sumX, sumY, sumXX, sumXY, avgX, avgY, slope, b);
        
        
        }//MAIN END
    
}//Class LeastSquares END
