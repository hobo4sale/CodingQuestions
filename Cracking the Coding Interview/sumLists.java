private Node sumLists(Node one, Node two) {
  if(one == null || two == null) {
    if(one == null) {
      return two;
    }
    else if(two == null) {
      return one;
    }
  }

  int sum = one.data + two.data;
  boolean carry = false
  if(sum > 9) {
    sum %= 10;
    carry = true;
  }
  Node head = new Node(sum);
  Node current = head;
  while(one != null || two != null) {
    Node newNode = null;
    sum = 0;
    if(one != null) {
      sum += one.data;
    }
    if(two != null) {
      sum += two.data
    }
    if(carry) {
      sum += 1;
    }
    if(sum > 9) {
      sum %= 10;
      carry = true;
    }
    else {
      carry = false;
    }
    newNode = new Node(sum);
    current.next = newNode;
    current = newNode;

    one == null ? null : one.next;
    two == null ? null : two.next;
    
  }
  return head;
}

private Node sumLists2(Node one, Node two) {

}
