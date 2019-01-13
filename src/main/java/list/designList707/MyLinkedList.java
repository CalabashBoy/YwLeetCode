package list.designList707;


class MyLinkedList {

  MyLinkedList next;
  int val;
  int size = 0;

  /**
   * Initialize your data structure here.
   */
  public MyLinkedList() {
    next = null;
  }

  /**
   * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
   */
  public int get(int index) {
    int i = 0;
    MyLinkedList p = this;

    while (i < index) {
      i++;
      p = p.next;
      if (p == null) {
        return -1;
      }
    }

    return p.val;
  }

  /**
   * Add a node of value val before the first element of the linked list. After the insertion, the
   * new node will be the first node of the linked list.
   */
  public void addAtHead(int val) {
    MyLinkedList myLinkedList = new MyLinkedList();

    if (this.size == 0)
    {
      this.val = val;
    }
    else {
      myLinkedList.val = this.val;

      this.val = val;
      myLinkedList.next = this.next;
      this.next = myLinkedList;
    }

    this.size++;
  }

  /**
   * Append a node of value val to the last element of the linked list.
   */
  public void addAtTail(int val) {
    if (this == null) {
      return;
    }

    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.val = val;

    MyLinkedList p = this;

    while (p.next != null) {
      p = p.next;
    }

    p.next = myLinkedList;
    size++;
  }

  /**
   * Add a node of value val before the index-th node in the linked list. If index equals to the
   * length of linked list, the node will be appended to the end of linked list. If index is greater
   * than the length, the node will not be inserted.
   */
  public void addAtIndex(int index, int val) {
    if (index < 0)
      return;

    if (index > size)
      return;

    if (index == 0)
      addAtHead(val);

    if (index == size)
    {
      addAtTail(val);
      return;
    }


    int i = 0;
    MyLinkedList p = this;
    while (i < index){
      i++;
      p = p.next;
    }


    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.val = p.val;

    p.val = val;

    myLinkedList.next = p.next;
    p.next = myLinkedList;
    size++;
  }

  /**
   * Delete the index-th node in the linked list, if the index is valid.
   */
  public void deleteAtIndex(int index) {
    if (index < 0)
      return;

    if (index > size)
      return;

    int i = 1;
    MyLinkedList p = this;

    while (i < index)
    {
      i++;
      p = p.next;
    }

    MyLinkedList temp = p.next;
    p.val = temp.val;
    p.next = temp.next;
    temp.next = null;
    size--;
  }


  public void print()
  {
    MyLinkedList p = this;
    StringBuilder sb = new StringBuilder();
    while (p != null)
    {
      sb.append(p.val);
      sb.append(" ");
      p=p.next;
    }

    System.out.println(sb.toString());
  }

  public static void main(String[] args) {
//    ["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
//[[],[1],[3],[1,2],[1],[1],[1]]
//    MyLinkedList linkedList = new MyLinkedList();
//    linkedList.addAtHead(1);
//    linkedList.addAtTail(3);
//    linkedList.addAtIndex(1,2);
//    linkedList.print();
//    linkedList.deleteAtIndex(1);
//    linkedList.get(1);

    MyLinkedList linkedList = new MyLinkedList();
    linkedList.addAtHead(5);//5
    linkedList.print();
    linkedList.addAtHead(2);// 25
    linkedList.print();
    linkedList.deleteAtIndex(1);//5
    linkedList.print();
    linkedList.addAtIndex(1,9);//9 5
    linkedList.print();
    linkedList.addAtHead(4);//4 9 5
    linkedList.print();
    linkedList.addAtHead(9);//9  4 9 5
    linkedList.print();
    linkedList.addAtHead(8);//8 9 4 9 5
    linkedList.print();
    linkedList.get(3);
    linkedList.addAtTail(1);//894951
    linkedList.print();
    linkedList.addAtIndex(3,6);//8964951
    linkedList.print();
    linkedList.addAtHead(3);//38964951
    linkedList.print();


  }
}

/**
 * Your MyLinkedList object will be instantiated and called as such: MyLinkedList obj = new
 * MyLinkedList(); int param_1 = obj.get(index); obj.addAtHead(val); obj.addAtTail(val);
 * obj.addAtIndex(index,val); obj.deleteAtIndex(index);
 */