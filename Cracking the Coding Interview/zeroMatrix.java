private void zeroMatrix(int[][] matrix) {
  boolean rowHasZero = false
  boolean colHasZero = false;

  //check if first row has a zero
  for(int i = 0; i < matrix.length; i++) {
    if(matrix[0][i] == 0) {
      rowHasZero = true;
      break;
    }
  }

  //check if first column has a zero
    for(int i = 0; i < matrix[0].length; i++) {
      if(matrix[i][0] == 0) {
        colHasZero = true;
        break;
      }
    }

  //find all zeroes
  for(int i = 1; i < matrix.length; i++) {
    for(int j = 1; j < matrix[0].length; j++) {
      if(matrix[i][j] == 0) {
        matrix[i][0] = 0;
        matrix[0][j] = 0;
      }
    }
  }

  //set all the 0 rows
  for(int i = 1; i < matrix.length; i++) {
    if(matrix[i][0] == 0) {
      setRowZeroes(matrix, i);
    }
  }

  //set all the 0 columns
  for(int i = 1; i < matrix[0].length; i++) {
    if(matrix[0][i] == 0) {
      setColZeroes(matrix, i);
    }
  }

  //set first row if need be
  if(rowHasZero) {
    setRowZeroes(matrix, 0);
  }
  
  //set first columm if need be
  if(colHasZero) {
    setColZeroes(matrix, 0);
  }

}

private void setRowZeroes(int[][] matrix, int row) {
  for(int i = 0; i < matrix[row].length; i++) {
    matrix[row][i] = 0;
  }
}

private void setColZeroes(int[][] matrix, int col) {
  for(int i = 0; i < matrix.length; i++) {
    matrix[i][col] = 0;
  }
}
