package list.deleteNodeN19;

import list.ListNode;

public class DeleteNodeN19 {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    if (head == null)
      return null;

    if (n < 0)
      return head;

    ListNode cur = head;
    ListNode prev = head;

    int i = 0;
    while (i < n && cur != null){
      i++;
      cur = cur.next;
    }

    if (cur == null){
      head = head.next;
      return head;
    }

    while(cur.next != null){
      cur = cur.next;
      prev=prev.next;
    }

    prev.next = prev.next.next;

    return head;
  }
}
