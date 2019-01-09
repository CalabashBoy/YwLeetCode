package list.middleNode876;

import list.ListNode;


/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 */
public class MiddleNode {
    /**
     * 输出到数组
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode [] A = new ListNode[100];

        int i = 0;
        while (head != null){
            A[i++] = head;
            head = head.next;
        }

        return A[i/2];
    }

    /**
     * slow fast指针
     * @param head
     * @return
     */
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
