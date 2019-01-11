package list.intersectionTwoList160;

import list.ListNode;

import java.awt.*;

/**
 * @auther: y00349114
 * @version: 1.0
 * @since:
 */
public class IntersectionTwoList
{

    public static ListNode solution(ListNode a, ListNode b)
    {
        if (a == null || b == null)
        {
            return null;
        }

        ListNode endOfListA = a;

        while (endOfListA != null && endOfListA.next != null)
        {
            endOfListA = endOfListA.next;
        }

        endOfListA.next = b;

        ListNode cycle = findCycle(a);
        endOfListA.next = null;

        return cycle;
    }

    private static ListNode findCycle(ListNode head)
    {
        if (head == null)
        {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
            {
                return slow;
            }
        }

        return null;
    }
}
