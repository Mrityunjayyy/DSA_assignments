public class LinkedList3 {
    Node head ;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


        /** inserting element at the end of the linked list **/
        public void insertAtEnd(int newData)
        {
            Node newNode = new Node(newData) ;

            //Linked list is empty
            if(head == null)
            {
                head = newNode ;
                return ;
            }

            Node temp = head ;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            newNode.next = null ;
            temp.next = newNode ;

        }

        /** function to remove duplicates from a sorted linked list **/
        public void removeDuplicatesFromLinkedList()
        {
            if(head == null || head.next == null)
            {
                return;
            }

            Node current = head;
            while(current.next != null)
            {
                if(current.data == current.next.data)
                {
                    current.next = current.next.next ;
                }
                else
                {
                    current = current.next ;
                }
            }

        }



        /** Display linkedList **/
        public void displayLinkedList()
        {
            LinkedList3.Node current = head ;
            System.out.println();
            while(current != null)
            {
                System.out.print(current.data + " ");
                current = current.next ;
            }
        }


    public static void main(String[] args) {
        LinkedList3 ll3 = new LinkedList3();
        ll3.insertAtEnd(100);
        ll3.insertAtEnd(100);
        ll3.insertAtEnd(200);
        ll3.insertAtEnd(200);
        ll3.insertAtEnd(200);
        ll3.insertAtEnd(300);
        ll3.insertAtEnd(300);
        ll3.insertAtEnd(300);
        ll3.insertAtEnd(400);
        ll3.insertAtEnd(500);
        ll3.insertAtEnd(500);
        ll3.insertAtEnd(500);
        ll3.insertAtEnd(600);
        ll3.displayLinkedList();

        ll3.removeDuplicatesFromLinkedList();
        ll3.displayLinkedList();
    }
}
