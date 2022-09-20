package org.Revature;

public class digitTotal {
    public static int[] digitSum(int T, String[] S){
        int[] sum = new int[T];
        for (int i = 0; i < T;i++){
            char[] charArr = S[i].replaceAll("[A-Z,a-z]", "").toCharArray();
        for (int j = 0; j < charArr.length; j++) {
            if (Character.isDigit(charArr[j])) {
                sum[i] = sum[i] + Integer.parseInt(String.valueOf(charArr[j]));
            }
        }
}
        return sum;
}}
