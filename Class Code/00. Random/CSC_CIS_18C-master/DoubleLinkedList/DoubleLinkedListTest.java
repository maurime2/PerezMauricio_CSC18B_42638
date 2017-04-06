public class DoubleLinkedListTest
{
	public static void main(String[] args)
	{
		// Create a DoubleLinkedList of up to 20 integers (Integer is the wrapper class for int)
		DoubleLinkedList<Integer> dll_of_integers = new DoubleLinkedList<Integer>();

		System.out.println("Demonstrating dll_of_integers...");
		System.out.println("Calling insertAtNext(5)...");
		dll_of_integers.insertAtNext(5);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertAtNext(2)...");
		dll_of_integers.insertAtNext(2);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertAtNext(12)...");
		dll_of_integers.insertAtNext(12);
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();
		System.out.printf("\n");
		System.out.println("Calling insertAtNext(8)...");
		dll_of_integers.insertAtNext(8);
		System.out.println("Insert onto end of double linked list: 0 to 999...");
		for(int i=0;i<1000;i++)
		{
			dll_of_integers.insertAtNext(i);
		}
		System.out.print("Content of dll_of_integers: ");
		dll_of_integers.display();		
		System.out.printf("\n\n");		
		
		
	}
}