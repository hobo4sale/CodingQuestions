/*

Given an index k, return the kth row of the Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Input : k = 3

Return : [1,3,3,1]
*/


public class Solution {
	public ArrayList<Integer> getRow(int a) {
	    ArrayList<Integer> pascal = new ArrayList<Integer>();
	    pascal.add(1);
	    if(a == 0) {
	        return pascal;
	    }
	    pascal.add(1);
	    if(a == 1) {
	        return pascal;
	    }
	    for(int j = 0; j < a - 1; j ++) {
	         ArrayList<Integer> temp = new ArrayList<Integer>();
    	    for(int i = 0; i < pascal.size() - 1; i ++) {
    	        if(i == 0) {
    	            temp.add(1);
    	        }
    	        temp.add(pascal.get(i) + pascal.get(i + 1));
    	        if(i == pascal.size() - 2) {
    	            temp.add(1);
    	        }
    	    }
    	    pascal = temp;
	    }
	    return pascal;
	}
}
