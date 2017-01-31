private int triple(int[] array) {
    int firstMax = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    int thirdMax = Integer.MIN_VALUE;

    int firstMin =  Integer.MAX_VALUE;
    int secondMin = Integer.MAX_VALUE;

    for(int i = 0; i <array.length; i++) {
        if (array[i] > firstMax) {
            firstMax = array[i];
            secondMax = firstMax;
            thirdMax =  thirdMax;
        }
        else if (array[i] > secondMax) {
            secondMax = array[i];
            thirdMax = secondMax;
        }
        else if (array[i] > thirdMax) {
            thirdMax = array[i];
        }

        if (array[i] < firstMin) {
            firstMin = array[i];
            secondMin = firstMin;
        }
        else if (array[i] < secondMin) {
            secondMin = array[i];
        }
    }

    return Math.max(firstMax * secondMax * thirdMax, firstMin * secondMin * firstMax);
}

