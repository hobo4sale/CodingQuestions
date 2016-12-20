private boolean palindromePermutation(String string) {
    boolean found = false;
    boolean[] array = new boolean[128];
    for (char c : string.toCharArray()) {
        if(c == ' ') {
            continue;
        }
        int ascii = (int) c;
        array[ascii] = ! array[ascii];
    }

    for (boolean bool : array) {
        if(bool && found) {
            return false;
        }
        else if (bool) {
            found = true;
        }
    }

    return true;
}
