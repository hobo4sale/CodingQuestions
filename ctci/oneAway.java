private boolean oneAway(String one, String two) {
	String s1 = "";
	String s2 = "";
	if(one.equals(two)) {
		return true;
	}
	else if(Math.abs(one.length() - two.length()) > 1) {
		return false;
	}
	else {
		s1 = one.length() > two.length() ? one : two;
		s2 = one.length() < two.length() ? one : two;
	}
	return compareStrings(s1, s2);
}

private boolean compareStrings(String big, String small) {
	boolean toggle = false;
	int bigIndex = 0;
	for(int i = 0; i < small.length(); i++) {
		if(big.charAt(bigIndex) != small.charAt(i)) {
			if(toggle) {
				return false;
			}
			else {
				toggle = !toggle;
				i--;
			}
		}
		bigIndex++;
	}
	return true;
}
