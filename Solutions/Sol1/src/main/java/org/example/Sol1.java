package org.example;

/*
Sum of number less than 'num' and multiply 3 and 5
 */
public class Sol1 {

    public int solution(int num) {
        int temp = 0;

        for (int i = 0; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                temp += i;
            }
        }
        return temp;
    }
}
