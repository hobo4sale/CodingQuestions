private ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set) {
  ArrayList<ArrayList<Integer>> subSets = new ArrayList<Integer<Integer>>();
  return getSubSets(set, subSets);

}

private ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set, ArrayList<ArrayList<Integer>> subSets) {
  if(set.size == 0) {
    subSets.add(new ArrayList<Integer>());
    return subSets;
  }


  int lastNum = set.get(set.size()-1);
  set.remove(set.size()-1);
  ArrayList<ArrayList<Integer>> prevSubSet = getSubSets(set);

  for(ArrayList<Integer> list : prevSubSet) {
    list.add(lastNum);
  }
  return subSets;
}
