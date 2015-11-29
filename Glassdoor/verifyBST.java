private boolean verifyBst(Node root) {
  return verifyBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
}

private boolean verifyBst(Node root, int min, int max) {
  if(root == null) {
    return true;
  }
  if(root.data > min && root.data < max && verifyBst(root.left, min, root.data) && verifyBst(root.right, root.data, max)) {
    return truep;
  }
  return false;
}

//solution 2
private boolean verifyBst(Node root) {
  ArrayList<Integer> values = new ArrayList<Integer>();
  addValues(root, values);

  int prev = 0;
  for(int i = 0; i < values.size(); i++) {
    if(values.get(i) < = prev) {
      return false;
    }
    prev = values.get(i);
  }
  return true;
}

private void addvalues(Node root, ArrayList<Integer> values) {
  if(root.left != null) {
    addvalues(root.left);
  }
  values.add(root.data);
  if(root.right != null) {
    addValues(root.right);
  }
}
