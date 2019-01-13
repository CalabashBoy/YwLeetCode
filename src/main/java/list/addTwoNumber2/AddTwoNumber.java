package list.addTwoNumber2;

import list.ListNode;
import list.reverse206.Solution;

public class AddTwoNumber {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    if (l1 == null) {
      return l2;
    }

    if (l2 == null) {
      return l1;
    }

    ListNode dumpy = new ListNode(0);
    ListNode p = dumpy;


    int sum = 0;
    int jinwei = 0;

    while (l1 != null && l2 != null) {
      sum = (l1.val + l2.val) + jinwei;
      jinwei = (sum) / 10;

      ListNode listNode = new ListNode(sum%10);
      p.next = listNode;


      p = p.next;
      l1 = l1.next;
      l2 = l2.next;
    }

    if (l1 != null) {
      p.next = l1;
    }

    if (l2 != null) {
      p.next = l2;
    }

    if (jinwei > 0){
      while (p.next != null)
      {
        sum = p.next.val + jinwei;
        p.next.val = sum % 10;
        jinwei = sum / 10;
        p = p.next;
      }
    }

    if (jinwei > 0){
      p.next = new ListNode(1);
    }

    return dumpy.next;
  }

}
