package org.example;

/*
In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 */
public class Sol7 {
    public static String makeComplement(String dna) {
        char[] chars = dna.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if(chars[i]=='A'){
                chars[i] = 'T';
            continue;
            }
            if(chars[i]=='T'){
                    chars[i] = 'A';
            continue;
            }
            if(chars[i]=='C'){
                chars[i] = 'G';
            continue;
            }
            if(chars[i]=='G'){
                chars[i] = 'C';

            }
        }

        return new String(chars);
    }
}
