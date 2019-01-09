package list;

import list.cycle141.CycleSolution;

import org.junit.Assert;
import org.junit.Test;

public class Cycle {
    @Test
    public void s2Test1() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        n5.next = null;

        CycleSolution cycleSolution = new CycleSolution();
        boolean b = cycleSolution.hasCycle(n1);
        Assert.assertFalse(!b);
    }

    @Test
    public void s2Test2() {
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

        CycleSolution cycleSolution = new CycleSolution();
        boolean b = cycleSolution.hasCycle(n1);
        Assert.assertFalse(b);
    }
}
