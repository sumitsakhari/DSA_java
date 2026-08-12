import LinkedList.LinkedList;
import LinkedList.ListNode;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3= new ListNode(30);
        ListNode n4= new ListNode(40);
        ListNode n5= new ListNode(50);
        ListNode n6= new ListNode(60);

        LinkedList list = new LinkedList();
        System.out.println(list.length());
        list.insertAtEnd(n2);
        System.out.println(list.displayList());
        list.insertAtBeginning(n1);
        System.out.println(list.displayList());
        list.insertAtEnd(n3);
        list.insertAtEnd(n4);
        list.insertAtEnd(n5);
        list.insertAtEnd(n6);
        System.out.println(list.displayList());
        list.insertAtMiddle(2,25);
        System.out.println(list.displayList());
        System.out.println(list.length());
        System.out.println(list.removeFromBeginning());
        System.out.println(list.removeFromEnd());
        System.out.println(list.displayList());
        list.removeMatched(n3);
        System.out.println(list.displayList());
        list.removeAtIndex(2);
        System.out.println(list.displayList());
        System.out.println(list.length());
        System.out.println(list.getIndex(25));
        list.clearList();
        System.out.println(list.displayList());
        System.out.println(list.length());

    }
}