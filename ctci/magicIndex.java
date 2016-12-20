private int magicIndex(int[] array) {
  return magicIndex(array, 0, array.length - 1);
}

private int magicIndex(int[] array, int start, int end) {
  if(end < start) {
    return -1;
  }
  int mid = (start + end) / 2;
  if(array[mid] == mid) {
    return mid;
  }
  else if(array[mid] < mid) {
    return magicIndex(array, mid + 1, end);
  }
  else {
    return magicIndex(array, 0, mid - 1);
  }
}

private int magicDuplicates(int[] array) {
  return magicDuplicates(array, 0, array.length - 1);
}

private int magicDuplicates(int[] array, int start, int end) {
  if(end < start) {
    return -1;
  }

  int mid = (start + end) / 2;
  if (array[mid] == mid) {
    return mid;
  }

  int leftIndex = Math.min(mid - 1, array[mid]);
  int left = magicDuplicates(array, start, leftIndex);
  if(left >= 0) {
    return left;
  }

  int rightIndex = Math.max(mid + 1, array[mid]);
  int right = magicDuplicates(array, rightIndex, end);
  return right;

}
