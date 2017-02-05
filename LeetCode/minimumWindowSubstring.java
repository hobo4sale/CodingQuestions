public class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int counter = t.length();
        int start = 0;
        int end = 0;
        int minStart = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, ++count);
            }
            else {
                map.put(c,1);
            }
        }

        while(end < s.length()) {
            char c = s.charAt(end);
            if(map.containsKey(c)) {
                int count = map.get(c);
                if (count > 0) {
                    counter--;
                }
                map.put(c, --count);
            }

            while (counter == 0) {
                int length = end - start;
                if(length < minLength) {
                    minLength = length;
                    minStart = start;
                }
                c = s.charAt(start);
                if(map.containsKey(c)) {
                    int count = map.get(c);
                    map.put(c, ++count);
                    if (count > 0) {
                        counter++;
                    }
                }
                start++;

            }
            end++;
        }
        if (minLength != Integer.MAX_VALUE) {
            return s.substring(minStart, minStart + minLength + 1);
        }
        return "";
    }
}
