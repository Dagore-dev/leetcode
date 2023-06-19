package dev.dagore.leetcode;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;
    char currentLeft, currentRight;

    while (i <= j) {
      currentLeft = s.charAt(i);
      currentRight = s.charAt(j);
      
      if (!Character.isLetterOrDigit(currentLeft)) {
        i++;
      } else if (!Character.isLetterOrDigit(currentRight)) {
        j--;
      } else {
        if (Character.toLowerCase(currentLeft) != Character.toLowerCase(currentRight)) {
          return false;
        }
        i++;
        j--;
      }
    }

    return true;
  }
}
