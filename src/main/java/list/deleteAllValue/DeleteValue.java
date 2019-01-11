package list.deleteAllValue;

import list.ListNode;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class DeleteValue {

  public static ListNode deleteValue(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    ListNode newHead = new ListNode(0);
    ListNode cur = head.next;
    ListNode prev = head;

    ListNode p = newHead;

    while (prev != null) {
      if (prev.val != val) {
        prev.next = p.next;
        p.next = prev;

        p = p.next;
      }

      prev = cur;
      if (cur != null) {
        cur = cur.next;
      }
    }

    return newHead.next;
  }

  public static void main(String[] args) {

  }
}
