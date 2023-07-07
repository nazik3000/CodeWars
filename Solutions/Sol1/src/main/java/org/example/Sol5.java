package org.example;

/*
If array had more even nums, then need to find odd's.
If array had more odd nums, then need to find even's.
 */
public class Sol5 {
    static int find(int[] integers) {

        int temp = 0, even = 0, odd = 0;

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                temp++;
                even = integers[i];
            } else
                odd = integers[i];
        }
        return (temp > 1) ? odd : even;
    }
}
