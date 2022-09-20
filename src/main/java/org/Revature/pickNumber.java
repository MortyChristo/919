package org.Revature;

import java.util.Arrays;

public class pickNumber {


    public static int[] pickMiddleNumber(int n, int[][] num) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int[] sortedNums = Arrays.stream(num[i]).sorted().toArray();
            result[i] = sortedNums[1];
//            System.out.println(result[i]);
        }
       return result;
    }
}
