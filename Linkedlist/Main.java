package Linkedlist;
public class Main {
    public static void main(String[] args) {
        LL list =new LL();
      list.insertion(3);
        list.insertion(3);
        list.insertion(2);
        list.insertion(8);
        list.insertion(17);
        list.insertlast(99);
        list.position(100,3);
        list.display();
        System.out.println(list.delectfirst());
        list.display();
        //list.lengthofcycle(LL);
        //list.lengthc(4);
    }
}
