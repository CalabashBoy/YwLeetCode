package list.cycle;

import list.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 141 链表中环的监测
 */
public class CycleSolution {
    //时间 空间复杂度都是o(n)
    public boolean hasCycle(ListNode head) {
        Set<ListNode> sets = new HashSet<ListNode>();

        ListNode cur = head;

        while (cur != null) {
            if (!sets.contains(cur)) {
                sets.add(cur);
            } else {
                return true;
            }
            cur = cur.next;
        }

        return false;
    }

    //时间 o(n) 空间复杂度o(1)
    public boolean hasCycleOther(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {

            if (fast.next == null)
                return false;

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
