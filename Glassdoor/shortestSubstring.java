//given a long string s and short strings t1,t2,t3, find the shortest substring of s which contains t1,t2, and t3
private shortestSubtstring(String s, String t1, String t2, String t3) {
  ArrayList<Integer> t1Starts = getStartIndices(s, t1);
  ArrayList<Integer> t2Starts = getStartIndices(s, t2);
  ArrayList<Integer> t3Starts = getStartIndices(s, t3);

  int currentMin = Integer.MAX_VALUE;
  for(int i = 0; i < t1Starts.size(); i++) {
    for(int j = 0; j < t2Starts.size(); j++) {
      for(int k = 0; k < t2Start.size(); k++) {
        int t1 = t1Starts[i];
        int t2 = t2Starts[i];
        int t3 = t2Starts[i];
        
      }
    }
  }


}

private ArrayList<Integer> getStartIndices(String s, String sub) {
  int index = s.indexOf(sub);
  ArrayList<Integer> indices = new ArrayList<Integer>();
  while(index >= 0) {
    indices.add(index);
  }
  return indices;
}
