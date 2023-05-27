/** Linked List assignment 2
 * Q2. Insert a node at the given position in a linked list. We are given a pointer to a node, and the
 * new node is inserted after the given node.
 */

public class LinkedList2 {
    Node head ;
    class Node
    {
        int data ;
        Node next ;
        Node(int data)
        {
            this.data = data ;
        }
    }

    /** inserting element at the end of the linked list **/
    public void insertAtEnd(int newData)
    {
        Node newNode = new Node(newData);

        if(head == null)
        {
            head = newNode ;
            return;
        }

        Node temp = head ;
        while(temp.next != null)
        {
            temp = temp.next ;
        }
        newNode.next = null ;
        temp.next = newNode ;
    }


    /** function to insert element at the given position **/
    public void insertAt(int position , int newData)
    {
        Node newNode = new Node(newData) ;
        Node temp = head ;

        if(position < 0)
        {
            System.out.println("Position should be greater than or equal to 0");
        }
        if (position == 0 )
        {
            newNode.next = head ;
            head = newNode ;
            return ;
        }

        for(int i = 0 ; temp!= null && i < position -1 ; i ++)
        {
            temp = temp.next ;
        }

         newNode.next = temp.next ;
         temp.next = newNode ;
    }


    /** Display linkedList **/
    public void displayLinkedList()
    {
        Node current = head ;
        System.out.println();
        while(current != null)
        {
            System.out.print(current.data + " ");
            current = current.next ;
        }
    }

    public static void main(String[] args) {
        LinkedList2 ll2 = new LinkedList2();
        ll2.insertAtEnd(10);
        ll2.insertAtEnd(20);
        ll2.insertAtEnd(30);
        ll2.insertAtEnd(40);
        ll2.insertAtEnd(50);
        ll2.displayLinkedList();

        /** indexing begins from 0 **/
        ll2.insertAt(2 , 25);
        ll2.displayLinkedList();
    }
}
