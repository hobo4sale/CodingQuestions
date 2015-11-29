private int[] sumTwoArrays(int[] one, int[] two) {
  int[] longArray = one.size > two.size ? one : two;
  int[] shortArray = one.size < two.size ? one : two;

  int longPointer = one.size() -1;
  int shortPointer = two.size() -1;

  boolean carry = false;
  int sum = 0;
  while(longPointer >= 0) {
    if(shortPointer >= 0) {
      sum = longArray[longPointer] + shortArray[shortPointer];
    }
    else {
      sum = longArray[longPointer];
    }

    if(carry) {
      sum++;
    }
    if(sum >= 10) {
      carry = true;
      sum %= 10;
    }
    else {
      carry = false;
    }
    longArray[longPointer] = sum;
    longPointer--;
    shortPointer--;
  }

  return longArray;
}
