package Linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL() {
        this.size = 0;
    }
    public void insertion(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertlast(int valuee) {
        Node node = new Node(valuee);
        if (tail == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value +"->");
            temp = temp.next;
        }
        System.out.println("end");
    }
    public int delectfirst(){
        int value =head.value;
          head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public void position(int value, int index) {
        if (index == 0) {
            insertion(value);
            return;
        }
        if (index == size) {
            insertlast(value);
            return;
        }

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }
    //leetcode ccycle question
    public boolean hasCycle(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){     
                return true;
            }
        }
        return false;
    }
    // to find length of the cycle
    public int lengthofcycle (Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                slow=slow.next;
                Node temp =slow;
                int length=0;
                do {
                    temp=temp.next;
                    length++;
                }
                while(temp!=slow);
                return length;

            }
            return 0;
        }
    }
    public  Node dectectCycle(Node head){
        int length=0;
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                length=lengthofcycle(slow);
                break;
            }
        }
        if(length==0){
            return null;
        }
        Node f=head;
        Node s=head;
        while(length>0){
            s=s.next;
            length--;
        }
        while(f!=s){
            f=f.next;
            s=s.next;
        }
        return s;
    }
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
