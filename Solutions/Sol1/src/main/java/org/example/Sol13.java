package org.example;
/*
    target = numbers[x] + numbers[y]
 */
public class Sol13 {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]==target-numbers[i]){
                    return result=new int[]{j, i};
                }
            }
        }

        return result;
    }
}
