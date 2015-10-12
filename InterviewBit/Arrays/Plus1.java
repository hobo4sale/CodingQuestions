/*
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.
*/


import java.math.*;
public class Solution {
	public ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int [] original = new int [a.size()];
	    for(int i = 0; i < a.size(); i ++) {
	        original[i] = a.get(i);
	    }
	    boolean carry = false;
	    for(int j = a.size()-1; j > -1; j --) {
	        if(original[j] == 9) {
	            original[j] = 0;
	            carry = true;
	        } else{
	            carry = false;
	            original[j] = original[j] + 1;
	            break;
	        }
	    }
	    
	    ArrayList<Integer> ret = new ArrayList<Integer>();
	    if(carry) {
	        ret.add(1);
	    }
	    for(int i = 0; i < a.size(); i ++) {
	        ret.add(original[i]);
	    }
	    while(ret.get(0) == 0) {
	        ret.remove(0);
	    }
	   
	    
	    return ret;
	    
	}
}
