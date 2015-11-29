private Node successor(Node node) {
  if(node.right != null) {
    return getLeftMostNode(node.right);
  }
  else {
    Node parent = node.parent;
    Node current = node;
    while(parent != null && parent.left != current) {
      current = parent;
      parent = parent.parent;
    }
    return parent;
  }
}

private Node getLeftMostNode(Node node) {
  if (node == null) {
    return null;
  }
  while(node.left != null) {
    node = node.left;
  }
  return node;
}
