//weight is the max weight, wt[] holds the weights of the items and val[] holds the values
private void knapsack(int weight, int wt[], int val[]) {
  int results[][] = new int[wt.length+1][weight+1];

  for(int i = 1; i <= wt.length; i++) {
    for(int w = 1; i <= weight; w++) {
      if(wt[i-1] <= w) {
        results[i][w] = Math.max(val[i-1] + results[i-1][w-weight[i-1]], results[i-1][w])
      }
      else {
        results[i][w] = results[i-1][w];
      }
    }
  }
  return results[wt.length][weight];
}
