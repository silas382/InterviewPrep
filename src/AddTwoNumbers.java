//You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
//
//You may assume the two numbers do not contain any leading zero, except the number 0 itself.
//Leetcode 445 Add Two Numbers II

import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
       ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  // 29
  // 13
public class AddTwoNumbers {
    public static ListNode addTwoNums(ListNode l1, ListNode l2) {

        ListNode head = null;
        int carryDigit = 0;
        int sum = 0;
        Stack<Integer> stack1 = turnListIntoStack(l1);
        Stack<Integer> stack2 = turnListIntoStack(l2);

        while(!(stack1.isEmpty() || !stack2.isEmpty())){
            sum = carryDigit;

            if(!stack1.isEmpty()) {
                sum += stack1.pop();
            }
            if(!stack2.isEmpty()){
                sum += stack2.pop();
            }

            if(sum >= 10) {
                carryDigit = 1;
            }else{
                carryDigit = 0;
            }
            ListNode newNode  = new ListNode(sum % 10);
            newNode.next = head;
            head = head.next;


        }

            return head;
    }

    public static Stack<Integer> turnListIntoStack(ListNode node) {
        Stack<Integer> stack = new Stack<>();

        // we are using the stack data structure
        // this helper function helps generate a stack containing all the values in the linklist
        while(node!= null){
            stack.push(node.val);
            node = node.next;
        }

        return stack;
    }

}
