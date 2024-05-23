class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(); // Dummy head to simplify handling edge cases
        ListNode temp3 = dummyHead; // Pointer for the result list
        ListNode temp1 = l1; // Pointer for list l1
        ListNode temp2 = l2; // Pointer for list l2
        int carry = 0; // Initialize carry to 0

        // Iterate through both input linked lists simultaneously
        while (temp1 != null || temp2 != null) {
            int sum = carry; // Initialize sum with the carry from the previous iteration

            // Add value from l1 if it exists
            if (temp1 != null) {
                sum += temp1.val;
                temp1 = temp1.next;
            }

            // Add value from l2 if it exists
            if (temp2 != null) {
                sum += temp2.val;
                temp2 = temp2.next;
            }

            carry = sum / 10; // Update carry for the next iteration
            temp3.next = new ListNode(sum % 10); // Add a new node with the least significant digit of sum
            temp3 = temp3.next; // Move to the next node in the result list
        }
        
        // Add a new node for the carry if it's not zero
        if (carry > 0) {
            temp3.next = new ListNode(carry);
        }
        
        return dummyHead.next; // Return the next node of dummyHead, which is the head of the result list
    }
}

public class Main1{
    public static void main(String[] args) {
        // Create linked list for number 342: 2 -> 4 -> 3
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create linked list for number 465: 5 -> 6 -> 4
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two numbers
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
