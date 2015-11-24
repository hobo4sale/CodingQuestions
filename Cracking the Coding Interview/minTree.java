private Node minTree(int[] array) {
  Node node = null;
  if(array.length == 1) {
    return new Node(array[0]);
  }
  else if (array.length > 1) {
    node = new Node(array[array.length/2]);
    node.left = minTree(Arrays.copyOfRange(array, 0, array.length/2));
    node.right = minTree(Arrays.copyOfRange(array, array.length/2 + 1, array.length));
  }
  return node;
}
