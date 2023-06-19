package dev.dagore.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private final Map<Character, Integer> symbols = new HashMap<Character, Integer>() {{
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }};
    
    public int romanToInt(String s) {
      char[] charsFromInput = s.toCharArray();
      int lastCharValue = 1000;
      int result = 0;

      for (int i = 0; i < charsFromInput.length; i++) {
        char currentChar = charsFromInput[i];
        int currentCharValue = symbols.getOrDefault(currentChar, 0);
          
        if (lastCharValue < currentCharValue) {
          result += (currentCharValue - lastCharValue * 2);
        } else {
          result += currentCharValue;
        }

        lastCharValue = currentCharValue;
      }

      return result;
    }
}
