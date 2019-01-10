package list.sortList148;

import list.ListNode;

/**
 * 148. Sort List
 */
public class SortList {
    //插入排序
    public static ListNode insertSort(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = new ListNode(0);
        ListNode cur = head;
        ListNode next;
        ListNode prev = newHead;

        while (cur != null) {
            next = cur.next;

            while (prev.next != null && prev.next.getVal() < cur.getVal()) {
                prev = prev.next;
            }

            cur.next = prev.next;
            prev.next = cur;

            prev = newHead;
            cur = next;
        }

        return newHead.next;
    }
}
