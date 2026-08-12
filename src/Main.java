import LinkedList.LinkedList;
import LinkedList.ListNode;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3= new ListNode(30);

        n1.next = n2;
        n2.next = n3;

        System.out.println("Data: " + n1.data +"  "+ "NextNode: " + n1.next);
        System.out.println("Data: " + n2.data +"  "+ "NextNode: " + n2.next);
        System.out.println("Data: " + n3.data +"  "+ "NextNode: " + n3.next);
    }
}