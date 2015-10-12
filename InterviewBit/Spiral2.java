/*Given an integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.

Example:

Given n = 3,

You should return the following matrix:
 [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ] 
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> generateMatrix(int a) {
        ArrayList<ArrayList<Integer>> spiral = new ArrayList<ArrayList<Integer>>();
        
        for(int i = 0; i < a; i ++) {
           ArrayList<Integer> temp = new ArrayList<Integer>();
           for(int j = 0; j < a; j ++) {
               temp.add(0);
           }
           spiral.add(temp);
        }
        int square = (int) Math.pow(a, 2);
        int currentDirection = 0;
        int rowLength = a;
        int currentRow = 0;
        int rowUpperBound = 0;
        int currentCol = 0;
        int colLength = a;
        int leftColBound = -1;
        for(int i = 1; i <= square; i ++) {
           spiral.get(currentRow).set(currentCol, i);
           switch(currentDirection) {
               case 0: 
                   currentCol ++;
                   if(currentCol >= colLength) {
                       colLength --;
                       currentRow ++;
                       currentCol --;
                       currentDirection = switchDirection(currentDirection);
                   }
                   break;
               case 1:
                   currentRow ++;
                   if(currentRow >= rowLength) {
                       currentRow --;
                       rowLength --;
                       currentCol --;
                       currentDirection = switchDirection(currentDirection);
                   }
                   break;
               case 2:
                   currentCol --;
                   if(currentCol == leftColBound) {
                       currentCol ++;
                       leftColBound ++;
                       currentRow --;
                       currentDirection = switchDirection(currentDirection);
                   }
                   break;
               case 3: 
                   currentRow--;
                   if(currentRow <= rowUpperBound) {
                       currentRow ++;
                        rowUpperBound ++;   
                        currentCol ++;
                        currentDirection = switchDirection(currentDirection);
                   }
                   break;
           }
        }
        return spiral;
    }
    //right, down, left, up
    public int switchDirection(int previousDirection) {
        return (previousDirection + 1) % 4;
    }
}


