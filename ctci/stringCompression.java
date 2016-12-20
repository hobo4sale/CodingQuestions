private String stringCompression(String string) {
    int index = 0;
    StringBuilder builder = new StringBuilder();
    while(index < string.length()) {
        char c = string.charAt(index);
        char next = string.charAt(index);
        int count = 0;
        while(c == next && index < string.length()) {
            index++;
            count++;
            if (index < string.length()) {
                next = string.charAt(index);
            }
        }
        builder.append(c);
        builder.append(count);
    }
    if (builder.length() < string.length()) {
        return builder.toString();
    }
    else {
        return string;
    }
}
