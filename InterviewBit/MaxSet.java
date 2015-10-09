// Find out the maximum sub-array of non negative numbers from an array.
// The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

// Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

// Example:

// A : [1, 2, 5, -7, 2, 3]
// The two sub-arrays are [1, 2, 5] [2, 3].
// The answer is [1, 2, 5] as its sum is larger than [2, 3]



public class Solution {
	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
	    int start = 0;
	    int end = -1;
	    int currentStart = 0;
	    long currentSum = 0;
	    long maxSum = 0;
	    for(int i = 0; i < a.size(); i++) {
	        if(a.get(i) >= 0) {
	            currentSum += (long) a.get(i);
	            if (currentSum > maxSum) {
	                maxSum = (long) currentSum;
	                end = i;
	                start = currentStart;
	            }
	            else if (currentSum == maxSum) {
	                if ((i - currentStart) > (end - start)) {
	                    start = currentStart;
	                    end = i;
	                }
	            }
	        }
	        else {
	             currentSum = 0;
	             currentStart = i +1;
	        }
	        
	    }
	    if (end == -1) {
	        return new ArrayList<Integer>();
	    }
	    return new ArrayList<Integer>(a.subList(start,end+1));
	}
}
