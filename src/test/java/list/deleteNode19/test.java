package list.deleteNode19;

import list.ListNode;
import list.deleteNodeN19.DeleteNodeN19;
import org.junit.Test;

public class test {
  @Test
  public void test(){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(6);

    n1.next = n2;
    n2.next = n3;
    n3.next = null;

    DeleteNodeN19 deleteNodeN19 = new DeleteNodeN19();
    ListNode listNode = deleteNodeN19.removeNthFromEnd(n1, 2);

    System.out.println(listNode.toString());
  }
}
