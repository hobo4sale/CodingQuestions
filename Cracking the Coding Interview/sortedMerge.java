private int[] sortedMerge(int[] a, int[] b, int lastA, int lastB) {
  int pointerA = lastA - 1;
  int pointerB = lastB - 1;
  int current = lastA + lastB - 1;
  while(pointerB >= 0) {
    if(pointerA >= 0 && a[pointerA] > b[pointerB]) {
      a[current] = a[pointerA];
      pointerA--;
    }
    else {
      a[current] = b[pointerB];
      pointerB--;
    }
    current--;
  }

}
