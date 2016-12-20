private void rotateMatrix(int[][] matrix, int n) {
  for(int i = 0; i < n / 2; i++) {
    int first = i;
    int last = n - 1 - i;
    for(int j = first; j < last; j++) {
      int offset = i - j;
      //save top to temp var
      int top = matrix[first][j];

      //left to top
      matrix[first][j] = matrix[last-offset][first];

      //bottom to left
      matrix[last-offset][first] = matrix[last][last-offset];

      //right to bottom
      matrix[last][last-offset] = matrix[i][last];

      //top to right
      matrix[i][last] = top;
    }
  }

}
