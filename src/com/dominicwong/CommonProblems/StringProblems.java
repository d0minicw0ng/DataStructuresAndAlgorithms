package com.dominicwong.CommonProblems;

/**
 * Created by dominicwong on 31/1/15.
 */
public class StringProblems {
    public static boolean hasUniqueCharsQuadratic(String str) {
        if (str.length() > 128) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (i == j) {
                    continue;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasUniqueCharsLinear(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] charAppearances = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (charAppearances[val] == true) {
                return false;
            }
            charAppearances[val] = true;
        }
        return true;
    }
}
