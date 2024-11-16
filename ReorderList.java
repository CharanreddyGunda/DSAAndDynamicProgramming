package com.tekworks.day_6;

//143. Reorder List
/**
* Definition for singly-linked list.
* public class ListNode {
*     int val;
*     ListNode next;
*     ListNode() {}
*     ListNode(int val) { this.val = val; }
*     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
* }
*/
public class ReorderList {
  public void reorderList(ListNode head) {
      if (head == null || head.next == null) {
          return;
      }
      Stack<Integer> stack = new Stack<>();
      ListNode curr = head;
      
      while (curr != null) {
          stack.push(curr.val);
          curr = curr.next;
      }
      curr = head;
      int val = curr.val;
      int StackLen = stack.size();
      for(int i=0 ; i<=stack.size()/2 && curr.next != null  ; i++) {
          curr.val = val;
          val = curr.next.val;
          curr.next.val = stack.pop();
          curr = curr.next.next;
      }
      if(StackLen%2 != 0){
          curr.val = stack.pop();
      }
  }
}


