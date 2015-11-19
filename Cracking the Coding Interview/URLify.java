private static void urlify(char[] array, int length) {
	int j = array.length -1;
	for(int i = length -1; i >= 0; i--) {
		if(array[i] == ' ' && i >= 2) {
			array[j] = '0';
			array[j-1] = '2';
			array[j-2] = '%';
			j -= 3;
		}
		else {
			array[j] = array[i];
			j--;
		}
	}
}