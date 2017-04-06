import java.util.Scanner;       //This library will alow us to scan into console
public class BagDemo {

    public static void main(String[] args) {
     
        
        
        //Bag of strings
        Bag<String> bag_of_strings = new Bag(5);
        
	//Strings Added and Removed
        bag_of_strings.add("World!");
        bag_of_strings.add("Hello");
        
                /* redo
                bag_of_strings.add("Structures1");
                bag_of_strings.add("Data");
                bag_of_strings.add("Structures2");
                bag_of_strings.remove("Structures1");
                redo*/

	//After Sort
        System.out.println("****************************************************");
        System.out.println("*Here it is BEFORE sort....                         *");
        System.out.println("****************************************************");
	//Print Bags after sort
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] a = bag_of_strings.toArray();
            //PRINT: bag_of_strings - BEFORE Sort
            for(int i=0;i<a.length;i++) {
                System.out.printf("a[%d]=%s\n",i,a[i]);
            }

	//Sort bag_of_strings
	bag_of_strings.sort();
        
	//After Sort
        System.out.println("****************************************************");
        System.out.println("*Here it is after sort....                         *");
        System.out.println("****************************************************");
	//Print Bags after sort
        System.out.println("Size of bag_of_strings=" + bag_of_strings.getSize() );
        System.out.println("Contents of bag_of_strings:");
        Object[] c = bag_of_strings.toArray();
            //PRINT: bag_of_strings - After Sort
            for(int i=0;i<c.length;i++) {
                System.out.printf("c[%d]=%s\n",i,c[i]);
            }
		
	//Bag of Floats
	Bag<Float> bag_of_floats = new Bag(2);	//float to Floats
        
	// fill the bag of floats with some floating point values
        for(int i=0;i<5;i++){
                if ( i%3 == 0 ) bag_of_floats.add( i*2.375f );        //Added f symbol to float values
                else if ( i%3 == 1 ) bag_of_floats.add ( -i*1.875f );//Added f symbol to float values
                else bag_of_floats.add( (i%500) / 1.4142f );        //blag to bag
        }//Fill bag_of_floats - end

        
         //BEFORE SORT
        System.out.println("****************************************************");
        System.out.println("*Here it is BEFORE sort....                         *");
        System.out.println("****************************************************");
        //Print bag_of_floats - After Sorted
        System.out.println("Size of bag_of_floats=" + bag_of_floats.getSize() );
        System.out.println("Contents of bag_of_floats:");
        Object[] b = bag_of_floats.toArray();           //Strings already has 'c' deffined for its array
            //PRINT: bag_of_strings - After Sort
            for(int i=0;i<b.length;i++){                   //Used 'b' for this array of floats
                System.out.printf("b[%d]=%s\n",i,b[i]);
            }//Ouput bag_of_floats - Sorted End
        
        //Sort the bag of floats
        bag_of_floats.sort();
        
            //After Sort PRINT
            System.out.println("****************************************************");
            System.out.println("*Here it is after sort....                         *");
            System.out.println("****************************************************");
            //Print bag_of_floats - After Sorted
            System.out.println("Size of bag_of_floats=" + bag_of_floats.getSize() );
            System.out.println("Contents of bag_of_floats:");
                Object[] d = bag_of_floats.toArray();           //Strings already has 'a' deffined for its array
                for(int i=0;i<d.length;i++){                   //Used 'b' for this array of floats
                    System.out.printf("d[%d]=%s\n",i,d[i]);
                }//Ouput bag_of_floats - Sorted End
    
    }//Exit Main
    
}//End Class Demo