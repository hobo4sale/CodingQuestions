private int shiftedArray(int[] array, int x) {
     int start = 0;
     int end = array.length - 1;
     int inflectionPoint = -1;
     while(start <= end) {
        mid = (start + end) /2;
        if(array[mid] > array[mid+1]) {
        }
        else if(array[mid] > array[start]) {
           start = mid + 1;
        }
        else {
           end = mid - 1;

        }
     }

     if (array[inflectionPoint] > x) {
           return Arrays.binarySearch(array, 0, inflectionPoint, x);
     }
     else if (arrays[inflectionPoint] < x) {
           return Arrays.binarySearch(array, inflectionPoint, arrays.length -1, x);
     }
     else {
        return inflectionPoint;
     }
  }
