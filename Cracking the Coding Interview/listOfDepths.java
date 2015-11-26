private ArrayList<LinkedList> listOfDepths(Node root) {
  if(root == null) {
    return null;
  }

  ArrayList<LinkedList> lists = new ArrayList<LinkedList>();

  LinkedList linkedList = new LinkedList();

  listOne.add(root);
  return listOfDepths(lists, linkedList);
}

private ArrayList<LinkedList> listOfDepths(ArrayList<LinkedLst> lists, LinkedList linkedList) {
  if(linkedList.head == null) {
    return lists;
  }
  else {
    lists.add(linkedList);
    LinkedList newList = new LinkedList();
    Node current = linkedList.head;
    while(current != null) {
      if(curret.left != null) {
        newList.add(current.left);
      }
      if(current.right != null) {
        newList.add(current.right);
      }
      current = current.next;
    }
    return listOfDepths(lists, newList);
  }
}
