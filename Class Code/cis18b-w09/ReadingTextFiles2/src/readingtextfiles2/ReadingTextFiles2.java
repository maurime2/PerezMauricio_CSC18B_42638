package readingtextfiles2;

import java.io.FileReader;
import java.util.Scanner;


public class ReadingTextFiles2 {


    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter Name of textfile to read: ");
        String filename = kb.nextLine();
    
        
        try
        {
            Scanner inputFile = new Scanner(new FileReader(filename));
            while(inputFile.hasNextInt() )
            {
                int value1 = inputFile.nextInt();
                int value2 = inputFile.nextInt();
                int value3 = inputFile.nextInt();
                System.out.printf("%8d\t%8d\t%8d\n", value1,value2,value3);
            }    
        }
        
        catch(Exception e)
        {
        System.out.println(e.getMessage());
        }
        
    }//End Main
    
}//End Class