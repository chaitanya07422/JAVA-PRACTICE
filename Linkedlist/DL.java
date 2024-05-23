package Linkedlist;
public class DL {
    private Node head;
    public void insertfirst(int val){
        Node node =new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
        head.prev=node;
        }
        head=node;
    }
    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void inssertafter(int value,int after){
        Node p= find(after);
        if(p==null){
            System.out.println("not");
            return;
        }
        Node node =new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
        node.next.prev=node;
        }
    }
    public void insertlast(int value){
        Node node =new Node(value);
       Node temp=head;
       node.next=null;
       if(head==null){
        node.prev=null;
        head=node;
        return;
       }
       while(temp.next!=null){
        temp=temp.next;
       }   
       temp.next=node;
       node.prev=temp;
    }
    public void displaydl(){
        Node temp =head;
        Node tail=null;
        while(temp!=null){
            System.out.print(temp.value + "->");
            tail=temp;
            temp=temp.next;
        }
        System.out.println("end");
        System.out.println("print reverese");
        while(tail!=null){
            System.out.print(tail.value + "->");
            tail=tail.prev;
        }
    }
    //leet code questions 
    //1..megerge two linked list
    /*public static LL merge(LL first,LL second){
        Node f =first.head;
        Node s=second.head;
        LL ans =new LL();
        while(f!=null && s!=null){
            if(f.value>s.value){
                ans.insertlast(s.value);
                s=s.next;
            }
            if(f.value<s.value){
                ans.insertlast(f.value);
                f=f.next;
            }
        }
        while(f!=null){
         ans.insertlast(f.value);
         f=f.next;
        }
        while(s!=null){
            ans.insertlast(s.value);
            s=s.next;
        }
        return ans;
    }*/
    public class Node  {
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value=value;
    }
    public Node(int value,Node next,Node prev){
        this.value=value;
        this.next=next;
        this.prev=prev;
    }
    }
}
