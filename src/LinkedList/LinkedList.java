package LinkedList;

public class LinkedList {
    private int length;
    ListNode head;

    public LinkedList() {
        length = 0;
    }

    public ListNode getHead() {
        return head;
    }

    public void insertAtBeginning(int data) {
        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
        length++;
    }

    public void insertAtEnd(int data) {
        ListNode node = new ListNode(data);
        if(head==null) {
            head = node;
        }else {
            ListNode p,q;
            for(p=head;(q=p.next)!=null;p=q);
            p.next = node;
        }
        length++;
    }

    public void insertAtMiddle(int index,int data) {
        if(index<0) {
            index = 0;
        }
        if(index>length) {
            index = length;
        }

        ListNode node = new ListNode(data);
        if(head==null) {
            head = node;
        }else if(index==0) {
            node.next = head;
            head = node;
        }else{
            ListNode temp = head;
            for (int i = 1;i<index;i++) {
                temp = temp.next;
            }

            node.next = temp.next;
            temp.next = node;
        }

        length++;
    }

    
}
