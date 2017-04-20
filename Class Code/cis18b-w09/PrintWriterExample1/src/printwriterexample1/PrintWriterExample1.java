
package printwriterexample1;

import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class PrintWriterExample1 {


    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of file to write: ");
        String filename = kb.nextLine();
        
        try
        {
                PrintWriter output = new PrintWriter(new File(filename));
                
                for(int i=1;i<10;i++){
                    output.println(i);
                }
                output.close();      
         }
        
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
}
