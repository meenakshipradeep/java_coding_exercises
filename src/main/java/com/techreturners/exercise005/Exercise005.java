package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String input) {
        boolean[] alphaList = new boolean[26];
        int index = 0;
        boolean _isPangram = true;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
                index = input.charAt(i) - 'A';
            } else if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] == false)
                _isPangram = false;
        }

        return _isPangram;
    }


}
