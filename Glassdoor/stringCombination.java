//given a string that consits of 0/1/? where ? can be a 0 or 1, return the number of possible combinations
private int stringCombination(String str) {
  int count = 0;
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == '?') {
      count ++;
    }
  }
  return Math.pow(2, count);
}

//same as above, but return all possible combinations
private ArrayList<String> getStrings(String str) {
  ArrayList<String> strings = new ArrayList<String>();
  int index = str.indexOf('?');
  if (index < 0) {
    strings.add(str);
  }
  else {
    String zero = str.subString(0, index) + "0" + str.subString(index + 1);
    String one = str.subString(0, index) + "1" + str.subString(index + 1);
    strings.addAll(getStrings(zero));
    strings.addAll(getStrings(one));
  }
  return strings;
}
