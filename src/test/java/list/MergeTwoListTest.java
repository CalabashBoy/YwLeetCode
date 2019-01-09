package list;

import list.mergeTwoList21.MergeTwoList;
import lombok.extern.java.Log;
import org.junit.Test;

@Log
public class MergeTwoListTest {
    @Test
    public void test(){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode k1 = new ListNode(1);
        ListNode k2 = new ListNode(2);
        ListNode k3 = new ListNode(3);
        ListNode k4 = new ListNode(4);
        ListNode k5 = new ListNode(5);

        k1.next = k2;
        k2.next = k3;
        k3.next = k4;
        k4.next = k5;
        k5.next = null;

        MergeTwoList mergeTwoList = new MergeTwoList();

        ListNode listNode = mergeTwoList.mergeTwoLists(n1, k1);
        log.info(listNode.toString());
    }
}
