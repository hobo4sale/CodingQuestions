// Imagine you have a row of numbers like below(a traiangle) .By starting at the top of the triangle find the maximum number in each line and sum them up example below
// 5
// 9 6
// 4 6 8
// 8 7 15
//
// Answer I.e. 5+9+8+7 = 29
// write a code to find the maximum total from top to bottom. Assume triangle can have at most 100000 rows.

// Input Output specifications
// Input Specification
// A string of n numbers (where 0<=n<=10^10)
// eg.5#9#6#4#6#8#0#7#1#5
//
// Output Specification
// A sum of the max numbers in each line (as string ) or Output invalid in case of invalid input/triangle
//
// Examples
// eg1.
// Input :5#9#6#4#6#8#0#7#1#5
// Output:29
//
// eg 2 .
// Input :5#9#6#4#6#8#0#7#1
// Output:invalid
//
// eg 2 .
// Input :5#9##4#6#8#0#7#1
// Output:invalid
private int SumTriangle(String str) {
  String[] split = str.split("#");
  int rowLength = 1;
  int index = 0;
  int sum = 0;
  int currentMax = -1;
  while(index < split.length) {
    //make sure string has appropriate number of values
    if(index + rowLength > split.length) {
      return -1;
    }
    for(int i = index; i < rowLength + index; i++) {
        if(split[i] > currentMax) {
          currentMax = split[i];
        }
    }
    sum += currentMax;
    currentMax = -1;
    index += rowLength;
    rowLength++;
  }

}
