package list.addTwoNumber2Test;

import list.ListNode;
import list.addTwoNumber2.AddTwoNumber;
import org.junit.Test;

public class test {

  @Test
  public void test1(){
    ListNode n1 = new ListNode(1);
    ListNode n2 = new ListNode(2);
    ListNode n3 = new ListNode(6);

    n1.next = n2;
    n2.next = n3;
    n3.next = null;

    ListNode k1 = new ListNode(1);
    ListNode k2 = new ListNode(2);
    ListNode k3 = new ListNode(6);
    ListNode k4 = new ListNode(4);

    k1.next = k2;
    k2.next = k3;
    k3.next = k4;
    k4.next = null;

    AddTwoNumber addTwoNumber = new AddTwoNumber();
    ListNode result = addTwoNumber.addTwoNumbers(n1,k1);

    System.out.println(result.toString());
  }

  @Test
  public void test2(){
    ListNode n1 = new ListNode(2);
    ListNode n2 = new ListNode(4);
    ListNode n3 = new ListNode(3);

    n1.next = n2;
    n2.next = n3;
    n3.next = null;

    ListNode k1 = new ListNode(5);
    ListNode k2 = new ListNode(6);
    ListNode k3 = new ListNode(4);


    k1.next = k2;
    k2.next = k3;
    k3.next = null;

    AddTwoNumber addTwoNumber = new AddTwoNumber();
    ListNode result = addTwoNumber.addTwoNumbers(n1,k1);

    System.out.println(result.toString());
  }

  @Test
  public void test3(){
    ListNode n1 = new ListNode(3);
    ListNode n2 = new ListNode(7);


    n1.next = n2;
    n2.next = null;

    ListNode k1 = new ListNode(9);
    ListNode k2 = new ListNode(2);


    k1.next = k2;
    k2.next = null;


    AddTwoNumber addTwoNumber = new AddTwoNumber();
    ListNode result = addTwoNumber.addTwoNumbers(n1,k1);

    System.out.println(result.toString());
  }
}
