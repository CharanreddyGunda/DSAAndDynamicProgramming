package com.tekworks.day_6;

//148. Sort List
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
public class SortList {
  public ListNode sortList(ListNode head) {
      List<Integer> list = new ArrayList<>();
      ListNode temp = head;
      while(temp != null) {
          list.add(temp.val);
          temp = temp.next;
      }
      Collections.sort(list);
      temp = head;
      int index  = 0;
      while(temp != null) {
          temp.val = list.get(index++);
          temp = temp.next;
      }
      return head;
  }
}
