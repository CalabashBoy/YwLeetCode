package list.reverse;


import list.ListNode;

/**
 * 206 反转链表
 */
public class Solution {
    /**
     * 直接反转
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    /**
     * 方法2
     * 从2 - n，依次插入到第一个元素后面
     * 最后把第一个元素移动到最后
     * todo 没做出来 这个方法不对
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return head;
        }

        if (head.next == null)
        {
            return head;
        }

        ListNode prev = head.next;
        ListNode cur = head.next.next;

        while (cur.next != null){
            head.next = cur;
            prev.next = cur.next;
            cur.next = prev;
            cur = prev.next;
            prev = head.next;
        }

        head.next = null;
        cur.next = head;

        return prev;
    }

    public void print(ListNode head) {
        ListNode next = head;

        while (next != null) {
            System.out.print(next.val + " ");
            next = next.next;
        }
    }
}
