/*
Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]
*/


public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    ArrayList<ArrayList<Integer>> total = new ArrayList<ArrayList<Integer>>();
	    if(a < 1) {
	        return total;
	    }
	    ArrayList<Integer> temp = new ArrayList<Integer>();
	    temp.add(1);
	    total.add(temp);
	    
	    for(int i = 0; i < a-1; i ++) {
            ArrayList<Integer> current = new ArrayList<Integer>();
            if(i == 0) {
                current.add(1);
                current.add(1);
            } else{
                current.add(1);
                int before = 1, now;
                for(int j = 1; j < total.get(i).size(); j ++) {
                    now = total.get(i).get(j);
                    current.add(before + now);
                    before = now;
                }
                current.add(1);
            }
              total.add(current);
            
	    }
	    
	    
	    return total;
	}
}
