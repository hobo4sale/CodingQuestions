 private boolean isPermutation(String a, String b) {
 	if(a.length() != b.length()) {
 		return false;
 	}

 	int[] array = new int[128];
 	for(int i = 0 ; i < a.length() ; i++) {
 		char c = a.charAt(i);
 		array[c]++;
 	}
 	for(int j = 0 ; j < b.length() ; j++) {
 		char c = b.charAt(j);
 		array[c]--;
 		if (array[c] < 0) {
 			return false;
 		}
 	}
 	return true;
 }
