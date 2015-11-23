private Node partition(Node head, int x) {
  Node newHead = head;
  Node newTail = head;
  while(head!= null) {
    Node nextNode = head.next;
    if(nextNode.data < x) {
      nextNode.next = head;
      newHead = nextNode;
    }
    else {
      newTail.next = nextNode;
      tail = nextNode;
    }
    head = nextNode;
  }
  newTail.next = null;
  return newHead;
}
