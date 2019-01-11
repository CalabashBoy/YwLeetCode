package list.removeDuplicates82;

import list.ListNode;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class RemoveDuplicate2
{
    public static ListNode deleteDuplicates(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null)
        {
            if (cur.next.val == prev.next.val)
            {
                cur = cur.next.next;
                while (cur != null && cur.val == prev.next.val)
                {
                    cur = cur.next;
                }
                prev.next = cur;
            }
            else
            {
                prev = prev.next;
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args)
    {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(5);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode listNode = deleteDuplicates(n1);
        System.out.println(listNode.toString());
    }
}
