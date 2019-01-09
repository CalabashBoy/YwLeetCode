package list;


import list.reverse.Solution;
import org.junit.Test;

public class ReverseTest {

    @Test
    public void s1Test1() {
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

        Solution solution = new Solution();
        //solution.print(n1);

        ListNode listNode = solution.reverseList1(n1);
        solution.print(listNode);
    }

    @Test
    public void s1Test2() {
        ListNode n1 = new ListNode(1);

        n1.next = null;

        Solution solution = new Solution();
        solution.print(n1);

        ListNode listNode = solution.reverseList1(n1);
        solution.print(listNode);
    }

    @Test
    public void s1Test3() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = null;

        Solution solution = new Solution();
        solution.print(n1);

        ListNode listNode = solution.reverseList1(n1);
        solution.print(listNode);
    }

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
        n4.next = n5;
        n5.next = null;

        Solution solution = new Solution();
        //solution.print(n1);

        ListNode listNode = solution.reverseList2(n1);
        solution.print(listNode);
    }

    @Test
    public void s2Test2() {
        ListNode n1 = new ListNode(1);

        n1.next = null;

        Solution solution = new Solution();
        solution.print(n1);

        ListNode listNode = solution.reverseList2(n1);
        solution.print(listNode);
    }

    @Test
    public void s2Test3() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = null;

        Solution solution = new Solution();
        solution.print(n1);

        ListNode listNode = solution.reverseList2(n1);
        solution.print(listNode);
    }
}
