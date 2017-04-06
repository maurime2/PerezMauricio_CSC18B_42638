/* DoubleLinkedList class */

class DoubleLinkedList<T> implements DoubleLinkedListInterface<T>
{
    private Node<T> head, tail;
    public int size;

    /* Constructor */
    public DoubleLinkedList()
    {
        head = null;
		tail = null;
        size = 0;
    }

    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return head == null;
    }

    /* Function to get size of list */
    public int getSize()
    {
        return size;
    }

    /* Function to insert element at begining */
    public void insertAtNext(T item)
    {
        Node newNode = new Node(item, null, null);        
        if(head == null)
        {
            head = newNode;
			tail = newNode;
        }
        else
        {
			//Node oldTail = tail;
			//oldTail.setLinkNext(newNode);
			//newNode.setLinkPrevious(oldTail);
			tail.setLinkNext(newNode);
			newNode.setLinkPrevious(tail);
			tail=newNode;
			
			//while ( current.getLinkNext() != null ) current = current.getLinkNext();
            //newNode.setLinkPrevious(current);
            //current.setLinkNext(newNode);
        }
        size++;
    }

    /* Function to insert element at index position */
    public void insertAtPos(T item , int indexPosition)
    {
        Node newNode = new Node(item, null, null);    

        if (indexPosition == 1)
        {
            insertAtNext(item);
        }            
		else
		{
			Node headPtr = head;

			for (int i = 2; i <= size; i++)
			{
				if (i == indexPosition)
				{
					Node temp = headPtr.getLinkNext();
					headPtr.setLinkNext(newNode);
					newNode.setLinkPrevious(headPtr);
					newNode.setLinkNext(temp);
					temp.setLinkPrevious(newNode);
				}
				headPtr = headPtr.getLinkNext();            
			}
			size++ ;
		}
    }

    /* Function to delete node at position */
    public void deleteAtPos(int indexPosition)
    {        
        if (indexPosition == 1) 
        {
            if (size == 1)
            {
                head = null;
                size = 0;
            }
			else
			{
				head = head.getLinkNext();
				head.setLinkPrevious(null);
				size--; 
			}
        }

        if (indexPosition == size)
        {
            head = head.getLinkPrevious();
            head.setLinkNext(null);
            size-- ;
        }

        Node nextPtr = head.getLinkNext();

        for (int i = 2; i <= size; i++)
        {
            if (i == indexPosition)
            {
                Node previous = nextPtr.getLinkPrevious();
                Node next = nextPtr.getLinkNext();
				
                previous.setLinkNext(next);
                next.setLinkPrevious(previous);
                size-- ;
            }

            nextPtr = nextPtr.getLinkNext();
        }        
    }    

    /* Function to display status of list */
    public void display()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
        }

        else if (head.getLinkNext() == null) 
        {
            System.out.println(head.getData());
        }
		else
		{
			Node currentPtr = head;
			System.out.print(currentPtr.getData()+ " <-> ");

			currentPtr = head.getLinkNext();

			while (currentPtr.getLinkNext() != null)
			{
				System.out.print(currentPtr.getData()+ " <-> ");
				currentPtr = currentPtr.getLinkNext();
			}
			System.out.print(currentPtr.getData()+ "\n");
		}
    }
	
	// inner node class for double linked list
	private	class Node<T>
	{
		private T data;
		private Node<T> next, previous;

		/* Constructor */
		public Node()
		{
			next = null;
			previous = null;
			data = null;
		}

		/* Constructor */
		public Node(T _data, Node _next, Node _previous)
		{
			data = _data;
			next = _next;
			previous = _previous;
		}

		/* Function to set link to next node */
		public void setLinkNext(Node _next)
		{
			next = _next;
		}

		/* Function to set link to previous node */
		public void setLinkPrevious(Node _previous)
		{
			previous = _previous;
		}    

		/* Funtion to get link to next node */
		public Node getLinkNext()
		{
			return next;
		}

		/* Function to get link to previous node */
		public Node getLinkPrevious()
		{
			return previous;
		}

		/* Function to set data to node */
		public void setData(T _data)
		{
			data = _data;
		}

		/* Function to get data from node */
		public T getData()
		{
			return data;
		}
	}
}