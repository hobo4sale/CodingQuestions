private boolean isUnique(String string) {
  BitSet bitSet = new BitSet(128);
  
  for(int i = 0; i < string.length; i++) {
    if(bitSet.get(string.charAt(i))) {
      return false;
    }
    else {
      bitSet.set(string.charAt(i));
    }
  }
  return true;
}
