package org.example;


/*
next sqrt
 */
public class Sol8 {
    public static long findNextSquare(long sq) {

        double temp = (double) Math.sqrt(sq);
        if ((temp * 10) % 10 != 0) {
            return -1;
        }
        temp++;
        double nextSq = temp * temp;
        return (long) nextSq;
    }
}
