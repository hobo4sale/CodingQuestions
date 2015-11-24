public boolean rootNodes(Node start, Node end) {
  if(start == end) {
    return true;
  }
  Queue<Node> queue = new Queue<LinkedList>();
  queue.add(start);
  start.queued = true;

  Node current = queue.poll();
  while(current != null) {
    for(Node node : current.children) {
      if(node == end) {
        return true;
      }
      else {
        queue.add(node);
        node.queued = true;
      }
    }
    current = queue.poll();
  }
  return false;
}

public class Node
  public boolean queued;
  public String name;
  public Node[] children;
}
