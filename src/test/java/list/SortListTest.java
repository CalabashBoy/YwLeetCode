package list;

import list.sortList148.SortList;
import org.junit.Test;

public class SortListTest {
    @Test
    public void test() {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(3);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(1);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = null;

        ListNode listNode = SortList.insertSort(n1);
        System.out.println(listNode.toString());
    }
}
