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

    public void insertAtBeginning(ListNode node) {
//        ListNode node = new ListNode(data);
        node.next = head;
        head = node;
        length++;
    }

    public void insertAtEnd(ListNode node) {
//        ListNode node = new ListNode(data);
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

    public ListNode removeFromBeginning() {
        ListNode node = head;
        if(node!=null) {
            head = node.next;
            node.next = null;
        }
        if(head!=null) length--;
        return node;
    }

    public ListNode removeFromEnd() {
        if(head==null) return null;
        ListNode p = head,q = null,node = p.next;
        if(node==null) {
            head = null;
            length--;
            return p;
        }
        while(node!=null) {
            q = p;
            p = node;
            node = p.next;
        }
        q.next = null;
        length--;
        return p;
    }

    public void removeMatched(ListNode node) {
        if(head==null) return;
        if(node.equals(head)) {
            head = head.next;
            length--;
            return;
        }
        ListNode p = head,q = p.next;
        while(q!=null) {
            if (node.equals(q)) {
                p.next = q.next;
                length--;
                return;
            }
            p = q;
            q = p.next;
        }
    }

    public void removeAtIndex(int index) {
        if(index<0) index = 0;
        if(index>length) index = length - 1;

        if(head==null) return;
        if(index==0) {
            head = head.next;
        }else {
            ListNode temp = head;
            for(int i=1;i<index;i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }

    public String displayList() {
        String res = "[";
        if(head==null) return res+"]";
        res = res + head.data;
        ListNode temp = head.next;
        while(temp!=null) {
            res = res + "," + temp.data;
            temp = temp.next;
        }

        return res + "]";
    }

    public int length() {
        return length;
    }

    public int getIndex(int data) {
        int index = 0;
        ListNode temp = head;
        while(temp!=null) {
            if(temp.data==data) {
                return index;
            }
            index++;
            temp = temp.next;
        }

        return -1;
    }

    public void clearList() {
        head = null;
        length = 0;
    }
}
