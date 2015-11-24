public class SetOfStacks() {
  private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
  private int max;
  private int currentStackSize;

  public SetOfStacks(int max) {
    this.max = max;
  }

  public Node pop() {
    Stack stack = stacks.get(stacks.size() - 1);
    stack.pop();
  }

  public void push(int data) {
    if(currentStackSize == max) {
      Stack stack = new Stack<Integer>()
      stack.push(new Node(data));
    }
    else {
      Stack stack = stacks.get(stacks.size() - 1);
      stack.push(new Node(data));
      stacks.add(stack);
    }
  }

  public Node peek() {
    if(!stacks.isEmpty()) {
      return stacks.get(stacks.size() - 1).peek();
    }
  }

  public boolean isEmpty() {
    return stacks.isEmpty();
  }
}
