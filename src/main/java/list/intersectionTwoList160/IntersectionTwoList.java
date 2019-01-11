package list.intersectionTwoList160;

import list.ListNode;

import java.awt.*;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class IntersectionTwoList {

  public static ListNode solution(ListNode a, ListNode b) {
    if (a == null || b == null) {
      return null;
    }

    ListNode endOfListA = a;

    while (endOfListA.next != null) {
      endOfListA = endOfListA.next;
    }

    endOfListA.next = b;

    ListNode cycle = findCycle(a);
    endOfListA.next = null;

    return cycle;
  }

  private static ListNode findCycle(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode slow = head;
    ListNode fast = head;


    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;

      if (slow == fast) {
        ListNode p =head;
        while (p != slow){
          p = p.next;
          slow = slow.next;
        }

        return p;
      }
    }

    return null;
  }

  public static void main(String[] args) {
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(3);
    ListNode n4 = new ListNode(4);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n2;

    findCycle(n1);
  }
}
