package org.example;

/*
Find the unique number in array
 */
public class Sol2 {

    public static double findUniq(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i] && arr[i] != arr[j]) {
                    return arr[i];
                }
            }
        }
        return 1;
    }
}

