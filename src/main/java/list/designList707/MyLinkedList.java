package list.designList707;

class MyLinkedList {

  MyLinkedList prev;
  MyLinkedList next;
  int val;

  /** Initialize your data structure here. */
  public MyLinkedList() {
    prev = null;
    next = null;
  }

  /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
  public int get(int index) {
     int i = 0;
     MyLinkedList p = this;
     while (i < index){
       i++;
       p = p.next;

       if (p == null){
         return -1;
       }
     }

     return p.val;
  }

  /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
  public void addAtHead(int val) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.val = val;

    this.prev = myLinkedList;
    myLinkedList.next = this;

  }

  /** Append a node of value val to the last element of the linked list. */
  public void addAtTail(int val) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.val = val;

    this.next = myLinkedList;
    myLinkedList.prev = this;
  }

  /** Add a node of value val before the index-th node in the linked list.
   * If index equals to the length of linked list,
   * the node will be appended to the end of linked list.
   * If index is greater than the length, the node will not be inserted. */
  public void addAtIndex(int index, int val) {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.val = val;

    MyLinkedList p = this;

    int i = 0;
    while (i < index - 1){
      i++;
      p = p.next;
      if (p == null)
        return;
    }

    p.next = myLinkedList;
    myLinkedList.prev = p;
  }

  /** Delete the index-th node in the linked list, if the index is valid. */
  public void deleteAtIndex(int index) {
    int i = 0;
    MyLinkedList p = this;
    while (i < index){
      i++;
      p = p.next;
      if (p == null)
        return;
    }

    p.next.prev = p.prev;
    p.prev.next = p.next;
  }

  public static void main(String[] args) {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(1);
    linkedList.addAtTail(3);
    linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
    linkedList.get(1);            //返回2
    linkedList.deleteAtIndex(1);  //现在链表是1-> 3
    linkedList.get(1);            //返回3
  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */