private Node kthLastNode(Node head, int k) {
  Node runner = head;
  int runnerCount = 0;
  while(runner!= null && runnerCount < k) {
    runner = runner.next;
    runnerCount++;
  }
  if(runnerCount!= k) {
    return null;
  }
  else {
    while(runner != null) {
      runner = runner.next;
      head = head.next;
    }
  }
  return head;
}
