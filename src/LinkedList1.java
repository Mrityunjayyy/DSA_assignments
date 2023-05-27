/** LinkedList assignment question 1
 * Given a linked list and a key ‘X‘ in, the task is to check if X is present in the linked list or not.
 */

public class LinkedList1 {
    Node head ;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    /** inserting element at the start of a linked list **/
         public void push(int newData)
         {
             Node newNode = new Node(newData) ;
             newNode.next = head ;
             head = newNode ;
             return;
         }



         /** checking if the given element is  present in the linked list or not **/
         public boolean isPresent(Node head , int data)
         {
             boolean flag = false ;
             Node current = head ;
             while(current != null)
             {
                 if(current.data == data)
                 {
                     flag = true;
                     break;
                 }
                 current = current.next ;

             }
                 return flag ;
         }

    public static void main(String[] args) {
        LinkedList1 ll1 = new LinkedList1();
        ll1.push(14);
        ll1.push(21);
        ll1.push(11);
        ll1.push(30);
        ll1.push(10);
        if(ll1.isPresent(ll1.head, 11))
        {
            System.out.println("Element is present");
        }
        else {
            System.out.println("Element is absent");
        }
    }
}
