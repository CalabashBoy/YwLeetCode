package list.removeDuplicates83;

import list.ListNode;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class RemoveDuplicate
{
    public static ListNode deleteDuplicates(ListNode head)
    {
        if (head == null)
        {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null)
        {
            if (cur.val == cur.next.val)
            {
                cur.next = cur.next.next;
            }
            else
            {
                cur = cur.next;
            }

        }

        return head;
    }
}
