public class queueStack {

  private Stack normal = new Stack();
  private Stack reverse = new Stack();

  public Node pop() {
    moveItems();
    return reverse.pop;
  }

  public Node peep() {
    moveItems();
    return reverse.peep;
  }

  public void push(int data) {
    normal.push(data);
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
