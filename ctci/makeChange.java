private static int makeChange(int n) {
    return makeChange(n, new int[n+1]);
}

private static int makeChange(int n, int[] array) {
    if(n < 0) {
        return 0;
    }
    else if (n == 0) {
        return 1;
    }
    else if (array[n] != 0) {
        return array[n];
    }
    else {
        int ways = makeChange(n-1, array) + makeChange(n-5, array)
        + makeChange(n-10, array) + makeChange(n-25, array);
        array[n] = ways;
        return ways;
    }
}
