/*
Mauricio S. Perez
CSC 18B 42639 - Java Advanced Objects
Date Due: 4/26/17

    //Class LeastSquares.java//

DIRECTORIES: (ON MY COMPUTER)
C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\another_test.txt
C:\Users\Executor\Desktop\Least Squares\Least Squares\src\least\squares\data.txt

    SPACING:
    %-10d   - Decimal -10
    %-12s   - 12 character string
    %-12s   - 12 character string
    %10.2f  - 10 charaater presision 2 float
    %n - Line Seperator
 */
package least.squares;
//libraries


// Fig. 15.6: ReadTextFile.java
// This program reads a text file and displays each record.
import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile
{
   private static Scanner input;
   //Global Variables
     public double x = 0;
     public double y = 0;
     public double sumX=0;
     public double sumXX=0;
     public double sumXY=0;
     public double avgX=0;
     public double avgY=0;
     public double slope=0;
     public double b=0;
     public double count=0;
     
     //Not Needed
     public double sumY=0;
     
     
  public String textfile;
    //GET AND SET METHODS
    //COUNT METHODS
        //method to set count
       public void setCount(double count)
       {
           this.count = count;
       }

       //Method to retrive count
       public double getCount()
       {
           return count;
       }
  
    //X METHODS
       //method to set x
       public void setX(double x)
       {
           this.x = x;
       }

       //Method to retrive x
       public double getX()
       {
           return x;
       }

    //Y METHODS
       //method to set y
       public void setY(double y)
       {
           this.y = y;
       }
       //Method to retrive y
       public double getY()
       {
           return y;
       }
       
    //sumX METHODS
       //method to set sumX
       public void setSumX(double sumX)
       {
           this.sumX = sumX;
       }
       //Method to retrive sum x
       public double getSumX()
       {
           return sumX;
       }

    //sumXY METHODS
       //method to set sumXY
       public void setSumXY(double sumXY)
       {
           this.sumXY = sumXY;
       }
       //Method to retrive sumXX 
       public double getSumXY()
       {
           return sumXY;
       }

    //sumXX METHODS
       //method to set sumXX
       public void setsumXX(double sumXX)
       {
           this.sumXX = sumXX;
       }
       //Method to retrive sumXX 
       public double getSumXX()
       {
           return sumXX;
       }
       
    //avgX METHODS
       //method to set avgX
       public void setAvgX(double avgX)
       {
           this.avgX = avgX;
       }
       //Method to retrive avgX 
       public double getAvgX()
       {
           return avgX;
       }

    //avgY METHODS
       //method to set avgY
       public void setAvgY(double avgY)
       {
           this.avgY = avgY;
       }
       //Method to retrive avgY 
       public double getAvgY()
       {
           return avgY;
       }
    //SLOPE METHODS
       //method to set slope
       public void setSlope(double slope)
       {
           this.slope = slope;
       }
       //Method to retrive avgY 
       public double getSlope()
       {
           return slope;
       }
    //b (y-intercept) METHODS
       //method to set b
       public void setB(double b)
       {
           this.b = b;
       }
       //Method to retrive avgY 
       public double getB()
       {
           return b;
       }
       
//************************       
       //NOT NEEDED
       //method to set sumY
       public void setsumY(double sumY)
       {
           this.sumY = sumY;
       }
       //Method to retrive Sum y 
       public double getSumY()
       {
           return sumY;
       }
     
   public static void readText(String textFile, double x,double y,double sumX, double sumY,double sumXX,double sumXY,double avgX,double avgY, double slope,double b)
   {
      openFile(textFile);
      readRecords(x, y, sumX, sumY, sumXX,sumXY, avgX, avgY, slope, b);
      closeFile();
   } 

   //openFile START
   public static void openFile(String textFile)
   {
      try
      {
         input = new Scanner(Paths.get(textFile)); 
      } 
      catch (IOException ioException)
      {
         System.err.println("Error opening file. Terminating.");
         System.exit(1);
      } 
   }//END openFILE

   // read record from file
   public static void readRecords(double x,double y,double sumX, double sumY,double sumXX, double sumXY,double avgX,double avgY, double m,double b)
   {  
      int count = 0;
      m = 0;
      b = 0;
      System.out.printf("%s%30s%n", "Temperature (c)",
         "Resistance (ohms)");

      try 
      {
         while (input.hasNext()) // while there is more to read
         {  //Read in X and Y
            x = input.nextDouble();
            y = input.nextDouble();
            
            // display record contents                     
            System.out.printf("%-30.4f%-30.4f%n", x, y);
            
            //Math
            count++;
            sumX  = sumX+x;
            sumY  = sumY+y;
            sumXX = ((sumXX)+(x*x));
            sumXY = ((sumXY)+(x*y));
            avgX = sumX/count;
            avgY = sumY/count;
            

                
         }//While loop End
            
            //OUTPUT MATH
            if(count >= 0)
            {
            //sumXY = sumX*sumY;
            System.out.println("***********************************************");
            System.out.println(count+" ordered pairs processed...");
            System.out.printf("%s%30s%30s%30s%n", "Sum of X","Sum of Y","SUM OF XX","Prod SumX Sum Y");
            System.out.printf("%-30.4f%-30.4f%-30.4f%-30.4f%n", sumX, sumY,sumXX,sumXY);
            System.out.println("***********************************************");
               //Slope Calc
               m=((sumXY)-  ((sumX)*(avgY)) ) / ((sumXX)-((sumX)*(avgX))) ;
               //Y-intercept calc
               b=avgY-(avgX*m);
               //OUTPUT SLOPE (m) & Y-INTERCEPT (b) w/AVG X&Y
               System.out.printf("AVG X: %.1f%n",avgX);
               System.out.printf("AVG Y: %.1f%n",avgY);
               System.out.printf("Slope(m): %.5f%n",m);
               System.out.printf("Y-intercept(b): %.5f%n",b);
            System.out.println("***********************************************\n");
            System.out.printf("Equation of least squares line: y = %.5fx + %.5f%n",m,b);
            System.out.println("***********************************************\n\n");
            System.out.println("See Excel or PDF \'Least Squares - Work\' for proof of work");
            }//END OUTPUT MATH
            
      }//Try block end 
      catch (NoSuchElementException elementException)
      {
         System.err.println("File improperly formed. Terminating.");
      } 
      catch (IllegalStateException stateException)
      {
         System.err.println("Error reading from file. Terminating.");
      } 
   } // end method readRecords

                // close file and terminate application
                public static void closeFile()
                {
                   //Close File
                   if (input != null)
                      input.close();
                } 
} // end class ReadTextFile
