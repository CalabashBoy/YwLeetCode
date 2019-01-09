package list;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void print() {
        ListNode next = this.next.next;
        while (next != null) {
            next = this.next.next;
            System.out.println(val);
        }
    }
}