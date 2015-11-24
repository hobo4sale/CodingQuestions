public class queueStack {

  private Stack<Integer> normal = new Stack<Integer>();
  private Stack<Integer> reverse = new Stack<Integer>();

  public Node pop() {
    moveItems();
    return reverse.pop;
  }

  public Node peep() {
    moveItems();
    return reverse.peep;
  }

  public void push(int data) {
    normal.push(new Node(data));
  }

  public boolean isEmpty() {
    return (normal.isEmpty() && reverse.isEmpty());
  }

  private void moveItems() {
    if(reverse.isEmpty()) {
      while(!normal.isEmpty()) {
        reverse.push(normal.pop);
      }
    }
  }

}
