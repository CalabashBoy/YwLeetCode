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

    private static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        ListNode newHead = new ListNode(0);
        ListNode p = newHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 == null)
            p.next = l2;

        if (l2 == null)
            p.next = l1;

        return newHead.next;
    }

    /**
     * 归并排序
     * @param head
     * @return
     */
    public static ListNode sortListMerge(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode middle = null;

        while (fast != null && fast.next != null) {
            middle = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        middle.next = null;

        ListNode l1 = sortListMerge(head);
        ListNode l2 = sortListMerge(slow);

        return merge(l1, l2);
    }
}
