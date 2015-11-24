public class MinStack {

  private class Node {
    private int data;
    private Node min;
    private Node next;

    public Node (int data) {
      this.data = data;
    }
  }

  public Node top;

  public Node pop() {
    if (top != null) {
      Node temp = top;
      top = top.next;
      return temp;
    }
    else {
      throw new EmptyStackException();
    }
  }

  public Node push(int data) {
    Node newNode = new Node(data);
    if(top != null && top.min.data < data) {
      newNode.min = top.min;
    }
    else {
      newNode.min = newNode;
    }
    newNode.next = top;
    top = newNode;
  }

  public Node peek() {
    if (top != null) {
      return top;
    }
    else {
      throw new EmptyStackException();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }

  public Node getMin() {
    if(top != null) {
      return top.min;
    }
    else {
      throw new EmptyStackException();
    }
  }

}
