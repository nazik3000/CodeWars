package org.example;

/*
The function will be given two parameters. Each parameter will be a string of
multiple integers separated by a single space.
Each string will contain the count of each race on the side of good and evil.

Good:

Hobbits: 1
Men: 2
Elves: 3
Dwarves: 3
Eagles: 4
Wizards: 10

Evil:


Orcs: 1
Men: 2
Wargs: 2
Goblins: 2
Uruk Hai: 3
Trolls: 5
Wizards: 10
 */
public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        String[] goodArr = goodAmounts.split(" ");
        String[] evilArr = evilAmounts.split(" ");
        int goodCount = 0, evilCount = 0;

        for (int i = 0; i < goodArr.length; i++) {
            switch (i) {
                case 0 -> goodCount += Integer.parseInt(goodArr[i]);
                case 1 -> goodCount += (Integer.parseInt(goodArr[i]) * 2);
                case 2, 3 -> goodCount += (Integer.parseInt(goodArr[i]) * 3);
                case 4 -> goodCount += (Integer.parseInt(goodArr[i]) * 4);
                case 5 -> goodCount += (Integer.parseInt(goodArr[i]) * 10);
            }
        }
        for (int i = 0; i < evilArr.length; i++) {
            switch (i) {
                case 0 -> evilCount += Integer.parseInt(evilArr[i]);
                case 1, 2, 3 -> evilCount += (Integer.parseInt(evilArr[i]) * 2);
                case 4 -> evilCount += (Integer.parseInt(evilArr[i]) * 3);
                case 5 -> evilCount += (Integer.parseInt(evilArr[i]) * 5);
                case 6 -> evilCount += (Integer.parseInt(evilArr[i]) * 10);
            }
        }
        String s = "Battle Result: No victor on this battle field";
        if (goodCount > evilCount) {
            s = "Battle Result: Good triumphs over Evil";
        }
        if (evilCount > goodCount) {
            s = "Battle Result: Evil eradicates all trace of Good";
        }
        return s;
    }
}
