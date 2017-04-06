package LinkedList;

public class LinkedList {

    // head node
    private Node head; // beginning of linked list
    private Node tail; // end of linked list
    
    // keep track of number of items in linked list
    private int listCount;

    // default constructor to create an empty linked list
    public LinkedList() {
        head = null;
        tail = null;
        listCount = 0;
    }

    // add a node with the specified element to the end of this list
    public void add(int dataValue) 
    {
        // to do: 3/22/17
        Node temp = new Node(dataValue); // create our new node        
        // if head is null, newly created node is head and tail for starters
        if ( head == null )
        {
            head = temp;
            tail = head;
        }
        else
        {
            tail.setNext(temp);
            tail = temp;
        }
        listCount++;
    }

    // inserts the specified element at the specified position in this list
    public void add(int dataValue, int indexPosition) 
    {
        // to do: 3/22/17       
        if ( indexPosition == 0 )
        {
            Node temp = new Node(dataValue); // create our new node
            temp.setNext(head);
            head=temp;
            listCount++;
        }        
        else if ( indexPosition >= listCount )
        {
            this.add(dataValue);
        }
        else
        {
            Node previous = null;
            Node current = head;
            for(int i=0;i<indexPosition;i++)
            {
                previous = current;
                current = current.getNext();
            }
            Node temp = new Node(dataValue); // create our new node
            previous.setNext(temp);
            temp.setNext(current);
            listCount++;
        }       
    }

    // returns the element at the specified index position in this list
    public int get(int indexPosition)
    {
        // index must be 0 or higher
        if (indexPosition < 0) {
            throw new IllegalArgumentException();
        }

        Node current = head.getNext();
        for (int i = 0; i < indexPosition; i++) {
            if (current.getNext() == null) {
                return 0;
            }

            current = current.getNext();
        }
        return current.getData();
    }

    // removes the node at the specified index position in this list
    public boolean remove(int indexPosition) 
    {
        // to do: 3/22/17
        listCount--; 
        return true;
    }

    // returns the number of items (elements) in the linked list
    public int size()
    {
        return listCount;
    }

    // utility method to print out items in linked list
    public String toString() {
        Node current = head;
        String output = "";
        while (current != null) {
            output += "[" + current.getData() + "]";
            current = current.getNext();
        }
        return output;
    }

    // this is a private inner class, only needs to be used by the
    // public outer linkedlist class
    private class Node {
        // next node in the linked list, if null, then end of list

        Node next;
        // data element of the node
        int data;

        // constructor to create node with empty value
        public Node() {
            next = null;
            data = 0;
        }

        // constructor to create node with a value in the node
        public Node(int dataValue) {
            next = null;
            data = dataValue;
        }

        // constructor for if we want to specify a particular node for
        // the node to point to
        public Node(int dataValue, Node nextNode) {
            next = nextNode;
            data = dataValue;
        }

        // return the data in the node
        public int getData() {
            return data;
        }

        // set the data in the node to a value
        public void setData(int dataValue) {
            data = dataValue;
        }

        // returns the next node, if any
        public Node getNext() {
            return next;
        }

        // set the next node to point to some other node
        public void setNext(Node nextNode) {
            next = nextNode;
        }
    }
}
