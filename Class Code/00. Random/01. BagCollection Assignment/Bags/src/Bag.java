
import java.util.Scanner;//This library will alow us to scan into console

public final class Bag<T extends Object & Comparable<? super T> > implements BagInterface<T>  {
    private T[] bag_items;
    private T bag_items_t;
    private int num_items;
    
    //For user input
    Scanner input = new Scanner (System.in);  //creates a scanner "input"
    int inputSort = 0;                       //For sort Select
    boolean inputSortT = false;             //For sort Select
    //For checking sort
    boolean unsort = true;
    //For Printing Array
    Object[] a = toArray();
    
    
    
    public Bag() {
        bag_items = (T[])new Object[10]; // default 10 item bag
        this.num_items=0;
    }
    
    public Bag(int startSize)
    {
        bag_items = (T[])new Object[startSize];
        this.num_items=0;
    }
    
    // return the current size of the bag, or the number of elements in the bag
    public int getSize(){
        return this.num_items;
    }
    
    // returns true if bag is empty or false if bag is not empty
    public boolean isEmpty() {
        return this.num_items == 0;
    }
    
    // returns true if bag is empty or false if bag is not empty
    public boolean isFull() {
        return this.num_items == this.bag_items.length;
    }
    
    // add item to bag, returns true if successful, false if not
    public boolean add(T item) {
        if ( this.isFull() ) return false; // cannot add more items
        bag_items[num_items++] = item;
        return true;
    }
    
    // returns true if item is removed from bag
    public boolean remove(T item) {
        if ( this.isEmpty() ) return false;
        for(int i=0;i<this.num_items;i++)
        {
            if ( this.bag_items[i]==item )
            {
                for(int j=i+1;j<this.num_items;j++)
                    this.bag_items[j-1]=this.bag_items[j];
                this.num_items--;
                return true;
            }
        }
        return false;
    }
    
    // clear the bag of all items
    public void clear()
    {
        this.num_items=0; // just reset numberOfEntries to zero and overwrite old data when we add new data
    }
    
    // returns true if item found in bag
    public boolean contains(T item) {
        for(int i=0;i<this.num_items;i++) if ( bag_items[i]==item ) return true;
        return false;
    }
    
    public T[] toArray() {
        T[] arr = (T[])new Object[this.num_items];
        for(int i=0;i<this.num_items;i++) arr[i]=this.bag_items[i];
        return arr;
    }            

    
    public T[] sort() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Menu
        System.out.println("********"); 
        System.out.println("* Sort *");
        System.out.println("****************************************************");
        System.out.println("*Chose one:                                        *");
        System.out.println("*1 for Quick Sort                                  *");
        System.out.println("*2 for Merg Sort                                   *");
        System.out.println("*3 for Heap Sort                                   *");
        inputSortT = false;
        //Imput selection and sorts
        do{
            //Menu Start
            System.out.println("****************************************************");
            //Take input: User Selection Prompt
            System.out.print("*Input 1,2, or 3:                                  *");
            inputSort=input.nextInt();
            System.out.println("****************************************************");

            //Print Selection back to user and sort within
            //Quick Sort
            if(inputSort==1){
            System.out.println("*    -->Quick Sort Selected!<--                    *");
            
              //************//
             //Quick Sort  //  // uses bag_items
            //************//  // and num_items
            
            
            System.out.println("****************************************************");
            inputSortT = true;
            }
            
            //Merge Sort
            else if(inputSort==2){
            System.out.println("*    -->Merge Sort Selected!<--                    *");

              //************//
             //Merge Sort  // // uses bag_items
            //************// // and num_items
            int l=0;                //Left
            int n=0;                //Next
            int r=num_items/2;     //Right
            int p=0;    //Position/Place Holder
            
            
            //array size null and 1
            if(num_items <= 1){       
                return sizeN_or_1();
            }//End Array Merge Sort size 1 and null
            
            //array size 2
            if(num_items == 2){
                return size_2();
            }//End Array Merge Sort size 2:

            //Array Sort larger than size 3
            //Left Side:
            System.out.println("*               Array Size is > 3                    *");
            System.out.println("****************************************************");
            do{
            //Split into two
            p=r-1;    //Middle
                for(int i=0;i<=p-1;i++){
                    if(bag_items[i].compareTo(bag_items[i+1])<0){;
                    
                    
                    bag_items_t = bag_items[i];   
                        
                    bag_items[i]=bag_items[i+1];
                    bag_items[i+1]=bag_items_t;
                    }
                }
                unsort=true; //NOT COMPLETE
            }while(unsort);
            
            
            System.out.println("****************************************************");
            inputSortT = true;
            }
            
            //Heap Sort
            else if(inputSort==3){
            System.out.println("*    -->Heap Sort Selected!<--                     *");
            
              //************//
             //Heap Sort   //
            //************//
            System.out.println("****************************************************");
            inputSortT = true;
            }  
            else{
                System.out.println("*Try again:                                 *");
                System.out.println("*********************************************");
                inputSortT = false;
            }                       //Loop back to User Selection Prompt...
        }while(inputSortT==false); //if false
        
        
        //
        System.out.println("*Here are the results un-sorted                    *");
        System.out.println("*Size of bag_of_strings=" + getSize()+"                          *" );
        System.out.println("*Contents of bag_of_strings:                       *");
        
        
        //Loop through bag_of_strings - After Sort
        for(int i=0;i<a.length;i++) {
            System.out.printf("*a[%d]=%s\n",i,a[i]);
        }
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        System.out.println("****************************************************");
        
        return bag_items;
    }//END of Sort 
    
    
    public T[] sizeN_or_1(){
            //Array Size 1 or Null
            
            System.out.println("*               Array Size is 1                    *");
            System.out.println("****************************************************");
            return bag_items;   //Returns Empty Bag
        
    }//End sizeN_or_1
    
    public T[] size_2(){
        System.out.println("*               Array Size is 2                    *");
        System.out.println("****************************************************");
        if(bag_items[0].compareTo(bag_items[1])>0){;
            System.out.println("*                    Swap                          *");
            bag_items_t = bag_items[1];   
            bag_items[1]=bag_items[0];
            bag_items[0]=bag_items_t;
            }
        return bag_items;   //Returns Sorted Bag of size 2
    }//End size_2
    
    public T[] size_3_Merge(){
        
    return bag_items;   //Returns Sorted Bag of size 2
    }
}//End Class Bags