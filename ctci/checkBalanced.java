private boolean checkBalanced(Node root) {
  if(checkHeieght(root) == 1) {
    return false;
  }
  else {
    return true;
  }

}

private int checkHeight(Node root) {
  if(root == null) {
    return 0;
  }
  
  int leftHeight = checkHeight(root.left);
  if(leftHeight == -1) {
    return -1;
  }

  int rightHeight = checkHeight(root.right);
  if(rightHeight == -1) {
    return -1;
  }

  int diff = leftHeight - rightHeight;
  if(Math.abs(diff) > 1) {
    return -1;
  }
  else {
    return Math.max(leftHeight, rightHeight) + 1;
  }
}
