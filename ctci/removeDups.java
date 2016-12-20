private void removeDups(Node head) {
  HashSet<Integer> set = new HashSet<Integer>();
  Node previous = null;
  while(head != null) {
    if(set.contains(head.data)) {
      previous.next = head.next;
    }
    else {
      set.add(head.data);
      previous = head;
    }
    head = head.next;
  }
}
