import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Stackex {
    public static void main(String[] args) {
       Stack<Integer> stack =new Stack<>();
       stack.push(5); 
       stack.push(53); 
       stack.push(51); 
       stack.push(5121); 
       stack.push(52322); 
       stack.push(12213); 
       System.out.println(stack.pop());
       Queue<Integer> queue1 =new LinkedList<>();
       queue1.add(4);
       queue1.add(5);
       queue1.add(6);
       queue1.add(7);
       System.out.println(queue1.peek());
       System.out.println(queue1.peek());
       System.out.println(queue1.peek());
       Deque<Integer> deque1 =new ArrayDeque<>();
       deque1.add(89);
       
    }
}
