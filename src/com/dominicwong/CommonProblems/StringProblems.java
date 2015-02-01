package com.dominicwong.CommonProblems;

import java.util.Arrays;

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

    public static boolean isAnagram(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }

        int[] strOneCharCounter = new int[128];
        int[] strTwoCharCounter = new int[128];

        for (int i = 0; i < strOne.length(); i++) {
            int charOneVal = strOne.charAt(i);
            strOneCharCounter[charOneVal]++;

            int charTwoVal = strTwo.charAt(i);
            strTwoCharCounter[charTwoVal]++;
        }

        if (Arrays.equals(strOneCharCounter, strTwoCharCounter)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isAnagramSolutionTwo(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }

        int[] charSet = new int[128];
        int strOneNumOfUniqueChars = 0;
        int strTwoNumOfUniqueChars = 0;

        for (int i = 0; i < strOne.length(); i++) {
            int val = strOne.charAt(i);
            charSet[val]++;
            if (charSet[val] == 1) {
                strOneNumOfUniqueChars++;
            }
        }

        for (int j = 0; j < strTwo.length(); j++) {
            int val = strTwo.charAt(j);
            if (charSet[val] == 0) {
                return false;
            }
            charSet[val]--;
            if (charSet[val] == 0) {
                strTwoNumOfUniqueChars++;
                if (strTwoNumOfUniqueChars == strOneNumOfUniqueChars) {
                    return j == strTwo.length() - 1;
                }

            }
        }

        return false;
    }
}
