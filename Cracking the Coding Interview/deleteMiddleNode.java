private void deleteMiddleNode(Node mid) {
  if(mid == null || mid.next == null) {
    return;
  }
  mid.data = next.data;
  mid.next = next.next;
}
